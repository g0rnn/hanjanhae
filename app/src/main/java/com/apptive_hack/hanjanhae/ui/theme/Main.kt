package com.apptive_hack.hanjanhae.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.apptive_hack.hanjanhae.R

@Composable
fun MainApp() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(31.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier
                    .padding(bottom = 10.dp),
                horizontalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = "8",
                    color = Color(0xFFDC5555),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
                Text(
                    text = "월의 술",
                    color = Color(0xFFDC5555),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(R.drawable.mdi_post_outline),
                    modifier = Modifier.size(28.dp),
                    contentDescription = "code"
                )
                Icon(
                    imageVector = Icons.Filled.DateRange,
                    contentDescription = "date",
                    modifier = Modifier.size(28.dp),
                    tint = Color(0xFFE67171)
                    )
            }
            Surface(
                onClick = { /*TODO*/ },
                modifier = Modifier.padding(bottom = 16.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.august_drink),
                    contentDescription = "이번 달 술 사진",
                    modifier = Modifier.size(298.dp, 381.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 4.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom,
            ) {
                Text(
                    text = "전남 남도",
                    color = Color(0xFFE67171),
                )
                Box(modifier = Modifier.width(12.dp))
                Text(
                    text = "아리랑 홍주",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 24.sp,
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom,
            ) {
                Text(
                    text = "375ml",
                    fontSize = 10.sp,
                    color = Color(0xFF929292)
                )
                Box(
                    modifier = Modifier.width(12.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "|",
                        fontSize = 12.sp,
                    )
                }
                Text(
                    text = "40.00%",
                    fontSize = 10.sp,
                    color = Color(0xFF929292)
                )
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDC5555)),
                modifier = Modifier.width(298.dp),

                ) {
                Text("쉬어가기")
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFFFFF),
                    contentColor = Color(0xFFE67171)
                ),
                border = BorderStroke(1.dp, Color(0xFFE67171)),
                modifier = Modifier.width(298.dp)
            ) {
                Text("추가 구매하기")
            }
            Column(modifier = Modifier.padding(top = 32.dp)) {
                Text(
                    text = "향미 그래프",
                    color = Color(0xFFE67171)
                )
                Surface(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(top = 12.dp)
                        .size(298.dp, 125.dp)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.graph1),
                        contentDescription = "향미 그래프",
                        modifier = Modifier.fillMaxSize(),
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 800)
@Composable
fun GreetingPreview() {
    HanjanhaeTheme {
        MainApp()
    }
}
