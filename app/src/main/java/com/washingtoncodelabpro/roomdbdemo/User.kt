package com.washingtoncodelabpro.roomdbdemo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user-table" )
class User (
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name : String,
    val age : Int
        )