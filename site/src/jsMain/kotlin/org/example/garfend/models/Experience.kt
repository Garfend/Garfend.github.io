package org.example.garfend.models

import org.example.garfend.util.Constants.CURRENT_POSITION
import org.example.garfend.util.Constants.SECOND_JOB
import org.example.garfend.util.Constants.THIRD_JOB

enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: String,
    val company: String,
    val from: String,
    val to: String
) {
    First(
        number = "01",
        jobPosition = "Mobile App Developer",
        description = CURRENT_POSITION,
        company = "freelancing",
        from = "November 2024",
        to = "NOW",
    ),
    Second(
        number = "02",
        jobPosition = "Mobile Developer",
        description = SECOND_JOB,
        company = "Depi",
        from = "June 2024",
        to = "October 2024",
    ),
    Third(
        number = "03",
        jobPosition = "Android App Developer",
        description = THIRD_JOB,
        company = "The chance",
        from = " July 2023",
        to = "February 2023",
    )
}