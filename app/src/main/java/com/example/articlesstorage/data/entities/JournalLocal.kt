package com.example.articlesstorage.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Year

private const val JOURNAL_TABLE_NAME = "journals"

@Entity(tableName = JOURNAL_TABLE_NAME)
data class JournalLocal(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "country") val country: String,
    @ColumnInfo(name = "city") val city: String,
    @ColumnInfo(name = "year") val year: Int,
    @ColumnInfo(name = "first_page") val firstPage: Int,
    @ColumnInfo(name = "last_page") val lastPage: Int,
    @ColumnInfo(name = "other_information") val otherInformation: String,
)
