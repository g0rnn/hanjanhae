package com.apptive_hack.hanjanhae.ui.theme

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Subcribe2Screen(navController: NavController){

    var juminnum by remember { mutableStateOf<String>("") } // 타입을 명시적으로 지정
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

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
                color = Color(0xFFE67171),
                modifier = Modifier.padding(top = 24.dp,start = 4.dp) // 좌측 패딩 추가
            )
            CircleIcon(
                size = 11,
                modifier = Modifier.padding(top = 24.dp,start = 4.dp) // 좌측 패딩 추가
            )
        }

        Text(
            text = "STEP 2. 인적사항을 입력해주세요.",
            fontSize = (12.sp),
            modifier = Modifier.padding(top = 6.dp, start = 32.dp)
        )

        Text(
            text = "주의사항: ‘한잔해' 서비스는 세금 감면 혜택을 동반하므로 반드시 서비스 이용자의 인적사항을 올바르게 입력해주세요.",
            fontSize = (12.sp),
            modifier = Modifier.padding(top = 6.dp, start = 32.dp, end = 32.dp),
            color = Color.LightGray // 텍스트 색상을 빨간색으로 설정
        )

        Spacer(modifier = Modifier.height(24.dp))


        CustomOutlinedTextField(detail = "이름을 입력해주세요")

        Spacer(modifier = Modifier.height(12.dp))

        Row {
            OutlinedTextField(
                value = juminnum,
                onValueChange = { newjuminnum -> juminnum = newjuminnum },
                placeholder = {
                    Text(
                        text = "주민등록번호",
                        color = Color.LightGray,
                        fontSize = 13.sp,
                        modifier = Modifier.padding(start = 20.dp)


                    )
                },
                modifier = Modifier
                    .width(180.dp)
                    .height(48.dp)
                    .padding(start = 32.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFE67171),
                        shape = RoundedCornerShape(16.dp)
                    ),
                shape = RoundedCornerShape(16.dp)
            )

            Text(
                text = "-",
                modifier = Modifier.padding(start = 13.dp, top=5.dp),
                fontSize = 25.sp,
                color = Color(0xFFE67171), // 텍스트 색상을 빨간색으로 설정
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                placeholder = {},
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(), // 비밀번호 표시 여부
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password), // 키보드 타입을 비밀번호로 설정

                modifier = Modifier
                    .width(160.dp)
                    .height(48.dp)
                    .padding(start = 13.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFE67171),
                        shape = RoundedCornerShape(16.dp)
                    ),
                shape = RoundedCornerShape(16.dp)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        CustomOutlinedTextField(detail = "전화번호를 입력해주세요")

        Spacer(modifier = Modifier.height(370.dp))


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
                navController.navigate("subscribe3")
            }) {
            Text("본인 인증하기")
        }




    }
}

@Composable
fun CustomOutlinedTextField(detail:String) {
    var text by remember { mutableStateOf<String>("") } // 타입을 명시적으로 지정

    OutlinedTextField(
        value = text,
        onValueChange = { newText -> text = newText },
        placeholder = {
            Text(
                detail,
                color = Color.LightGray,
                fontSize = 13.sp,
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(horizontal = 32.dp)
            .border(
                width = 1.dp,
                color = Color(0xFFE67171),
                shape = RoundedCornerShape(16.dp)
            ),
        shape = RoundedCornerShape(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun SuPreview() {
    Subcribe2Screen(navController = rememberNavController())
}
