package com.washingtoncodelabpro.roomdbdemo

import androidx.room.*

@Dao
interface UserDao {

    @Insert
    fun addUser(user:User)

    @Delete
    fun deleteUser(user:User)

    @Update
    fun updateUser(user:User)

    @Query("SELECT * FROM `user-table`  ORDER BY id DESC")
    fun getAllUsers() : List<User>
}