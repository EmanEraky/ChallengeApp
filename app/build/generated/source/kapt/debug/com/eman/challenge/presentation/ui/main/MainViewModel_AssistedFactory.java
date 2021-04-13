package com.eman.challenge.presentation.ui.main;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.eman.challenge.domain.usecases.getCharactersUseCase;
import com.eman.challenge.utils.NetworkHelper;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MainViewModel_AssistedFactory implements ViewModelAssistedFactory<MainViewModel> {
  private final Provider<getCharactersUseCase> mainRepositoryUseCase;

  private final Provider<NetworkHelper> networkHelper;

  @Inject
  MainViewModel_AssistedFactory(Provider<getCharactersUseCase> mainRepositoryUseCase,
      Provider<NetworkHelper> networkHelper) {
    this.mainRepositoryUseCase = mainRepositoryUseCase;
    this.networkHelper = networkHelper;
  }

  @Override
  @NonNull
  public MainViewModel create(SavedStateHandle arg0) {
    return new MainViewModel(mainRepositoryUseCase.get(), networkHelper.get());
  }
}
