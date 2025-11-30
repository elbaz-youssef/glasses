package com.example.glasses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.glasses.navigation.NavigationStack
import com.example.glasses.ui.theme.TestTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {

                    NavigationStack()
                }
            }
        }
    }
}


@Preview(showBackground = true, heightDp = 1000)
@Composable
fun GreetingScreenPreview() {
    TestTheme(dynamicColor = false) {
        val systemUiController = rememberSystemUiController()
        SideEffect {
            systemUiController.setNavigationBarColor(
                color = Color.Transparent,
            )
        }
        NavigationStack()
    }
}


