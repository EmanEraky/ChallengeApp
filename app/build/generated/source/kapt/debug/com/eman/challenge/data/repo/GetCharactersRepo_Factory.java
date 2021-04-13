package com.eman.challenge.data.repo;

import com.eman.challenge.data.api.ApiService;
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
public final class GetCharactersRepo_Factory implements Factory<GetCharactersRepo> {
  private final Provider<ApiService> apiServiceProvider;

  public GetCharactersRepo_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public GetCharactersRepo get() {
    return newInstance(apiServiceProvider.get());
  }

  public static GetCharactersRepo_Factory create(Provider<ApiService> apiServiceProvider) {
    return new GetCharactersRepo_Factory(apiServiceProvider);
  }

  public static GetCharactersRepo newInstance(ApiService apiService) {
    return new GetCharactersRepo(apiService);
  }
}
