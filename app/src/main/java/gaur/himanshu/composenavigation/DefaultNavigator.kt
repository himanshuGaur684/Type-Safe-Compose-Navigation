package gaur.himanshu.composenavigation

import gaur.himanshu.dashboard.navigation.DashboardFeature
import gaur.himanshu.navigation.AuthFeature

data class DefaultNavigator(
    val authFeature: AuthFeature,
    val dashboardFeature: DashboardFeature
)
