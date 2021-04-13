//package com.eman.challenge.presentation.ui.main.pagingadaptertest
//
//import androidx.paging.DataSource
//import com.eman.challenge.domain.usecases.getMainBusinessUseCase
//import javax.inject.Inject
//import kotlin.coroutines.CoroutineContext
//
//class BusinessDataFactory @Inject constructor(val coroutineContext: CoroutineContext,
//                                              val mainRepositoryUseCase: getMainBusinessUseCase
//) : DataSource.Factory<String, Character>() {
//
//    override fun create(): DataSource<String, Character> {
//        return BusinessDataSource(coroutineContext ,mainRepositoryUseCase)
//    }
//}