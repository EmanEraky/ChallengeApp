package com.eman.challenge.presentation.ui.detail;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.eman.challenge.domain.usecases.getCharacterDetailsUseCase;
import com.eman.challenge.utils.NetworkHelper;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class DetailsViewModel_AssistedFactory implements ViewModelAssistedFactory<DetailsViewModel> {
  private final Provider<getCharacterDetailsUseCase> detailsUseCase;

  private final Provider<NetworkHelper> networkHelper;

  @Inject
  DetailsViewModel_AssistedFactory(Provider<getCharacterDetailsUseCase> detailsUseCase,
      Provider<NetworkHelper> networkHelper) {
    this.detailsUseCase = detailsUseCase;
    this.networkHelper = networkHelper;
  }

  @Override
  @NonNull
  public DetailsViewModel create(SavedStateHandle arg0) {
    return new DetailsViewModel(detailsUseCase.get(), networkHelper.get());
  }
}
