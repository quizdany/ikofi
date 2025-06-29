package com.yourname.budgetai.utils

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.provider.Telephony
import androidx.core.content.ContextCompat
import java.util.Date

object SMSUtils {
    
    fun hasSMSPermissions(context: Context): Boolean {
        return ContextCompat.checkSelfPermission(
            context,
            Manifest.permission.RECEIVE_SMS
        ) == PackageManager.PERMISSION_GRANTED &&
        ContextCompat.checkSelfPermission(
            context,
            Manifest.permission.READ_SMS
        ) == PackageManager.PERMISSION_GRANTED
    }
    
    fun getRequiredPermissions(): Array<String> {
        return arrayOf(
            Manifest.permission.RECEIVE_SMS,
            Manifest.permission.READ_SMS
        )
    }
    
    fun isMobileMoneySMS(smsText: String): Boolean {
        val mobileMoneyKeywords = listOf(
            "MTN", "Airtel", "Mobile Money", "MoMo",
            "received", "sent", "balance", "GHS"
        )
        
        return mobileMoneyKeywords.any { keyword ->
            smsText.contains(keyword, ignoreCase = true)
        }
    }
    
    fun readExistingSMS(context: Context, limit: Int = 100): List<Pair<String, Date>> {
        val smsList = mutableListOf<Pair<String, Date>>()
        
        try {
            val cursor: Cursor? = context.contentResolver.query(
                Telephony.Sms.CONTENT_URI,
                arrayOf(
                    Telephony.Sms.BODY,
                    Telephony.Sms.DATE
                ),
                null,
                null,
                "${Telephony.Sms.DATE} DESC LIMIT $limit"
            )
            
            cursor?.use { c ->
                val bodyIndex = c.getColumnIndex(Telephony.Sms.BODY)
                val dateIndex = c.getColumnIndex(Telephony.Sms.DATE)
                
                while (c.moveToNext()) {
                    val body = c.getString(bodyIndex)
                    val date = Date(c.getLong(dateIndex))
                    
                    if (isMobileMoneySMS(body)) {
                        smsList.add(Pair(body, date))
                    }
                }
            }
        } catch (e: Exception) {
            // Handle permission or other errors
        }
        
        return smsList
    }
    
    fun formatPhoneNumber(phoneNumber: String): String {
        // Remove any non-digit characters
        val digitsOnly = phoneNumber.replace(Regex("[^\\d]"), "")
        
        // Format Ghanaian numbers
        return when {
            digitsOnly.startsWith("233") && digitsOnly.length == 12 -> {
                // Already in international format
                digitsOnly
            }
            digitsOnly.startsWith("0") && digitsOnly.length == 10 -> {
                // Convert local format to international
                "233${digitsOnly.substring(1)}"
            }
            digitsOnly.length == 9 -> {
                // Add country code
                "233$digitsOnly"
            }
            else -> digitsOnly
        }
    }
} 