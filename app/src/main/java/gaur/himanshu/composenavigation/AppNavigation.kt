package gaur.himanshu.composenavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlin.reflect.typeOf


@Composable
fun MainNavigation(modifier: Modifier = Modifier) {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Dest.Home) {
        composable<Dest.Home> {
            HomeScreen {
                val dummyData = DummyData("name", 12, 10000f)
                val profile = Dest.Profile(dummyData)
                navHostController.navigate(profile)
            }
        }
        composable<Dest.Profile>(
            typeMap = mutableMapOf(
                typeOf<DummyData>() to CustomNavType<DummyData>(
                    DummyData::class.java,
                    DummyData.serializer()
                )
            )
        ) {
            val profile = it.toRoute<Dest.Profile>().dummyData
            ProfileScreen(profile)
        }
    }
}
