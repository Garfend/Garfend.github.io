package org.example.garfend.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.example.garfend.components.sectionTitle
import org.example.garfend.models.Section
import org.example.garfend.models.Theme
import org.example.garfend.styles.AboutTextStyle
import org.example.garfend.util.Constants.ABOUT_ME_INFO
import org.example.garfend.util.Constants.FONT_FAMILY
import org.example.garfend.util.Constants.SECTION_WIDTH
import org.jetbrains.compose.web.css.AlignSelf
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun aboutSection() {
    Box(
        modifier = Modifier
            .id(Section.About.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 150.px)
            .backgroundColor(Theme.LightGrayBg.rgb),
    ) {
        aboutContent()
    }
}

@Composable
fun aboutContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        aboutMe()
    }
}

@Composable
fun aboutMe() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        sectionTitle(section = Section.About,
            alignment = Alignment.CenterHorizontally
        )
        P(
            attrs = AboutTextStyle.toModifier()
                .margin(topBottom = 25.px)
                .maxWidth(70.percent)
                .fontFamily(FONT_FAMILY)
                .fontSize(22.px)
                .fontWeight(FontWeight.Normal)
                .fontStyle(FontStyle.Italic)
                .color(Theme.Secondary.rgb)
                .textAlign(TextAlign.Center)
                .toAttrs(),
        ) {
                Text(ABOUT_ME_INFO)
        }
    }
}