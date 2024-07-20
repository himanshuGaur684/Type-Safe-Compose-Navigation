package gaur.himanshu.composenavigation

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavType
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class CustomNavType<T : Parcelable>(
    private val clazz: Class<T>,
    private val serializer: KSerializer<T>
) : NavType<T>(false) {
    override fun get(bundle: Bundle, key: String): T? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            bundle.getParcelable(key, clazz)
        } else {
            @Suppress("DEPRECATED")
            bundle.getParcelable<T>(key)
        }
    }

    override fun parseValue(value: String): T {
        return Json.decodeFromString(serializer, value)
    }

    override fun put(bundle: Bundle, key: String, value: T) {
        bundle.putParcelable(key, value)
    }

    override fun serializeAsValue(value: T): String {
        return Json.encodeToString(serializer = serializer, value)
    }

    override val name: String
        get() = clazz.name

}


sealed class Dest {
    @Serializable
    data object Home : Dest()

    @Serializable
    class Profile(val dummyData: DummyData) : Dest()
}


@Parcelize
@Serializable
class DummyData(
    val himanshu: String,
    val age: Int,
    val salary: Float
) : Parcelable

