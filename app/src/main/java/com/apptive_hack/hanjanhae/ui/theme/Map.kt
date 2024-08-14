package com.apptive_hack.hanjanhae.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
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
fun MapScreen(navController: NavController) {
    var imageResource by remember { mutableStateOf(R.drawable.map) }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "2024년에는 이런 술을 \n보내드려요",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight(900),
                color = Color(0xFFDC5555)
            ),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 110.dp)
        )
        Text(
            text = "아래 지도를 눌러보세요",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(900),
                color = Color(0xFFE67171)
            ),
            modifier = Modifier
                .padding(top = 220.dp, start = 55.dp)
        )
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = "구독 완료 화면",
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 135.dp)
                .width(296.dp)
                .height(440.dp)
        )
        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 120.dp, bottom = 290.dp)
                .height(60.dp)
                .width(80.dp)
                .pointerInput(Unit) {
                    detectTapGestures(
                        onPress = {
                            imageResource = R.drawable.color_map // 버튼을 터치하면 이미지 변경
                            tryAwaitRelease() // 버튼을 누르고 있는 동안 유지
                            navController.navigate("alchol-description")
                            imageResource = R.drawable.map
                        }
                    )
                },
        )
    }

}


@Preview(showBackground = true)
@Composable
private fun MapScreenPreview() {
    MapScreen(navController = rememberNavController())
}

inline fun Modifier.noRippleClickable(crossinline onClick: () -> Unit) = composed {
    clickable(
        indication = null,
        interactionSource = remember { MutableInteractionSource() },
        onClick = { onClick() }
    )
}