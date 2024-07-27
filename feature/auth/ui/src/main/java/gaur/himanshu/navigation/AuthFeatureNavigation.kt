package gaur.himanshu.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import gaur.himanshu.common.Dest
import gaur.himanshu.common.Feature
import gaur.himanshu.common.SubGraphDest
import gaur.himanshu.screens.AuthScreen

interface AuthFeature : Feature {


}

class AuthFeatureImpl : AuthFeature {

    override fun registerGraph(
        navHostController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation<SubGraphDest.Auth>(startDestination = Dest.Auth) {
            composable<Dest.Auth> {
                AuthScreen {
                    navHostController.navigate(Dest.Dashboard)
                }
            }
        }
    }
}
