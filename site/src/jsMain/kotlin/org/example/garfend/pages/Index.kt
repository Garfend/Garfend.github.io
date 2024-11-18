package org.example.garfend.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import org.example.garfend.components.backToTopButton
import org.example.garfend.components.overflowMenu
import org.example.garfend.sections.*


@Page
@Composable
fun homePage() {

    var menuOpened by remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize().background(Colors.Black)) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            mainSection(onMenuClicked = { menuOpened = true })
            aboutSection()
            serviceSection()
            portfolioSection()
            experienceSection()
            contactSection()
            footerSection()
        }
        backToTopButton()
        if (menuOpened) {
            overflowMenu(onMenuClosed = { menuOpened = false })
        }
    }
}

