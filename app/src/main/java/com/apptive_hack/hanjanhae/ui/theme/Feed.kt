package com.apptive_hack.hanjanhae.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.apptive_hack.hanjanhae.R
import com.apptive_hack.hanjanhae.data.Post

@Composable
fun Feed(posts: List<Post>) {
    Column(
        modifier = Modifier.padding(top = 60.dp, start = 20.dp, end = 20.dp)
    ) {
        // Independent Row
        Row(
            modifier = Modifier
                .padding(bottom = 10.dp),
        ) {
            Icon(
                painter = painterResource(R.drawable.mdi_post_outline),
                modifier = Modifier.size(28.dp),
                tint = Color(0xFFE67171),
                contentDescription = "code"
            )
            Spacer(modifier = Modifier.width(8.dp)) // Add some space between icon and text
            Text(
                text = "한잔해 피드 보기",
                color = Color(0xFFDC5555),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                )
        }

        LazyColumn {
            items(posts) { post ->
                PostItem(initialPost = post)
            }
        }
    }
}

@Composable
fun PostItem(initialPost: Post) {
    val postState = remember { mutableStateOf(initialPost) }

    Column(
        modifier = Modifier
            .padding(top = 20.dp, start = 8.dp, end = 8.dp, bottom = 8.dp)
            .background(Color.White, RoundedCornerShape(8.dp))
            .clickable { /* Handle post click */ }
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(
                when(postState.value.img) {
                    "img1" -> R.drawable.img1
                    "img2" -> R.drawable.img2
                    "img3" -> R.drawable.img3
                    else -> R.drawable.august_drink
                }
            ),
            contentDescription = "Post image",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentScale = ContentScale.Fit
        )

        Row(
            modifier = Modifier
                .padding(top = 8.dp, start = 8.dp, end = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(
                imageVector = if(!postState.value.liked) Icons.Filled.FavoriteBorder else Icons.Filled.Favorite,
                contentDescription = "likes",
                modifier = Modifier
                    .size(20.dp)
                    .clickable { postState.value = postState.value.copy(
                        liked = !postState.value.liked,
                        likes = if (!postState.value.liked) postState.value.likes + 1 else postState.value.likes - 1
                    ) }
            )
            Spacer(modifier = Modifier.width(2.dp))
            Text(text = "${postState.value.likes}", fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.width(12.dp))
            Icon(
                painter = painterResource(id = R.drawable.comment),
                contentDescription = "comment",
                modifier = Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.width(2.dp))
            Text(text = "${postState.value.comments}")
        }

        Text(
            text = postState.value.description,
            modifier = Modifier.padding(8.dp)
        )

        Text(
            text = postState.value.date,
            fontSize = 12.sp,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFeed() {
    val posts = remember {
        listOf(
            Post(
                img = "img1",
                description = "막걸리가 지금 만들어지고 있어요! 맛있는 막걸리가 만들어질 수 있도록 항상 최선을 다하는 정우기 사장님을 응원해주세요!",
                likes = 100,
                comments = 10,
                date = "3일 전"
            ),
            Post(
                img = "img2",
                description = "씁쓸한 안동소주는 달콤하고 고소한 크림치즈 곶감말이와 함께 먹으면 그 맛이 훨씬 더해요! 꼭 한번 드셔보세요!",
                likes = 200,
                comments = 20,
                date = "일주일 전"
            ),
            Post(
                img = "img3",
                description = "전국 각지의 침고이는 전통주 모임",
                likes = 100,
                comments = 30,
                date = "7월 14일"
            )
        )
    }
    Feed(posts = posts)
}