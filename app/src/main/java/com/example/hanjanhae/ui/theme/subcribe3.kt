package com.example.hanjanhae.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Subcribe3creen(){
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
                modifier = Modifier.padding(top = 24.dp,start = 32.dp) // 좌측 패딩 추가
            )
            CircleIcon(
                size = 11,
                modifier = Modifier.padding(top = 24.dp,start = 4.dp) // 좌측 패딩 추가
            )
            CircleIcon(
                size = 11,
                color = Color(0xFFE67171),
                modifier = Modifier.padding(top = 24.dp,start = 4.dp) // 좌측 패딩 추가
            )
        }

        Text(
            text = "STEP 3. 주소를 입력하고 결제수단을 설정해주세요.",
            fontSize = (12.sp),
            modifier = Modifier.padding(top = 6.dp, start = 32.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "주소입력",
            modifier = Modifier.padding(start = 32.dp),
            fontWeight = FontWeight.Bold,
            fontSize = (18.sp)
            )

        Spacer(modifier = Modifier.height(8.dp))

        CustomOutlinedTextField(detail = "배송받을 주소를 입력해주세요")

        Spacer(modifier = Modifier.height(8.dp))

        CustomOutlinedTextField(detail = "상세 주소를 입력해주세요")



    }
}


@Preview(showBackground = true)
@Composable
private fun MypagePreview() {
    Subcribe3creen()
}

