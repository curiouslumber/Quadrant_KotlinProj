package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantView()
                }
            }
        }
    }
}

@Composable
fun Quadrant(title1: String, description1: String, title2: String, description2: String, title3: String, description3: String, title4: String, description4: String){
    Column(modifier = Modifier
        .fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)) {
            Box(modifier = Modifier
                .weight(1f)
                .background(Color(0xFFEADDFF))) {
                Card(title = title1, description = description1)
            }
            Box(modifier = Modifier
                .weight(1f)
                .background(Color(0xFFD0BCFF))) {
                Card(title = title2, description = description2)
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Box(modifier = Modifier
                .weight(1f)
                .background(Color(0xFFB69DF8))) {
                Card(title = title3, description = description3)
            }
            Box(modifier = Modifier
                .weight(1f)
                .background(Color(0xFFF6EDFF))) {
                Card(title = title4, description = description4)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantView(){
    QuadrantTheme {
        Quadrant(title1 = "Text composable", description1 = "Displays text and follows the recommended Material Design guidelines.", title2 = "Image composable", description2 = "Creates a composable that lays out and draws a given Painter class object.Creates a composable that lays out and draws a given Painter class object.", title3 = "Row composable", description3 = "A layout composable that places its children in a horizontal sequence.", title4 = "Column composable", description4 = "A layout composable that places its children in a vertical sequence.")
    }
}

@Composable
fun Card(title: String, description: String){
    Column(
        modifier = Modifier.padding(16.dp).fillMaxSize()
        ,horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = title, textAlign = TextAlign.Center, modifier = Modifier.padding(bottom = 16.dp))
        Text(text = description, textAlign = TextAlign.Justify)
    }
}
