package com.apptive_hack.hanjanhae.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.apptive_hack.hanjanhae.R
import kotlinx.coroutines.delay

@Composable
fun FirstLand(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE67171))
    ){
        Image(
            painter = painterResource(id = R.drawable.firstland),
            contentDescription = "첫번재 랜딩 페이지",
            modifier = Modifier
                .fillMaxSize()
        )
        LaunchedEffect(Unit) {
            delay(2000)
            navController.navigate("second-land")
        }}
}


@Preview(showBackground = true)
@Composable
private fun FirstLandPreview() {
    val navController = rememberNavController()
    FirstLand(navController = navController)
}