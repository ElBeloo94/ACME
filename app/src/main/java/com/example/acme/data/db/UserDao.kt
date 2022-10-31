package com.example.acme.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.acme.data.db.model.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE) //if some data is same/conflict, it'll be replace with new data.
    suspend fun insertUser(user: User)

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun getAllUser(): LiveData<List<User>>

    @Query("SELECT * FROM user_table WHERE userName = :user")
    fun getUserbyName(user: String): LiveData<User>
    // why not use suspend ? because Room does not support LiveData with suspended functions.
    // LiveData already works on a background thread and should be used directly without using coroutines

//    @Query("DELETE FROM user_table")
//    suspend fun clearUser()

//    @Query("DELETE FROM user_table WHERE id = :id") //you can use this too, for delete note by id.
//    suspend fun deleteUserById(id: Int)
}