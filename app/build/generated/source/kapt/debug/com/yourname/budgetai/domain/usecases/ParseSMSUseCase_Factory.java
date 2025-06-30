package com.yourname.budgetai.domain.usecases;

import com.yourname.budgetai.data.database.TransactionDao;
import com.yourname.budgetai.domain.parsers.SMSParser;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ParseSMSUseCase_Factory implements Factory<ParseSMSUseCase> {
  private final Provider<SMSParser> smsParserProvider;

  private final Provider<TransactionDao> transactionDaoProvider;

  public ParseSMSUseCase_Factory(Provider<SMSParser> smsParserProvider,
      Provider<TransactionDao> transactionDaoProvider) {
    this.smsParserProvider = smsParserProvider;
    this.transactionDaoProvider = transactionDaoProvider;
  }

  @Override
  public ParseSMSUseCase get() {
    return newInstance(smsParserProvider.get(), transactionDaoProvider.get());
  }

  public static ParseSMSUseCase_Factory create(Provider<SMSParser> smsParserProvider,
      Provider<TransactionDao> transactionDaoProvider) {
    return new ParseSMSUseCase_Factory(smsParserProvider, transactionDaoProvider);
  }

  public static ParseSMSUseCase newInstance(SMSParser smsParser, TransactionDao transactionDao) {
    return new ParseSMSUseCase(smsParser, transactionDao);
  }
}
