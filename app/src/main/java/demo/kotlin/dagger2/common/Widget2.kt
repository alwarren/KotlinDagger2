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

package demo.kotlin.dagger2.common

import demo.kotlin.dagger2.di.scope.Scope1
import demo.kotlin.dagger2.di.scope.Scope2
import javax.inject.Inject
import javax.inject.Singleton

@Singleton // optional
class Widget2
@Inject // required
constructor(@Scope1 val thing1: Thing, @Scope2 val thing2: Thing) {

    fun hello(): String {
        val text2 = thing1.hello()
        val text3 = thing2.hello()
        return ("$text\n$text2\n$text3")
    }

    companion object {
        private val text = "Hello from Widget2!!"
    }
}