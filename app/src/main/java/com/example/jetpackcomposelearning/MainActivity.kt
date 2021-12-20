package com.example.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposelearning.ui.theme.JetpackComposeLearningTheme

val fontFamily = FontFamily(
    Font(R.font.nunito_medium, FontWeight.Medium),
    Font(R.font.nunito_black, FontWeight.Black),
    Font(R.font.nunito_bold, FontWeight.Bold),
    Font(R.font.nunito_regular, FontWeight.Normal)
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
//            JetpackComposeLearningTheme {
            // A surface container using the 'background' color from the theme
//                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
//            val painter = painterResource(id = R.drawable.ic_launcher_background)
//            val title = "Kermit is playing in the snow"
//            ImageCard(
//                painter = painter,
//                title = title, description = title
//            )
//                }
//            }
            stylingText()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier
            .width(200.dp)
            .height(200.dp)
//            .requiredWidth(1600.dp)
//            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 18.dp, start = 18.dp)
            .background(Color.Blue, shape = RectangleShape)
            .border(2.dp, Color.Black, shape = RectangleShape)
            .padding(50.dp),
//    horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello $name!", modifier =
            Modifier.offset(0.dp, 20.dp)
        )
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "Hello")
        Text(text = "World!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeLearningTheme {
        Greeting("Android")
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {

        val padding = 12.dp
        Card(
            modifier = modifier
                .fillMaxWidth(0.6f)
                .padding(top = 50.dp, start = padding, end = padding)
                .clickable(true, null, null) { },
            shape = RoundedCornerShape(15.dp),
            elevation = 5.dp
        ) {
            Box(modifier = Modifier.height(200.dp)) {
                Image(
                    painter = painter,
                    contentDescription = description,
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black
                                ), startY = 330f
                            )
                        )
                ) {
                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = title,
                        style = TextStyle(Color.White, fontSize = 16.sp)
                    )
                }
            }
        }
    }
}

@Composable
fun stylingText(

) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1010110))
    ) {

        Text(
//            text = "My name is ali!",
            text = buildAnnotatedString {
                withStyle(
                    SpanStyle(
                        color = Color.Green,
                        fontSize = 40.sp
                    )
                ) {
                    append("J")
                }
                append("etpack")

                withStyle(
                    SpanStyle(
                        color = Color.Green,
                        fontSize = 40.sp
                    )
                ) {
                    append("C")
                }
                append("ompose")
            },
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontFamily = fontFamily,
            textDecoration = TextDecoration.Underline,


            )
    }
}