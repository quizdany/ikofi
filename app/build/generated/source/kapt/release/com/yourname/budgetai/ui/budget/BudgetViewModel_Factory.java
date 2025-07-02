package com.yourname.budgetai.ui.budget;

import com.yourname.budgetai.data.repository.BudgetRepository;
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
public final class BudgetViewModel_Factory implements Factory<BudgetViewModel> {
  private final Provider<BudgetRepository> repositoryProvider;

  public BudgetViewModel_Factory(Provider<BudgetRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public BudgetViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static BudgetViewModel_Factory create(Provider<BudgetRepository> repositoryProvider) {
    return new BudgetViewModel_Factory(repositoryProvider);
  }

  public static BudgetViewModel newInstance(BudgetRepository repository) {
    return new BudgetViewModel(repository);
  }
}
