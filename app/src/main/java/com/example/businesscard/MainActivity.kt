package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(0xFF03DAC5))
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val image = painterResource(id = R.drawable.android_logo)
        Image(painter = image, contentDescription = null, modifier = Modifier
            .height(120.dp)
            .width(150.dp))
        Text(text = stringResource(R.string.nombre),color = Color.White)
        Text(text = stringResource(R.string.puesto),color = Color(0xFF3ddc84))

    }
    Column(
        modifier = Modifier

            .fillMaxWidth()
            .padding(top = 500.dp)
            .padding(bottom = 70.dp)

        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp)
                .padding(bottom = 10.dp),

            ){
            val icon = painterResource(id = R.drawable.baseline_phone_iphone_24)
            Icon(painter = icon, contentDescription = null, modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84)
            )
            Text(text = stringResource(R.string.telefono), modifier = Modifier.padding(start = 25.dp),color = Color.White)

        }
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp)
                .padding(bottom = 10.dp),
        ){
            val icon2 = painterResource(id = R.drawable.baseline_ios_share_24)
            Icon(painter = icon2, contentDescription = null, modifier = Modifier.padding(start = 60.dp),Color(0xFF3ddc84) )
            Text(text = stringResource(R.string.compartir), modifier = Modifier.padding(start = 25.dp),color = Color.White)
        }
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp)
                .padding(bottom = 10.dp),
        ){
            val icon3 = painterResource(id = R.drawable.baseline_email_24)
            Icon(painter = icon3, contentDescription = null,  modifier = Modifier.padding(start = 60.dp),Color(0xFF3ddc84))
            Text(text = stringResource(R.string.email), modifier = Modifier.padding(start = 25.dp),color = Color.White)

        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        Surface{
            BusinessCard()
        }

    }
}