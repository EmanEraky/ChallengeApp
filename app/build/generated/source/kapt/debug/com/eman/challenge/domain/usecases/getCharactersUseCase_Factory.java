package com.eman.challenge.domain.usecases;

import com.eman.challenge.data.repo.ApiHelper;
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
public final class getCharactersUseCase_Factory implements Factory<getCharactersUseCase> {
  private final Provider<ApiHelper> apiHelperProvider;

  public getCharactersUseCase_Factory(Provider<ApiHelper> apiHelperProvider) {
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public getCharactersUseCase get() {
    return newInstance(apiHelperProvider.get());
  }

  public static getCharactersUseCase_Factory create(Provider<ApiHelper> apiHelperProvider) {
    return new getCharactersUseCase_Factory(apiHelperProvider);
  }

  public static getCharactersUseCase newInstance(ApiHelper apiHelper) {
    return new getCharactersUseCase(apiHelper);
  }
}
