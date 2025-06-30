package com.yourname.budgetai

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Telephony
import android.util.Log
import com.yourname.budgetai.domain.usecases.ParseSMSUseCase
import com.yourname.budgetai.utils.SMSUtils
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.EntryPointAccessors
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.Date

@EntryPoint
@InstallIn(SingletonComponent::class)
interface SmsReceiverEntryPoint {
    fun parseSMSUseCase(): ParseSMSUseCase
}

class SmsReceiver : BroadcastReceiver() {
    
    companion object {
        private const val TAG = "SmsReceiver"
    }
    
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Telephony.Sms.Intents.SMS_RECEIVED_ACTION) {
            val messages = Telephony.Sms.Intents.getMessagesFromIntent(intent)
            
            messages?.forEach { smsMessage ->
                val smsText = smsMessage.messageBody
                val timestamp = Date(smsMessage.timestampMillis)
                
                // Check if it's a mobile money SMS
                if (SMSUtils.isMobileMoneySMS(smsText)) {
                    Log.d(TAG, "Mobile money SMS detected: $smsText")
                    
                    // Parse and store the transaction
                    val entryPoint = EntryPointAccessors.fromApplication(
                        context.applicationContext,
                        SmsReceiverEntryPoint::class.java
                    )
                    val parseSMSUseCase = entryPoint.parseSMSUseCase()
                    CoroutineScope(Dispatchers.IO).launch {
                        try {
                            val success = parseSMSUseCase.execute(smsText, timestamp)
                            if (success) {
                                Log.d(TAG, "Transaction parsed and stored successfully")
                            } else {
                                Log.w(TAG, "Failed to parse SMS: $smsText")
                            }
                        } catch (e: Exception) {
                            Log.e(TAG, "Error parsing SMS", e)
                        }
                    }
                }
            }
        }
    }
} 