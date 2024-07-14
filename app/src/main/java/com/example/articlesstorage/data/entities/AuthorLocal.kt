package com.example.articlesstorage.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

private const val AUTHOR_TABLE_NAME = "author"

@Entity(tableName = AUTHOR_TABLE_NAME)
data class AuthorLocal(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "lastname") val lastname: String,
    @ColumnInfo(name = "surname") val surname: String,
)
