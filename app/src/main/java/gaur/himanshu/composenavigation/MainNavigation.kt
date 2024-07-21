package gaur.himanshu.composenavigation

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import androidx.navigation.toRoute
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.reflect.typeOf

@Parcelize
@Serializable
data class Dummy(
    val name: String,
    val age: Int
) : Parcelable

val DummyType = object : NavType<Dummy>(false) {
    override fun get(bundle: Bundle, key: String): Dummy? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            bundle.getParcelable(key, Dummy::class.java)
        } else {
            bundle.getParcelable(key)
        }
    }

    override fun parseValue(value: String): Dummy {
        return Json.decodeFromString(value)
    }

    override fun put(bundle: Bundle, key: String, value: Dummy) {
        bundle.putParcelable(key, value)
    }

    override fun serializeAsValue(value: Dummy): String {
        return Json.encodeToString(value)
    }
}


@Composable
fun MainNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = SubGraph.Auth) {

        navigation<SubGraph.Auth>(startDestination = Dest.AuthFirstScreen) {
            composable<Dest.AuthFirstScreen> {
                AuthFirst {
                    navController.navigate(Dest.AuthSecondScreen)
                }
            }

            composable<Dest.AuthSecondScreen> {
                AuthSecond {
                    navController.navigate(
                        Dest.DashSecondScreen(
                            Dummy(
                                name = "himanshu",
                                age = 12
                            )
                        )
                    )
                }
            }
        }

        navigation<SubGraph.Dashboard>(
            startDestination = Dest.DashFirstScreen
        ) {
            composable<Dest.DashFirstScreen> {
                DashFirst {

                }
            }
            composable<Dest.DashSecondScreen>(
                typeMap = mapOf(typeOf<Dummy>() to DummyType)
            ) {
                val dash = it.toRoute<Dest.DashSecondScreen>()
                DashSecond(dash) {

                }
            }
        }

    }

}