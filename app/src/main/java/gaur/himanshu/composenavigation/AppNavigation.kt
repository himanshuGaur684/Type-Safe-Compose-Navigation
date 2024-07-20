package gaur.himanshu.composenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import gaur.himanshu.common.SubGraphRoutes


@Composable
fun MainNavigation(appFeatureNavigator: AppFeatureNavigator) {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = SubGraphRoutes.Auth) {
      appFeatureNavigator.authFeature.registerGraph(navHostController,this)
      appFeatureNavigator.dashboardFeature.registerGraph(navHostController,this)
    }
}
