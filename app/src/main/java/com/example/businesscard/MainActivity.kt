package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
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
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardText(
                        name = "Marco Bejarano Oseguera",
                        phone = "206 999 9999",
                        email = "business@card.com",
                        social = "@social"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardText(name: String, phone: String, email: String, social: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.profilepicture)
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .padding(8.dp)
        )
        Text(
            text = name,
            modifier = modifier
                .padding(8.dp)
        )
        Column(
           modifier = modifier
               .padding(8.dp)

        ) {
            Text(
                text = phone
            )
            Text(
                text = email
            )
            Text(
                text = social
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {

            BusinessCardText(
                name = "Marco Bejarano Oseguera",
                phone = "206 999 9999",
                email = "business@card.com",
                social = "@social",
            )
    }
}