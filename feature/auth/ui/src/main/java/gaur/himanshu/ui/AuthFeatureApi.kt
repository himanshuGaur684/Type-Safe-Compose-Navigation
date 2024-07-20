package gaur.himanshu.ui

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import gaur.himanshu.common.AuthNavigationRoutes
import gaur.himanshu.common.DashboardNavigationRoutes
import gaur.himanshu.common.FeatureApi
import gaur.himanshu.common.SubGraphRoutes


interface AuthFeatureApi : FeatureApi {
}

class AuthFeatureApiImpl:AuthFeatureApi{
    override fun registerGraph(
        navHostController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation<SubGraphRoutes.Auth>(startDestination = AuthNavigationRoutes.MainScreen){
            composable<AuthNavigationRoutes.MainScreen>{
                AuthScreen {
                    navHostController.navigate(DashboardNavigationRoutes.MainScreen)
                }
            }
        }
    }
}
