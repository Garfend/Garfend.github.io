package org.example.garfend.models

import org.example.garfend.util.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: PortfolioCategory,
    val link: String
) {
    One(
        image = Res.Image.background,
        title = "KN lybia",
        description = PortfolioCategory.MobileFlutter,
        link = "https://play.google.com/store/apps/details?id=com.alkafaa.alkafaa_user"
    ),
    Two(
        image = Res.Image.fromscratch,
        title = "FromScratch (coming soon, testing)",
        description = PortfolioCategory.MobileFlutter,
        link = "https://play.google.com/store/apps/details?id=com.fromscratch.app"
    ),
    Three(
        image = Res.Image.dawaalink2,
        title = "Dawaa Link",
        description = PortfolioCategory.MobileFlutter,
        link = "https://dawaalink.vercel.app/"

    ),
    Four(
        image = Res.Image.musemagic,
        title = "MuseMagic",
        description = PortfolioCategory.MobileKotlin,
        link = "https://github.com/Garfend/HistoryVerse"
    ),
    Five(
        image = Res.Image.dabdoub,
        title = "Dabdoub Butchery",
        description = PortfolioCategory.MobileFlutter,
        link = "https://play.google.com/store/apps/details?id=com.dabdoub.butchery&hl=en"
    ),
    Six(
        image = Res.Image.titanumgym,
        title = "Titanuim gym",
        description = PortfolioCategory.UiUx,
        link = "https://www.figma.com/design/CdmOjyxgnziOM7jJso5zZ4/Titanium-Gym?t=tzsjDlRk7ZkYtHiQ-0"
    )
}

enum class PortfolioCategory (
    val title: String
){
    MobileKotlin("Android App - jetpack compose"),
    MobileCmp("Mobile App - Compose Multiplatform"),
    MobileFlutter("Mobile App - flutter"),
    UiUx("UI/UX Design")   
    
}