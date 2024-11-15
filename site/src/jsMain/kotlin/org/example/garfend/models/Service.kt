package org.example.garfend.models

import org.example.garfend.util.Constants.LOREM_IPSUM_SHORTEST
import org.example.garfend.util.Res

enum class Service(
    val icon: String,
    val imageDesc: String,
    val title: String,
    val description: String
) {
    Android(
        icon = Res.Icon.android,
        imageDesc = "Android Icon",
        title = "Android Development",
        description = LOREM_IPSUM_SHORTEST
    ),
    IOS(
        icon = Res.Icon.apple,
        imageDesc = "Apple Icon",
        title = "iOS Development",
        description = LOREM_IPSUM_SHORTEST
    ),
    Design(
        icon = Res.Icon.design,
        imageDesc = "Pen Icon",
        title = "UX/UI Design",
        description = LOREM_IPSUM_SHORTEST
    ),
}