package gaur.himanshu.dashboard.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import gaur.himanshu.common.Dest
import gaur.himanshu.common.Feature
import gaur.himanshu.common.SubGraphDest
import gaur.himanshu.dashboard.screens.DashboardScreen

interface DashboardFeature : Feature {
}


class DashboardFeatureImpl : DashboardFeature {


    override fun registerGraph(
        navHostController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation<SubGraphDest.Dashboard>(startDestination = Dest.Dashboard) {
            composable<Dest.Dashboard> {
                DashboardScreen {

                }
            }
        }
    }
}

