package com.hasancankula.restaurantdesigntheme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.hasancankula.restaurantdesigntheme.R

@Composable
fun ResetPasswordScreen(navController: NavController){
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = Color.White)
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ){
            Spacer(modifier = Modifier.height(48.dp))

            Image(
                painterResource(R.drawable.resetpassword),
                contentDescription = "Reset Password",
                modifier = Modifier.fillMaxWidth().height(280.dp)

            )
            Spacer(modifier = Modifier.height(48.dp))

            Text(
                text = "Reset \nPassword",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                ), modifier =
                Modifier.fillMaxWidth().padding(vertical = 8.dp),
                textAlign = TextAlign.Start

            )
            Spacer(modifier = Modifier.height(8.dp))

            val newPassword = remember { mutableStateOf("") }
            val confirmPassword = remember { mutableStateOf("") }
            TextField(
                value = newPassword.value,
                onValueChange = {newPassword.value = it},
                label = { Text("New Password") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent
                ), leadingIcon = {
                    Image(
                        painterResource(R.drawable.password),
                        contentDescription = "New Password",
                        modifier = Modifier.size(20.dp)

                    )
                }


            )

            Spacer(modifier = Modifier.height(16.dp))
            TextField(
                value = confirmPassword.value,
                onValueChange = {confirmPassword.value = it},
                label = { Text("Confirm Password") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent

                ), leadingIcon = {
                    Image(painter = painterResource(R.drawable.password),
                        contentDescription = "Confirm Password",
                        modifier = Modifier.size(20.dp))
                })
            Spacer(modifier = Modifier.weight(1f))
            Button(onClick = {
                navController.navigate("homeScreen")
                             }
                , modifier = Modifier.fillMaxWidth().height(48.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF00CFC1))
            ) {
                Text(text = "Submitting", color = Color.Black, fontSize = 16.sp)

            }
            Spacer(modifier = Modifier.height(48.dp))


        }
    }
}