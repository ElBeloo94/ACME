package com.example.acme.data.db

import android.content.Context
import androidx.lifecycle.Observer
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.acme.activities.SignInActivity
import com.example.acme.data.db.model.Converters
import com.example.acme.data.db.model.ServiceModel
import com.example.acme.data.db.model.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@Database(
    entities = [User::class,ServiceModel::class],
    version = 1,
    exportSchema = false
)
//@TypeConverters(Converters::class)
abstract class DatabaseACME: RoomDatabase() {
    abstract fun getUserDao(): UserDao
    abstract fun getServiceDAO(): ServicesDao

    companion object {

        @Volatile
        private var INSTANCE: DatabaseACME? = null

        fun getDatabase(context: Context): DatabaseACME {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            if (INSTANCE == null) {
                synchronized(this) {
                    // Pass the database to the INSTANCE
                    INSTANCE = buildDatabase(context)
                            var user1 = User(
                                id = 0,
                                name = "Sharo Villanueva",
                                userName = "sharo",
                                password = "sharo",
                                phoneNumber = "+5355532332"
                            )
                            var user2 = User(
                                id = 1,
                                name = "Abel Davila",
                                userName = "abel",
                                password = "abel",
                                phoneNumber = "+53580322"
                            )
                            CoroutineScope(Dispatchers.Main).launch {
                                INSTANCE!!.getUserDao().insertUser(user1).also {  }
                            }
                            CoroutineScope(Dispatchers.Main).launch {
                                INSTANCE!!.getUserDao().insertUser(user2).also {  }
                            }
                }
            }
            // Return database.
            return INSTANCE!!
        }

        private fun buildDatabase(context: Context): DatabaseACME {
            return Room.databaseBuilder(
                context.applicationContext,
                DatabaseACME::class.java,
                "database"
            ).allowMainThreadQueries()
                .build()
        }
    }
}