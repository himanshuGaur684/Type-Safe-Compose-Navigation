package gaur.himanshu.common

import kotlinx.serialization.Serializable

@Serializable
sealed class SubGraphRoutes {
    @Serializable
    data object Auth : SubGraphRoutes()

    @Serializable
    data object Dashboard : SubGraphRoutes()
}

@Serializable
sealed class AuthNavigationRoutes() {
    @Serializable
    data object MainScreen : AuthNavigationRoutes()
}

@Serializable
sealed class DashboardNavigationRoutes() {
    @Serializable
    data object MainScreen : DashboardNavigationRoutes()
}



