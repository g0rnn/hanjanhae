package com.apptive_hack.hanjanhae

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.apptive_hack.hanjanhae.data.Post
import com.apptive_hack.hanjanhae.ui.theme.AlcholDescription
import com.apptive_hack.hanjanhae.ui.theme.CompleteScreen
import com.apptive_hack.hanjanhae.ui.theme.Feed
import com.apptive_hack.hanjanhae.ui.theme.FirstLand
import com.apptive_hack.hanjanhae.ui.theme.HanjanhaeTheme
import com.apptive_hack.hanjanhae.ui.theme.MainApp
import com.apptive_hack.hanjanhae.ui.theme.MapScreen
import com.apptive_hack.hanjanhae.ui.theme.SecondLand
import com.apptive_hack.hanjanhae.ui.theme.Subcribe2Screen
import com.apptive_hack.hanjanhae.ui.theme.Subcribe3creen
import com.apptive_hack.hanjanhae.ui.theme.SubcribeScreen
import com.apptive_hack.hanjanhae.ui.theme.ThirdLand

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavGraph(navController = navController)

        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyAppContentPreview() {
    val navController = rememberNavController()
    NavGraph(navController = navController)
}

@Composable
fun NavGraph(navController: NavController) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "first-land") {
        composable("first-land") { FirstLand(navController) }
        composable("second-land") { SecondLand(navController) }
        composable("third-land") { ThirdLand(navController) }
        composable("complete") { CompleteScreen(navController) }
        composable("alchol-description") { AlcholDescription(navController) }
        composable("map") { MapScreen(navController) }
        composable("main") { MainApp(navController) }
        composable("subscribe") { SubcribeScreen(navController) }
        composable("subscribe2") { Subcribe2Screen(navController) }
        composable("subscribe3") { Subcribe3creen(navController) }
        composable("feed") { Feed(initPosts())}
    }
}

fun initPosts():List<Post> = listOf(
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
