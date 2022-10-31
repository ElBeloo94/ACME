package com.example.acme.data.repository

import androidx.lifecycle.LiveData
import com.example.acme.data.db.DatabaseACME
import com.example.acme.data.db.model.User
import kotlinx.coroutines.flow.Flow

class UserRepository(
    private val database: DatabaseACME
) {

    suspend fun   insertUser(user: User) = database.getUserDao().insertUser(user)

    suspend fun updateUser(user: User) = database.getUserDao().updateUser(user)

    suspend fun deleteUser(user: User) = database.getUserDao().deleteUser(user)

    //suspend fun deleteUserById(id: Int) = database.getUserDao().deleteUserById(id)

    //suspend fun clearUser() = database.getUserDao().clearUser()

    fun getAllUser(): LiveData<List<User>> = database.getUserDao().getAllUser()

    fun getUserbyName(name: String): LiveData<User> = database.getUserDao().getUserbyName(name)
}