package com.eman.challenge.domain.usecases;

import com.eman.challenge.data.repo.ApiDetailsHelper;
import dagger.internal.Factory;
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
public final class getCharacterDetailsUseCase_Factory implements Factory<getCharacterDetailsUseCase> {
  private final Provider<ApiDetailsHelper> apiDetailsHelperProvider;

  public getCharacterDetailsUseCase_Factory(Provider<ApiDetailsHelper> apiDetailsHelperProvider) {
    this.apiDetailsHelperProvider = apiDetailsHelperProvider;
  }

  @Override
  public getCharacterDetailsUseCase get() {
    return newInstance(apiDetailsHelperProvider.get());
  }

  public static getCharacterDetailsUseCase_Factory create(
      Provider<ApiDetailsHelper> apiDetailsHelperProvider) {
    return new getCharacterDetailsUseCase_Factory(apiDetailsHelperProvider);
  }

  public static getCharacterDetailsUseCase newInstance(ApiDetailsHelper apiDetailsHelper) {
    return new getCharacterDetailsUseCase(apiDetailsHelper);
  }
}
