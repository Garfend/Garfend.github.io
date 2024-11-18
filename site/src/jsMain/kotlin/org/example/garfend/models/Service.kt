package org.example.garfend.models

import org.example.garfend.util.Constants.ANDROID_DEV
import org.example.garfend.util.Constants.UI_UX
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
        title = "Mobile App Development",
        description = ANDROID_DEV
    ),
    Design(
        icon = Res.Icon.design,
        imageDesc = "Pen Icon",
        title = "UX/UI Design",
        description = UI_UX
    ),
}