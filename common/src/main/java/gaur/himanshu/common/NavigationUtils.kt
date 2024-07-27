package gaur.himanshu.common

import kotlinx.serialization.Serializable

sealed class SubGraphDest {
    @Serializable
    data object Auth : SubGraphDest()

    @Serializable
    data object Dashboard : SubGraphDest()

}


sealed class Dest {

    @Serializable
    data object Auth : Dest()

    @Serializable
    data object Dashboard : Dest()

}