package com.example.composefile

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composefile.ui.theme.ComposefileTheme
import com.google.android.gms.wallet.button.ButtonConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            game()
        }
    }
}


@Composable
fun game() {
    val contexxt = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.rock1),
            contentDescription = "rockpaper",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(20.dp)
        )
        Text(text = "Score", textAlign = TextAlign.Center, fontSize = 25.sp)
        Text(
            text = "0 / 4",
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.height(60.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "You Chose")
                Text(text = "Rock", fontSize = 30.sp)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Android Chose")
                Text(text = "Paper", fontSize = 30.sp)
            }
        }
        Spacer(modifier = Modifier.height(100.dp))
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(0.dp, 0.dp, 0.dp, 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 0.dp, 20.dp, 5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = {
                        Toast.makeText(contexxt, "Rock", Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier.size(110.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(text = "Rock", fontSize = 12.sp)

                }
                Button(
                    onClick = {
                        Toast.makeText(contexxt, "Paper", Toast.LENGTH_SHORT).show()
                    },
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.size(110.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(text = "Paper", fontSize = 12.sp)

                }
                Button(
                    onClick = {
                        Toast.makeText(contexxt, "Scissor", Toast.LENGTH_SHORT).show()
                    },
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.size(110.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(text = "Scissor", fontSize = 12.sp)

                }
            }
            Text(text = "#JetpackCompose", fontSize = 20.sp)

        }

    }
}