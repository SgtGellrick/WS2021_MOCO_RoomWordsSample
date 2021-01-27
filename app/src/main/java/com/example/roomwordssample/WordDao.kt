package com.example.roomwordssample

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {

    @Query(/*TODO: SQL ABFRAGE aller Wörter der word_table aufsteigend sortiert*/)
    fun getAlphabetizedWords(): Flow<List<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    /*TODO: Hier muss die Funktion für ein Insert noch hizugefügt werden*/

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()
}