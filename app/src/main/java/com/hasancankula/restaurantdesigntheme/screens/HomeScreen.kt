package com.hasancankula.restaurantdesigntheme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.hasancankula.restaurantdesigntheme.R

@Composable
fun HomeScreen(navController: NavController){
    Column {

        RestaurantListScreen()
    }

}
@Composable
fun RestaurantListScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF72F3D3))

    ) {
        TopBar()
        SearchBar()
        Box(
            modifier = Modifier.fillMaxSize().background(Color.White)
        ){
            RestaurantList()
        }

    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp, top = 32.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { /* Menü aç */ }) {
            Icon(
                painter = painterResource(id = R.drawable.menu),
                contentDescription = "Menu",
                modifier = Modifier.size(32.dp),
                tint = Color.Black
            )
        }

        IconButton(onClick = { /* Sepet aç */ }) {
            Icon(
                painter = painterResource(id = R.drawable.cart),
                contentDescription = "Cart",
                tint = Color.Black,
                modifier = Modifier.size(32.dp)
            )
        }
    }
}

@Composable
fun SearchBar() {
    var searchText by remember { mutableStateOf("") }
    TextField(
        value = searchText,
        onValueChange = { searchText = it },
        placeholder = { Text("Search for Shops and Restaurants", color = Color.Gray) },
        textStyle = TextStyle(color = Color.Black),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.LightGray, shape = RoundedCornerShape(8.dp)),
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "Search Icon",
                modifier = Modifier.size(28.dp)
            )
        }
    )
}
@Composable
fun RestaurantList() {
    val restaurants = listOf(
        "ABC Restaurant",
        "XYZ Restaurant",
        "Foodie Place",
        "Gourmet Hub"
    )

    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        items(restaurants) { name ->
            RestaurantCard(name)
        }
    }
}
@Composable
fun RestaurantCard(name: String) {
    Card(

        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp) ,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.restaurantimage),
                contentDescription = "Restaurant Image",
                modifier = Modifier
                    .size(140.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(
                    text = name,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Row {
                    repeat(1) {

                        Icon(
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = "Star",
                            tint = Color.Yellow,
                            modifier = Modifier.size(60.dp)
                        )
                    }
                }
                Text(
                    text = "Recommended",
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .background(Color.LightGray, shape = RoundedCornerShape(8.dp))
                        .padding(4.dp)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.database),
                        contentDescription = "Database",
                        tint = Color.Gray,
                        modifier = Modifier.size(16.dp)
                    )
                    Text(
                        text = "18",
                        fontSize = 18.sp,
                        color = Color.Black
                    )
                }
            }
        }
    }
}