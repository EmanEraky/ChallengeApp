package com.eman.challenge.presentation.ui.detail;

import com.eman.challenge.domain.usecases.getCharacterDetailsUseCase;
import com.eman.challenge.utils.NetworkHelper;
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
public final class DetailsViewModel_AssistedFactory_Factory implements Factory<DetailsViewModel_AssistedFactory> {
  private final Provider<getCharacterDetailsUseCase> detailsUseCaseProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public DetailsViewModel_AssistedFactory_Factory(
      Provider<getCharacterDetailsUseCase> detailsUseCaseProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.detailsUseCaseProvider = detailsUseCaseProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  @Override
  public DetailsViewModel_AssistedFactory get() {
    return newInstance(detailsUseCaseProvider, networkHelperProvider);
  }

  public static DetailsViewModel_AssistedFactory_Factory create(
      Provider<getCharacterDetailsUseCase> detailsUseCaseProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new DetailsViewModel_AssistedFactory_Factory(detailsUseCaseProvider, networkHelperProvider);
  }

  public static DetailsViewModel_AssistedFactory newInstance(
      Provider<getCharacterDetailsUseCase> detailsUseCase, Provider<NetworkHelper> networkHelper) {
    return new DetailsViewModel_AssistedFactory(detailsUseCase, networkHelper);
  }
}
