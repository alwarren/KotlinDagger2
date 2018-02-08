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

package demo.kotlin.dagger2.arch

import demo.kotlin.dagger2.repository.RemoteRepository
import javax.inject.Inject
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

class DataViewModel @Inject
constructor(private val repository: RemoteRepository) : ViewModel() {

    internal fun getText(): String {
        return repository.getText()
    }

    class Factory @Inject
    constructor(private val mViewModel: DataViewModel) : ViewModelProvider.Factory {

        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(DataViewModel::class.java)) {
                return mViewModel as T
            }
            throw IllegalArgumentException("Unknown class name")
        }
    }
}