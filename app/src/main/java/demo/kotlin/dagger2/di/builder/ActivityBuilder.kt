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

package demo.kotlin.dagger2.di.builder

import demo.kotlin.dagger2.CoffeeActivity
import demo.kotlin.dagger2.DataActivity
import demo.kotlin.dagger2.MainActivity
import demo.kotlin.dagger2.di.module.CoffeeActivityModule
import demo.kotlin.dagger2.di.module.DataActivityModule
import demo.kotlin.dagger2.di.module.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    internal abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [(CoffeeActivityModule::class)])
    internal abstract fun bindCoffeeActivity(): CoffeeActivity

    @ContributesAndroidInjector(modules = [(DataActivityModule::class)])
    internal abstract fun bindViewModelActivity(): DataActivity
}