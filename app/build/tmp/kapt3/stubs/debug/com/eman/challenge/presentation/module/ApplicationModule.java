package com.eman.challenge.presentation.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0004H\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0017H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u001a"}, d2 = {"Lcom/eman/challenge/presentation/module/ApplicationModule;", "", "()V", "privateKey", "", "getPrivateKey", "()Ljava/lang/String;", "publicKey", "getPublicKey", "provideApiCharacterDetails", "Lcom/eman/challenge/data/repo/ApiDetailsHelper;", "apiDetailsHelper", "Lcom/eman/challenge/data/repo/ApiDetailsRepo;", "provideApiHelper", "Lcom/eman/challenge/data/repo/ApiHelper;", "apiHelper", "Lcom/eman/challenge/data/repo/GetCharactersRepo;", "provideApiService", "Lcom/eman/challenge/data/api/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideBaseUrl", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "okHttpClient", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String publicKey = "65eaba09aecaf35bf20af74b1ba38392";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String privateKey = "a25071b57c1c68903c37ed7347df1621441fe80b";
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublicKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrivateKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.eman.challenge.data.api.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.eman.challenge.data.repo.ApiHelper provideApiHelper(@org.jetbrains.annotations.NotNull()
    com.eman.challenge.data.repo.GetCharactersRepo apiHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.eman.challenge.data.repo.ApiDetailsHelper provideApiCharacterDetails(@org.jetbrains.annotations.NotNull()
    com.eman.challenge.data.repo.ApiDetailsRepo apiDetailsHelper) {
        return null;
    }
    
    public ApplicationModule() {
        super();
    }
}