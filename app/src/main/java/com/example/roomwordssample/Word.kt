package com.example.roomwordssample

import android.icu.number.IntegerWidth
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "word_table")
data class Word (
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "word") val word: String
)