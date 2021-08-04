package com.washingtoncodelabpro.roomdbdemo

/*
class UserDatabase {

}*/


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class],exportSchema = false, version = 1)
abstract class UserDatabase : RoomDatabase() {

    //Access methods in the DAO class
    abstract val userDao: UserDao

    companion object{
        @Volatile
        private var INSTANCE: UserDatabase? = null

        fun getInstance(context: Context) : UserDatabase{

            synchronized(this){
                var instance = INSTANCE

                if (instance == null){
                    instance = Room.databaseBuilder(context.applicationContext,
                        UserDatabase::class.java,
                        "user_database").build()

                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}