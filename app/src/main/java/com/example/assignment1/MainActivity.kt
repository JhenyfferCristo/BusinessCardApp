package com.example.assignment1

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.provider.ContactsContract.CommonDataKinds.Phone
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment1.ui.theme.Assignment1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF588157),
                ) {
                    Profile("Jhenyffer Cristo Marques", "Software Development")
                    ProfileInfo("+1 (639)381-3454", "@j.marques", "j.marques@gmail.com")

                }
            }
        }
    }
}

@Composable
fun Profile(name: String, job: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

     Row (horizontalArrangement = Arrangement.Center){
            val image = painterResource(id = R.drawable.android_logo)
            Image(
                painter = image, contentDescription = "profilePicture",
                contentScale = ContentScale.Fit,
                modifier = modifier.size(100.dp)
            )
        }
        Row (horizontalArrangement = Arrangement.Center){
            Text(
                text = name,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp),
                fontFamily = FontFamily.SansSerif,
                fontSize = 18.sp
            )
        }
        Row (horizontalArrangement = Arrangement.Center) {
            Text(
                text = job,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFDAD7CD),
                modifier = modifier

            )
        }
    }
}

@Composable
fun ProfileInfo(contact: String, social: String, emailContact:String, modifier: Modifier = Modifier ){
    Column (verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row {
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = "Call Icon",
                tint = Color(0xFFDAD7CD),
                modifier = Modifier.padding(8.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = contact, textAlign = TextAlign.Center,)
        }
        Row{
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Profile Icon",
                tint = Color(0xFFDAD7CD),
                modifier = Modifier.padding(8.dp),
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = social,  textAlign = TextAlign.Center,)
        }
        Row{
            Icon(
                imageVector = Icons.Default.MailOutline,
                contentDescription = "Email Icon",
                tint = Color(0xFFDAD7CD),
                modifier = Modifier.padding(8.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = emailContact, textAlign = TextAlign.Center,)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment1Theme {
        Profile("Jhenyffer Cristo Marques", "Software Development")
        ProfileInfo("+1 (639)381-3454", "@j.marques", "j.marques@gmail.com")
    }
}