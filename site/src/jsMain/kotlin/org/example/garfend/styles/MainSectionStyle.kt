package org.example.garfend.styles

import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.example.garfend.models.Theme
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*

val NavigationItemStyle = CssStyle {
    base {
        Modifier
            .styleModifier {
                property("--bs-link-color", Theme.Secondary.rgb)
                property("--silk-link-default-color", Theme.Secondary.rgb)
                property("--silk-link-visited-color", Theme.Secondary.rgb)
                property("color", "${Theme.Secondary.rgb} !important")
            }
            .color(Theme.Secondary.rgb)
            .transition(Transition.of(property = "color", duration = 200.ms))
    }
    hover {
        Modifier
            .styleModifier {
                property("--bs-link-hover-color", Theme.DarkRed.rgb)
                property("--silk-link-default-color", Theme.DarkRed.rgb)
                property("--silk-link-visited-color", Theme.DarkRed.rgb)
                property("color", "${Theme.DarkRed.rgb} !important")
            }
            .color(Theme.DarkRed.rgb)
    }
}

val LogoStyle = CssStyle {
    base {
        Modifier
            .transform { rotate(0.deg) }
            .transition(Transition.of(property = "transform", duration = 200.ms))
    }
    hover {
        Modifier
            .transform { rotate((-10).deg) }
    }
}

val SocialLinkStyle = CssStyle {
    base {
        Modifier
            .color(Colors.White)
            .transition(Transition.of(property = "color", duration = 200.ms))
    }
    hover {
        Modifier.color(Theme.LighterRed.rgb)
    }
}

val MainButtonStyle = CssStyle {
    base {
        Modifier
            .width(100.px)
            .transition(Transition.of(property = "width", duration = 200.ms))
    }
    hover {
        Modifier.width(120.px)
    }
}

@OptIn(ExperimentalComposeWebApi::class)
val LinkOverrideStyle = CssStyle {
    base {
        Modifier.styleModifier {
            // Override Silk link variables and use important to override all defaults
            property("--silk-link-default-color", "${Theme.Secondary.rgb} !important")
            property("--silk-link-visited-color", "${Theme.Secondary.rgb} !important")
            property("color", "${Theme.Secondary.rgb} !important")
            property("text-decoration", "none !important")
        }
    }
    hover {
        Modifier.styleModifier {
            property("--silk-link-default-color", "${Theme.DarkRed.rgb} !important")
            property("--silk-link-visited-color", "${Theme.DarkRed.rgb} !important")
            property("color", "${Theme.DarkRed.rgb} !important")
            property("text-decoration", "none !important")
        }
    }
}

@OptIn(ExperimentalComposeWebApi::class)
val MainImageStyle = CssStyle {
    base {
        Modifier
            .styleModifier {
                filter { grayscale(100.percent) }
            }
            .transition(Transition.of(property = "filter", duration = 200.ms))
    }
    hover {
        Modifier.styleModifier {
            filter { grayscale(0.percent) }
        }
    }
}