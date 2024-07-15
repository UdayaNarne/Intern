package com.example.items.ui

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
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.items.R

@Composable
fun Start(
    onStartOrderButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.cartoon_logo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(200.dp)
        )


//        Button(onClick = onStartOrderButtonClicked,colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.green)),shape= RectangleShape) {
//            ButtonDefaults.buttonColors(containerColor = Color.Blue)
//            Text(text = "Next",color= Color.White, fontWeight = FontWeight.Bold)
//
//        }

        Row(
            modifier = Modifier
//                .fillMaxWidth()
                .padding(16.dp)

        ) {
            Button(onClick = onStartOrderButtonClicked,colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.green)),shape= RectangleShape) {
                ButtonDefaults.buttonColors(containerColor = Color.Blue)
                Text(text = "Start Ordering",color=Color.White, fontWeight = FontWeight.Bold)

            }
        }
    }
}

@Preview
@Composable
fun StartOrderPreview(){
    Start(
        onStartOrderButtonClicked = {},
        modifier = Modifier
            .padding(dimensionResource(R.dimen.padding_medium))
            .fillMaxSize()
    )
}
