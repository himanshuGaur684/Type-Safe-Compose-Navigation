package gaur.himanshu.composenavigation

import kotlinx.serialization.Serializable

sealed class Dest{

    @Serializable
    data object Home:Dest()

    @Serializable
    data class Profile(val dummy: Dummy):Dest()

}