package org.example.garfend.models

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

enum class Theme(
    val hex: String,
    val rgb: CSSColorValue
) {
    Primary(hex ="#FFF5F2", rgb = rgb(r = 255, g = 245, b = 242)),
    Secondary(hex =  "#FBFBFB", rgb = rgb(r = 251, g = 251, b = 251)),
    Gray(hex = "#616161", rgb = rgb(r = 97, g = 97, b = 97)),
    LightGray(hex = "#", rgb = rgb(r = 41, g = 41, b = 41)),
    LighterGray(hex = "#9E9E9E", rgb = rgb(r = 70, g = 70, b = 70) ),
    LightGrayBg(hex = "#000000", rgb = rgb(r = 0, g = 0, b = 0)),
    LightRed(hex = "#CC0A0A", rgb = rgb(r = 204, g = 10, b = 10)),
    LighterRed(hex = "#FEC5B8", rgb = rgb(r = 254, g = 197, b = 184)),
    DarkRed(hex = "#CC0A0A", rgb = rgb(r = 204, g = 10, b = 10)),
}