package com.apptive_hack.hanjanhae.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.apptive_hack.hanjanhae.R


@Composable
fun CompleteScreen(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.flower),
            contentDescription = "구독 완료 화면",
            modifier = Modifier
                .align(Alignment.Center)
                .padding(bottom=100.dp)
                .width(296.dp)
                .height(125.dp)
        )
        Text(
            text = "구독이 완료되었습니다!",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight(1000),
                color = Color(0xFFDC5555)
            ),
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top=130.dp),
        )
        Button(
            onClick = { navController.navigate("main") },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 64.dp)
                .width(330.dp)
                .height(37.dp),

            colors = ButtonDefaults.buttonColors(
                containerColor =  Color(0xFFDC5555),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp),
            content = {
                Text(
                    text="메인으로 돌아가기",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(700)
                    ))
            }
        )

    }

}

@Preview(showBackground = true)
@Composable
private fun CompletePreview() {
    CompleteScreen(rememberNavController())
}