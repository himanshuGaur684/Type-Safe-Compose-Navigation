package gaur.himanshu.dashboard.ui

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import gaur.himanshu.common.DashboardNavigationRoutes
import gaur.himanshu.common.FeatureApi
import gaur.himanshu.common.SubGraphRoutes




interface DashboardFeature : FeatureApi {
}

class DashboardFeatureApiImpl: DashboardFeature{
    override fun registerGraph(
        navHostController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    )  {
        navGraphBuilder.navigation<SubGraphRoutes.Dashboard>(startDestination = DashboardNavigationRoutes.MainScreen) {
            composable<DashboardNavigationRoutes.MainScreen> {
                DashboardScreen {
                    navHostController.popBackStack()
                }
            }
        }
    }
}