package com.eman.challenge.presentation.module

import com.eman.challenge.BuildConfig
import com.eman.challenge.data.api.ApiService
import com.eman.challenge.data.repo.ApiDetailsRepo
import com.eman.challenge.data.repo.GetCharactersRepo
import com.eman.challenge.data.repo.ApiDetailsHelper
import com.eman.challenge.data.repo.ApiHelper
import com.eman.challenge.utils.MarvelHashGenerate
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
class ApplicationModule {
    val publicKey = "65eaba09aecaf35bf20af74b1ba38392"
    val privateKey = "a25071b57c1c68903c37ed7347df1621441fe80b"

    @Provides
    fun provideBaseUrl(): String = BuildConfig.BASE_URL

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient = if (BuildConfig.DEBUG) {
        val timeStamp = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder().addInterceptor { chain ->
            val original = chain.request()

            val builder = original.url.newBuilder()

            builder.addQueryParameter("apikey", publicKey)
                .addQueryParameter("hash", MarvelHashGenerate.generate(timeStamp, privateKey, publicKey))
                .addQueryParameter("ts", timeStamp.toString())

            val request = original.newBuilder().url(builder.build()).build()
            chain.proceed(request)
        }.build()


    } else OkHttpClient
        .Builder()
        .build()


    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .build()


    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideApiHelper(apiHelper: GetCharactersRepo): ApiHelper = apiHelper


    @Provides
    @Singleton
    fun provideApiCharacterDetails(apiDetailsHelper: ApiDetailsRepo): ApiDetailsHelper =
        apiDetailsHelper
}