package com.eman.challenge.presentation.module;

import com.eman.challenge.data.repo.ApiDetailsHelper;
import com.eman.challenge.data.repo.ApiDetailsRepo;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideApiCharacterDetailsFactory implements Factory<ApiDetailsHelper> {
  private final ApplicationModule module;

  private final Provider<ApiDetailsRepo> apiDetailsHelperProvider;

  public ApplicationModule_ProvideApiCharacterDetailsFactory(ApplicationModule module,
      Provider<ApiDetailsRepo> apiDetailsHelperProvider) {
    this.module = module;
    this.apiDetailsHelperProvider = apiDetailsHelperProvider;
  }

  @Override
  public ApiDetailsHelper get() {
    return provideApiCharacterDetails(module, apiDetailsHelperProvider.get());
  }

  public static ApplicationModule_ProvideApiCharacterDetailsFactory create(ApplicationModule module,
      Provider<ApiDetailsRepo> apiDetailsHelperProvider) {
    return new ApplicationModule_ProvideApiCharacterDetailsFactory(module, apiDetailsHelperProvider);
  }

  public static ApiDetailsHelper provideApiCharacterDetails(ApplicationModule instance,
      ApiDetailsRepo apiDetailsHelper) {
    return Preconditions.checkNotNull(instance.provideApiCharacterDetails(apiDetailsHelper), "Cannot return null from a non-@Nullable @Provides method");
  }
}
