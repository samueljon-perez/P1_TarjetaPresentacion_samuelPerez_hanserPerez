package com.example.p1_tarjetapresentacion_samuelperez_hanserperez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.p1_tarjetapresentacion_samuelperez_hanserperez.ui.theme.P1_TarjetaPresentacion_samuelPerez_hanserPerezTheme
import androidx.compose.foundation.Image
import androidx.core.content.pm.ShortcutInfoCompat.Surface
import androidx.compose.material3.Surface
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P1_TarjetaPresentacion_samuelPerez_hanserPerezTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Tarjeta(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Tarjeta( modifier: Modifier = Modifier.fillMaxSize()) {
    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.weight(1f)) {
            val logoAndroid = painterResource(R.drawable.android)
            Box(modifier = Modifier.fillMaxWidth().weight(2f)) {
                Image (
                    painter = logoAndroid,
                    contentDescription = "Android"
                )
            }
            Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
                Text (
                    text = "Jeniffer Doe",
                    modifier = Modifier.size(16.dp)
                )
            }
            Box(modifier = Modifier.fillMaxWidth().weight(1f)) {
                Text (
                    text = "Android developer extraordinaire",
                    modifier = Modifier
                )
            }
        }

    }

    Column() { }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPreview() {
    P1_TarjetaPresentacion_samuelPerez_hanserPerezTheme {
       Surface(modifier = Modifier) {
           Tarjeta()
       }
    }
}