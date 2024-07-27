package gaur.himanshu.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import gaur.himanshu.common.SubGraphDest
import gaur.himanshu.composenavigation.ui.theme.ComposeNavigationTheme
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var defaultNavigator: DefaultNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeNavigationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        MainNavigation(defaultNavigator = defaultNavigator)
                    }
                }
            }
        }
    }

}


@Composable
fun MainNavigation(modifier: Modifier = Modifier, defaultNavigator: DefaultNavigator) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = SubGraphDest.Auth) {
        defaultNavigator.authFeature.registerGraph(navController, this)
        defaultNavigator.dashboardFeature.registerGraph(navController, this)
    }


}
