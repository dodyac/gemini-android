/*
 * Designed and developed by 2024 skydoves (Jaewoong Eum)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.skydoves.gemini.initializer

import android.content.Context
import androidx.startup.Initializer
import io.getstream.log.Priority
import io.getstream.log.android.AndroidStreamLogger
import io.getstream.log.android.BuildConfig
import io.getstream.log.streamLog

class StreamLogInitializer : Initializer<Unit> {

  override fun create(context: Context) {
    if (BuildConfig.DEBUG) {
      AndroidStreamLogger.install(minPriority = Priority.DEBUG)
      streamLog { "StreamLogInitializer is initialized" }
    }
  }

  override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}
