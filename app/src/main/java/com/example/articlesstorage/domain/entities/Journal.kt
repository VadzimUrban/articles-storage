package com.example.articlesstorage.domain.entities

import java.time.Year

data class Journal(
    val id: Long,
    val title: String,
    val country: String,
    val city: String,
    val year: Year,
    val firstPage: Int,
    val lastPage: Int,
    val otherInformation: String,
)
