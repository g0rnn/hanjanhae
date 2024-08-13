package com.example.hanzanhae.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import com.example.hanzanhae.R

@Composable
fun ThirdLand(){
    Box( modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFE67171))){
    Image(
        painter = painterResource(id = R.drawable.thirdland),
        contentDescription = "세번째 랜딩 이미지",
        modifier = Modifier
            .fillMaxSize()
    )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .border(1.dp, Color(0xFFE67171), shape = RoundedCornerShape(12.dp))
                .width(300.dp)
                .height(39.dp)
                .align(Alignment.BottomCenter)
                .offset(y=(-184).dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
            ),
            shape = RoundedCornerShape(12.dp),
            content = {
                Text(
                    text = "한잔해 서비스 시작해보기",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFE67171)
                    )
                )
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun ThirdLandPreview() {
    ThirdLand()
}