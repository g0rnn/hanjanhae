package com.apptive_hack.hanjanhae.ui.theme

import android.view.MotionEvent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Subcribe3creen(navController: NavController){
    var isPressed: Boolean by remember { mutableStateOf(false) }

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
            text = "주소 입력",
            modifier = Modifier.padding(start = 32.dp),
            fontWeight = FontWeight.Bold,
            fontSize = (18.sp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        CustomOutlinedTextField(detail = "배송받을 주소를 입력해주세요")

        Spacer(modifier = Modifier.height(12.dp))

        CustomOutlinedTextField(detail = "상세 주소를 입력해주세요")

        Spacer(modifier = Modifier.height(100.dp))

        Text(
            text = "결제 수단",
            modifier = Modifier.padding(start = 32.dp),
            fontWeight = FontWeight.Bold,
            fontSize = (18.sp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center, // 수평 중앙 정렬

        ) {

            Button(
                modifier = Modifier
                    .width(180.dp)
                    .height(48.dp)
                    .padding(start = 24.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFE67171),
                        shape = RoundedCornerShape(16.dp)
                    ),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color(0xFFE67171),
                    containerColor = Color.White
                ),
                onClick = { /*TODO*/ }) {
                Text("계좌이체")
            }

            Spacer(modifier = Modifier.width(15.dp))

            Button(
                modifier = Modifier
                    .width(180.dp)
                    .height(48.dp)
                    .padding(end = 24.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFE67171),
                        shape = RoundedCornerShape(16.dp)
                    ),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color(0xFFE67171),
                    containerColor = Color.White
                ),
                onClick = { /*TODO*/ }) {
                Text("휴대폰")
            }

        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(horizontal = 32.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFFE67171),
                    shape = RoundedCornerShape(16.dp)
                )
                .pointerInteropFilter {
                    when (it.action) {
                        MotionEvent.ACTION_DOWN -> {
                            isPressed = true
                        }
                        MotionEvent.ACTION_UP,
                        MotionEvent.ACTION_CANCEL -> {
                            isPressed = false
                        }
                    }
                    false
                },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isPressed) Color(0xFFE67171) else Color.White,
                contentColor = if (isPressed) Color.White else Color(0xFFE67171)
            ),
            onClick = { /*TODO*/ }
        ) {
            Text(text = "신용 카드")
        }
        Spacer(modifier = Modifier.height(8.dp))

        PaymentSummaryBox()

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(horizontal = 32.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFFE67171),
                    shape = RoundedCornerShape(16.dp)
                ),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFE67171), // 버튼의 배경색 설정
                contentColor = Color.White // 버튼 내 텍스트의 색상 설정
            ),
            onClick = {
                navController.navigate("complete")
            }) {
            Text("결제하기")
        }
    }
}

@Composable
fun PaymentSummaryBox() {
    Box(
        modifier = Modifier
            .padding(32.dp)
            .border(
                width = 1.dp, // 테두리 두께
                color = Color.Gray, // 테두리 색상
                shape = RoundedCornerShape(8.dp) // 둥근 모서리
            )
            .background(color = Color.White, shape = RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Column {
            Text(
                text = "결제 금액",
                color = Color.Gray,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "1인권",
                    color = Color.Gray,
                    fontSize = 16.sp
                )
                Text(
                    text = "100,000원",
                    color = Color.Gray,
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Divider(color = Color.LightGray, thickness = 1.dp)
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "총 결제 금액",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "100,000원",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}




