package com.example.items.ui

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
fun SuccessPage(
    onNextButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier.fillMaxSize()) {
        // Centered Image
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.intern_kotlin),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(200.dp)
            )
        }

        // Button at the bottom right
        Row(
            modifier = Modifier
//                .fillMaxWidth()
                .padding(16.dp)
                .align(Alignment.BottomEnd)
        ) {
            Button(onClick = onNextButtonClicked,colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.green)),shape= RectangleShape) {
                ButtonDefaults.buttonColors(containerColor = Color.Blue)
                Text(text = "Next",color=Color.White, fontWeight = FontWeight.Bold)

            }
        }
    }
}




@Preview
@Composable
fun SuccessPreview(){
    SuccessPage(
        onNextButtonClicked = {}
    )
}
