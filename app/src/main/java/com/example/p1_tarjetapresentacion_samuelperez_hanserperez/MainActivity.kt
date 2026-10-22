package com.example.p1_tarjetapresentacion_samuelperez_hanserperez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.p1_tarjetapresentacion_samuelperez_hanserperez.ui.theme.P1_TarjetaPresentacion_samuelPerez_hanserPerezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P1_TarjetaPresentacion_samuelPerez_hanserPerezTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier.fillMaxSize()) {
    Column {
        Row {
            Box() {
                Text(
                    text = "Hello $name!",
                    modifier = modifier
                )
            }
            Box() { }
            Box() { }
        }
        Row {
            Box() { }
            Box() { }
            Box() { }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P1_TarjetaPresentacion_samuelPerez_hanserPerezTheme {
        Greeting("Android")
    }
}