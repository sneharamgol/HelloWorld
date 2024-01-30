package com.example.gdsc_card2

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdsc_card2.ui.theme.GDSC_card2Theme
import com.example.gdsc_card2.ui.theme.Purple1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GDSC_card2Theme {
                Myscreen()
                }
            }
        }
    }


//fun Card(modifier: Modifier, backgroundColor: Color, elevation: Dp) {
//
//}

@Composable
fun Myscreen(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    )
    {
         Card(modifier = Modifier
             .fillMaxWidth()
             .height(250.dp),
                 backgroundColor = Purple1,
                    elevation = 10.dp,
                  shape = RoundedCornerShape(30.dp)
         )
         {
             Column {
                 Myrow1()
                 Myrow2()
             }
         }

    }
}
@Composable
fun Myrow1() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {




        Text(
            text = "Hello!\nSneha Ramgol",
            fontSize = 25.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.padding(12.dp))

        Image(
            painter = painterResource(id = R.drawable.gdsc_logo),
            contentDescription = "GDSC .LOGO"
        )
    }
}
@Composable
fun Myrow2(){
    Row (
        verticalAlignment = Alignment.Bottom
    ){

        Image(painter = painterResource(id = R.drawable.android_logo) ,
            contentDescription ="android logo" )

        Text(
            text="Attending Android Camp\n2024",
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GDSC_card2Theme {
        Myscreen()
    }
}

