package com.hasancankula.restaurantdesigntheme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.hasancankula.restaurantdesigntheme.R

@Composable
fun SignUpConfirmScreen(navController: NavController){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
                .padding(16.dp)
        ){
            Spacer(modifier = Modifier.height(64.dp))

            Image(painter = painterResource(R.drawable.signup),
                contentDescription = "Sign Up Confirm",
                modifier = Modifier.fillMaxWidth().height(280.dp)
            )
            Spacer(modifier = Modifier.height(64.dp))

            Image(painter = painterResource(R.drawable.telegram),
                contentDescription = "Telegram GIF",
                modifier = Modifier.fillMaxWidth().height(120.dp))

            Spacer(modifier = Modifier.height(32.dp))

            Text(text = "Signed up Successfully",
                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Normal,
                    color = Color.Black),
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {
                    navController.navigate("loginScreen")
                },
                modifier = Modifier.fillMaxWidth().height(48.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(red = 100, green = 252, blue
                = 217)
                ) ) {
                Text(text = "Login", color = Color.Black, fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.height(64.dp))






        }
    }
}