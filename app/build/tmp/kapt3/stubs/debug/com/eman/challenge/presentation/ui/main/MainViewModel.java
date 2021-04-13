package com.eman.challenge.presentation.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Lcom/eman/challenge/presentation/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepositoryUseCase", "Lcom/eman/challenge/domain/usecases/getCharactersUseCase;", "networkHelper", "Lcom/eman/challenge/utils/NetworkHelper;", "(Lcom/eman/challenge/domain/usecases/getCharactersUseCase;Lcom/eman/challenge/utils/NetworkHelper;)V", "_characters", "Landroidx/lifecycle/MutableLiveData;", "Lcom/eman/challenge/utils/Resource;", "Lcom/eman/challenge/domain/model/MarvelCharacterData;", "_nCharacters", "characters", "getCharacters", "()Landroidx/lifecycle/MutableLiveData;", "getMainRepositoryUseCase", "()Lcom/eman/challenge/domain/usecases/getCharactersUseCase;", "nCharacters", "getNCharacters", "getNetworkHelper", "()Lcom/eman/challenge/utils/NetworkHelper;", "getCharactersBeginLetter", "", "limit", "", "name", "", "getCharactersResponse", "offset", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.eman.challenge.utils.Resource<com.eman.challenge.domain.model.MarvelCharacterData>> _characters = null;
    private final androidx.lifecycle.MutableLiveData<com.eman.challenge.utils.Resource<com.eman.challenge.domain.model.MarvelCharacterData>> _nCharacters = null;
    @org.jetbrains.annotations.NotNull()
    private final com.eman.challenge.domain.usecases.getCharactersUseCase mainRepositoryUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.eman.challenge.utils.NetworkHelper networkHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.eman.challenge.utils.Resource<com.eman.challenge.domain.model.MarvelCharacterData>> getCharacters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.eman.challenge.utils.Resource<com.eman.challenge.domain.model.MarvelCharacterData>> getNCharacters() {
        return null;
    }
    
    public final void getCharactersResponse(int offset, int limit) {
    }
    
    public final void getCharactersBeginLetter(int limit, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.eman.challenge.domain.usecases.getCharactersUseCase getMainRepositoryUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.eman.challenge.utils.NetworkHelper getNetworkHelper() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.eman.challenge.domain.usecases.getCharactersUseCase mainRepositoryUseCase, @org.jetbrains.annotations.NotNull()
    com.eman.challenge.utils.NetworkHelper networkHelper) {
        super();
    }
}