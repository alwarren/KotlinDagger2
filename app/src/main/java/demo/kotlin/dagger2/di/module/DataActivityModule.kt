/*
 * Copyright (c) 2018. Al Warren.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package demo.kotlin.dagger2.di.module

import demo.kotlin.dagger2.api.RemoteDataSource
import demo.kotlin.dagger2.arch.DataViewModel
import demo.kotlin.dagger2.repository.RemoteRepository
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides

@Module
class DataActivityModule {
    @Provides
    fun provideRemoteDataSource(): RemoteDataSource {
        return RemoteDataSource()
    }

    @Provides
    fun provideRemoteRepository(source: RemoteDataSource): RemoteRepository {
        return RemoteRepository(source)
    }

    @Provides
    fun provideDataViewModel(viewModel: DataViewModel): ViewModel {
        return viewModel
    }

    @Provides
    fun provideDataViewModelFactory(factory: DataViewModel.Factory): ViewModelProvider.Factory {
        return factory
    }

}