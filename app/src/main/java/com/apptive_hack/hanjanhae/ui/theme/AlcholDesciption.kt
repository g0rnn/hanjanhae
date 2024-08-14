package com.apptive_hack.hanjanhae.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.apptive_hack.hanjanhae.R

@Composable
fun AlcholDescription(navController: NavController) {
    // Using a scrollable Column with verticalScroll
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState()) // Make the content scrollable
    ) {
        // Content goes here
        Image(
            painter = painterResource(id = R.drawable.alcholdescription),
            contentDescription = "술 설명 이미지",
            modifier = Modifier
                .padding(top = 45.dp)
                .width(388.dp)
                .height(429.dp)
                .align(Alignment.CenterHorizontally)
        )
        Row(){
            Text(
                text = "월탁",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight(700)
                ),
                modifier = Modifier
                    .padding(top = 20.dp, start = 31.dp)
            )

            Text(
                text = "500ml",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF929292)
                ),
                modifier = Modifier.padding(start = 10.dp, top = 40.dp)
            )
            Text(
                text = "|",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight(400)),
                modifier = Modifier.padding(start = 5.dp, top = 40.dp)
            )

            Text(
                text = "13.1%",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF929292)
                ),
                modifier = Modifier.padding(start = 3.5.dp, top = 40.dp)
            )

            Text(
                text = "전북 정읍",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFE67171)
                ),
                modifier = Modifier
                    .padding(top = 30.dp, start = 150.dp)
            )}
        Text(
            text = "정읍 월탁은 전라북도 정읍시에 위치한 한국술도가에서 만든\n전통주입니다. 월탁은 정제수, 쌀, 누룩 등을 원료로 하여 만들어지며, 탁주의 일종입니다. 알코올 도수는 약 13.5%이며, 용량은 500ml입니다.",
            style = TextStyle(
                fontSize = 13.7.sp,
                fontWeight = FontWeight(550)
            ),
            modifier = Modifier
                .padding(top = 10.dp, start = 31.dp, end = 31.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {  navController.navigate("subscribe")},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 10.dp)
                .width(330.dp)
                .height(37.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFDC5555),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp),
            content = {
                Text(
                    text = "한잔해 구독하기",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(700)
                    )
                )
            }
        )
        Button(
            onClick = { navController.navigate("feed") },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .border(1.dp, Color(0xFFE67171), shape = RoundedCornerShape(12.dp))
                .width(330.dp)
                .height(37.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
            ),
            shape = RoundedCornerShape(12.dp),
            content = {
                Text(
                    text = "술과 관련된 피드보기",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFE67171)
                    )
                )
            }
        )
        Text(
            text = "향미 그래프",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(850),
                color = Color(0xFFE67171)
            ),
            modifier = Modifier
                .padding(top = 20.dp, start = 31.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.graph),
            contentDescription = "향미 그래프",
            modifier = Modifier
                .padding(top = 10.dp, bottom = 30.dp)
                .width(296.dp)
                .height(150.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AlcholDescriptionPreview() {
    val navController = rememberNavController()
    AlcholDescription(navController = navController)
}
