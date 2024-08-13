package com.example.hanjanhae.ui.theme

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SubcribeScreen(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = "구독하기",
            fontWeight = FontWeight.Bold,
            fontSize = (30.sp),
            modifier = Modifier.padding(top = 32.dp, start = 32.dp),
            color = Color(0xFFE67171), // 텍스트 색상을 빨간색으로 설정


        )

        Row {
            CircleIcon(
                size = 11,
                color = Color(0xFFE67171),
                modifier = Modifier.padding(top = 24.dp,start = 32.dp) // 좌측 패딩 추가
            )
            CircleIcon(
                size = 11,
                modifier = Modifier.padding(top = 24.dp,start = 4.dp) // 좌측 패딩 추가
            )
            CircleIcon(
                size = 11,
                modifier = Modifier.padding(top = 24.dp,start = 4.dp) // 좌측 패딩 추가
            )
        }

        Text(
            text = "STEP 1. 구독하실 서비스의 유형을 선택하세요.",
            fontSize = (12.sp),
            modifier = Modifier.padding(top = 6.dp, start = 32.dp)
        )

        SubscriptionCard("1인권", "2개월", "1번", "100,000원")
        SubscriptionCard("2인권", "1개월", "2번", "200,000원")

    }
}

@Composable
fun CircleIcon(
    color: Color = Color.LightGray,
    size: Int,  // 아이콘 크기 (단위: dp)
    modifier: Modifier = Modifier  // Modifier를 매개변수로 추가
) {
    Canvas(modifier = modifier.size(size.dp)) {
        drawCircle(
            color = color,
            radius = size.dp.toPx() / 2 // 반지름을 크기 절반으로 설정
        )
    }
}
@Composable
fun SubscriptionCard(name: String, month: String, num: String, price:String) {
    Card(
        modifier = Modifier
            .padding(horizontal = 32.dp)
            .padding(top = 20.dp)
            .border(1.dp, Color(0xFFE67171), RoundedCornerShape(16.dp)), // 테두리 추가
        shape = RoundedCornerShape(16.dp), // 모서리 둥글게
        colors = CardDefaults.cardColors(containerColor = Color.White) // 카드 배경색을 흰색으로 설정
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color(0xFFE67171), // 텍스트 색상을 빨간색으로 설정
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "• $month 당 1병 배송",
                fontSize = 16.sp,
                color = Color(0xFFE67171), // 텍스트 색상을 빨간색으로 설정
                modifier = Modifier.padding(start = 6.dp)
            )
            Text(
                text = "• $num 미루기 가능",
                fontSize = 16.sp,
                color = Color(0xFFE67171), // 텍스트 색상을 빨간색으로 설정
                modifier = Modifier.padding(start = 6.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            Row {
                Text(
                    text = price, // 가격 텍스트
                    color = Color(0xFFE67171), // 텍스트 색상을 빨간색으로 설정
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    textAlign = TextAlign.End
                )

            }
        }
    }
}

