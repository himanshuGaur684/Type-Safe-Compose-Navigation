package gaur.himanshu.common

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

interface Feature {

    fun registerGraph(navHostController: NavHostController, navGraphBuilder: NavGraphBuilder)

}