package com.gmulbat1301.cartamasalta.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gmulbat1301.cartamasalta.R

@Preview
@Composable
fun MainScreen(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box (
            modifier = Modifier
        ){
            Reverso()
        }
        Row {
            Button(onClick = {

            },
                modifier = Modifier
                    .padding(10.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ) {
                Text(text = "Dame Carta")
            }

            Button(onClick = {

            },
                modifier = Modifier
                    .padding(10.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ) {
                Text(text = "Reiniciar")
            }
        }
    }
}

@Composable
fun Reverso() {
    val painter: Painter = painterResource(id = R.drawable.creverso)

    Image(
        painter = painter,
        contentDescription = "Carta",
        modifier = Modifier
            .width(300.dp)
            .height(445.dp)
    )
}
