package com.hasancankula.restaurantdesigntheme.screens

import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun StartScreen(navController: NavController){
    Surface(
        modifier =  Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(40.dp).fillMaxSize()
        ){
            Spacer(modifier = Modifier.height(32.dp))
            Text(text = "You are a ",
                style = TextStyle(
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                ),
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp) ,
                textAlign = TextAlign.Start

            )

            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp)

            ) {
                Button(onClick = {},
                    modifier = Modifier.fillMaxWidth().height(48.dp),
                    colors =
                    ButtonDefaults.buttonColors(Color(red = 100, green = 252, blue = 217))
                ){
                    Text("Restaurant", color = Color.Black, fontSize =  16.sp)

                }
                Button(onClick = {navController.navigate("signUpScreen")},
                    modifier = Modifier.fillMaxWidth().height(48.dp),
                    colors =
                    ButtonDefaults.buttonColors(Color(red = 100, green = 252, blue = 217))
                ){
                    Text("Customer", color = Color.Black, fontSize =  16.sp)

                }
            }






        }
    }
}
