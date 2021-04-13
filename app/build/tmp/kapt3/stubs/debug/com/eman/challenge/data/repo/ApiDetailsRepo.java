package com.eman.challenge.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/eman/challenge/data/repo/ApiDetailsRepo;", "Lcom/eman/challenge/data/repo/ApiDetailsHelper;", "apiService", "Lcom/eman/challenge/data/api/ApiService;", "(Lcom/eman/challenge/data/api/ApiService;)V", "getCharacterDetails", "Lkotlinx/coroutines/flow/Flow;", "Lcom/eman/challenge/utils/Resource;", "Lcom/eman/challenge/domain/model/MarvelDetailsCharacterData;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ApiDetailsRepo implements com.eman.challenge.data.repo.ApiDetailsHelper {
    private final com.eman.challenge.data.api.ApiService apiService = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCharacterDetails(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.eman.challenge.utils.Resource<com.eman.challenge.domain.model.MarvelDetailsCharacterData>>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public ApiDetailsRepo(@org.jetbrains.annotations.NotNull()
    com.eman.challenge.data.api.ApiService apiService) {
        super();
    }
}