package com.example.items.model

/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.media.Image
import androidx.annotation.DrawableRes
import java.text.NumberFormat

sealed class menu(
    open val name: String,
    @DrawableRes open val imageResId: Int,
    open val price: Double,
    open val description: String
) {

    data class EntreeItem(
        override val name: String,
        override val imageResId: Int,
        override val price: Double,
        override val description: String
    ) : menu(name, imageResId, price,description)


    fun getFormattedPrice(): String = NumberFormat.getCurrencyInstance().format(price)
}

