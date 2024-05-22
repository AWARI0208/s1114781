package com.example.s1114781

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.s1114781.ui.theme.S1114781Theme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            S1114781Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val activity = (context as Activity)
    Column {
        Row {
            Image(
                painter = painterResource(id = R.drawable.maria),
                contentDescription = "圖片"
            )
        }
        Text(
            text = "關於App作者",
            color = Color.Blue,
            modifier = modifier
        )
        Row {
            Image(
                painter = painterResource(id = R.drawable.mypic),
                contentDescription = "圖片"
            )
        }
        Button(
            onClick = {
                activity.finish()
            })
        {
            Text(text = "服務總攬")
        }/*
        Button(
            onClick = {
                activity.finish()
            })
        {
            Text(text = "簡介")
        }*/
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    S1114781Theme {
        Greeting2("Android")
    }
}