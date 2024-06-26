package com.example.s1114781

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.s1114781.ui.theme.S1114781Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            S1114781Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    //Greeting1("Android")
                    FirstScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Composable
fun FirstScreen(modifier: Modifier = Modifier){
    val context = LocalContext.current
    var appear by remember { mutableStateOf(true) }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    )
    {
        Row {
            Image(
                painter = painterResource(id = R.drawable.maria),
                contentDescription = "圖片"
            )
        }
        Text(
            text = "瑪利亞基金會服務總覽",
            color = Color.Blue,
            modifier = modifier
        )
        Row {
            Image(
                painter = painterResource(id = R.drawable.service),
                contentDescription = "圖片"
            )
        }
        Button(onClick = {var it = Intent(context, SecondActivity::class.java)
                context.startActivity(it)
            })
            {
                Text(text = "作者：資工二B 黃子芸")
            }
        }
        /*Button(onClick = {
            var it = Intent(context, SecondActivity::class.java)
            context.startActivity(it)
        })
        {
            Text(text = "主要機構")
        }*/
    }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    S1114781Theme {
        Greeting("Android")
    }
}