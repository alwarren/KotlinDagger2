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

package demo.kotlin.dagger2

import demo.kotlin.dagger2.common.BaseActivity
import demo.kotlin.dagger2.common.Coffee
import android.content.Intent
import android.os.Bundle
import javax.inject.Inject
import kotlinx.android.synthetic.main.activity_coffee.*

class CoffeeActivity : BaseActivity() {
    @Inject lateinit var coffee: Coffee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee)

        textView.text = coffee.getText()

        buttonViewModel.setOnClickListener{
            startActivity(Intent(this, DataActivity::class.java))
        }
    }
}
