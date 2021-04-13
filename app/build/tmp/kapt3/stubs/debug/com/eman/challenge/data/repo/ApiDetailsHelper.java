package com.eman.challenge.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/eman/challenge/data/repo/ApiDetailsHelper;", "", "getCharacterDetails", "Lkotlinx/coroutines/flow/Flow;", "Lcom/eman/challenge/utils/Resource;", "Lcom/eman/challenge/domain/model/MarvelDetailsCharacterData;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiDetailsHelper {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCharacterDetails(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.eman.challenge.utils.Resource<com.eman.challenge.domain.model.MarvelDetailsCharacterData>>> p1);
}