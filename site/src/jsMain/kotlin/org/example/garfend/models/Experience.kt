package org.example.garfend.models

import org.example.garfend.util.Constants.listOfJobs


enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: String,
    val company: String,
    val from: String,
    val to: String,
    val active: Boolean = false
) {
    First(
        number = "01",
        jobPosition = "Mobile App Developer",
        description = listOfJobs.first(),
        company = "freelancing",
        from = "November 2024",
        to = "NOW",
        active = true
    ),
    Second(
        number = "02",
        jobPosition = "Flutter Developer",
        description = listOfJobs[1],
        company = "Ebda3 Tech",
        from = "May 2025",
        to = "NOW",
        active = true
    ),
    Third(
        number = "03",
        jobPosition = "Android App Development Trainee",
        description = listOfJobs[2],
        company = "The chance bootcamp",
        from = " July 2023",
        to = "February 2023",
    ),
    Fourth(
        number = "04",
        jobPosition = "Front-end and cross-platform development trainee",
        description = listOfJobs[3],
        company = "ITI",
        from = " Feb 2025",
        to = "Aug 2025",
    ),
    Fifth(
        number = "05",
        jobPosition = "Android and Cross-platform development trainee",
        description = listOfJobs[4],
        company = "DEPI",
        from = "Apr 2024",
        to = "Oct 2024",
    );

}