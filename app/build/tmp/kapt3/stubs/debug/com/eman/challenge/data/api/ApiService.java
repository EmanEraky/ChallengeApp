package com.eman.challenge.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/eman/challenge/data/api/ApiService;", "", "getCharacter", "Lcom/eman/challenge/domain/model/MarvelDetailsCharacterData;", "characterId", "", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharacters", "Lcom/eman/challenge/domain/model/MarvelCharacterData;", "offset", "limit", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharactersBeginLetter", "letter", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "characters")
    public abstract java.lang.Object getCharacters(@retrofit2.http.Query(value = "offset")
    int offset, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.eman.challenge.domain.model.MarvelCharacterData> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "characters")
    public abstract java.lang.Object getCharactersBeginLetter(@retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "nameStartsWith")
    java.lang.String letter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.eman.challenge.domain.model.MarvelCharacterData> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "characters/{characterId}")
    public abstract java.lang.Object getCharacter(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "characterId")
    java.lang.Integer characterId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.eman.challenge.domain.model.MarvelDetailsCharacterData> p1);
}