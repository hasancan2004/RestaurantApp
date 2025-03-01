package com.hasancankula.restaurantdesigntheme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.hasancankula.restaurantdesigntheme.R

@Composable
fun LoginScreen(navController: NavController){
    Surface(
        Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Spacer(modifier = Modifier.padding(32.dp))

            Image(
                painter = painterResource(R.drawable.loginimage),
                contentDescription = "Login Illustration",
                modifier = Modifier.fillMaxWidth()
                    .height(280.dp)
            )
            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Login",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black

                ),
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.height(4.dp))
            val email = remember { mutableStateOf("")}
            val password = remember { mutableStateOf("") }

            TextField(
                value = email.value,
                onValueChange = {

                    email.value = it
                },
                label = { Text(text = "Email") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent
                ), leadingIcon = {
                    Image(
                        painter = painterResource(R.drawable.calling),
                        contentDescription = "Email Icon",
                        modifier = Modifier.size(20.dp)
                    )
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            TextField(
                value = password.value,
                onValueChange = {
                    password.value = it
                },
                label = { Text(text = "Password") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType
                        .Password
                ),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent
                ), leadingIcon = {
                    Image(
                        painter = painterResource(R.drawable.work),
                        contentDescription = "Password Icon",
                        modifier = Modifier.size(20.dp)
                    )
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier.fillMaxWidth()
            ){
                TextButton(onClick = {navController.navigate("forgotPasswordScreen") }){
                    Text(
                        text = "Forgot Password?",
                        fontSize = 14.sp,
                        color = Color.Black,
                    )
                }

            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {navController.navigate("homeScreen")},
                modifier = Modifier.fillMaxWidth().height(48.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(red = 100, green = 252 ,
                    blue = 217)
                )
            ) {
                Text(text = "Continue", color = Color.Black, fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "OR",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.Center)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))
            // Facebook Google login işlemi

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // Google Login Button
                Surface(
                    color = Color(0xFFD2D0D0),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth().height(56.dp) // Yüksekliği artırdık
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start // İçerikleri yatayda
                        // ortala
                    ) {
                        Image(
                            painter = painterResource(R.drawable.google),
                            contentDescription = "Google Icon",
                            modifier = Modifier.size(32.dp) // İkon boyutu
                        )
                        Spacer(modifier = Modifier.width(12.dp)) // Boşluk
                        Text(
                            text = "Login with Google",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black
                        )
                    }
                }

                // Facebook Login Button
                Surface(
                    color = Color(0xFFD2D0D0),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth().height(56.dp) // Yüksekliği artırdık
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start // İçerikleri yatayda
                        // ortala
                    ) {
                        Image(
                            painter = painterResource(R.drawable.facebook),
                            contentDescription = "Facebook Icon",
                            modifier = Modifier.size(32.dp) // İkon boyutu
                        )
                        Spacer(modifier = Modifier.width(12.dp)) // Boşluk
                        Text(
                            text = "Login with Facebook",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black,
                            fontFamily = FontFamily.SansSerif
                        )
                    }
                }
            }

            // New to US? Register kısmı

            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "New to us?", fontSize = 14.sp, color = Color.Gray)

                TextButton(onClick = {navController.navigate("signUpScreen")}) {
                    Text(text = "Register", fontSize = 14.sp, color = Color(0xFF000000))
                }

            }








        }
    }
}