package org.example.garfend.models

import org.example.garfend.util.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String,
    val link: String
) {
    One(
        image = Res.Image.portfolio1,
        title = "MuseMagic",
        description = "Android App - kotlin",
        link = "https://github.com/Garfend/HistoryVerse"
    ),
    Two(
        image = Res.Image.portfolio2,
        title = "Job-inder",
        description = "Mobile app - flutter",
        link = "https://github.com/mostafa1255/Job_Finder_App"
    ),
    Three(
        image = Res.Image.portfolio3,
        title = "Landing page",
        description = "Frontend - jetpack compose",
        link = ""

    ),
    Four(
        image = Res.Image.portfolio4,
        title = "Expenser",
        description = "Mobile App - flutter",
        link = "https://github.com/Garfend/expenses-tracker"
    ),
    Five(
        image = Res.Image.portfolio5,
        title = "Titanuim gym",
        description = "UI/UX Design",
        link = "https://www.figma.com/design/CdmOjyxgnziOM7jJso5zZ4/Titanium-Gym?t=tzsjDlRk7ZkYtHiQ-0"
    )
}