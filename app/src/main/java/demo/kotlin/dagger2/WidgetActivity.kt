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

import android.annotation.SuppressLint
import android.os.Bundle
import demo.kotlin.dagger2.common.*
import kotlinx.android.synthetic.main.activity_widget.*
import javax.inject.Inject

class WidgetActivity : BaseActivity() {
    @Inject lateinit var widget1: Widget1
    @Inject lateinit var widget2: Widget2

    @Inject lateinit var thing1: Thing1
    @Inject lateinit var thing2: Thing2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget)

        button1.setOnClickListener { widget1() }
        button2.setOnClickListener { widget2() }

        widget1()
    }

    @SuppressLint("SetTextI18n")
    private fun widget1() {
        textWidget.text =
                widget1.hello() + "\n" +
                thing1.hello() + "\n" +
                thing2.hello()

    }

    private fun widget2() {
        textWidget.text = widget2.hello()
    }
}
