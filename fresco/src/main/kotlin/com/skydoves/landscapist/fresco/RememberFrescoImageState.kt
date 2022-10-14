/*
 * Designed and developed by 2020-2022 skydoves (Jaewoong Eum)
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
package com.skydoves.landscapist.fresco

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

/**
 * Create and remember [FrescoImageState].
 *
 * @param initialState The initial state of [FrescoImageState].
 * @param key The key that may trigger recomposition.
 */
@Composable
public fun rememberFrescoImageState(
  initialState: FrescoImageState = FrescoImageState.None,
  key: Any?
): FrescoImageState = remember(key1 = key) { initialState }