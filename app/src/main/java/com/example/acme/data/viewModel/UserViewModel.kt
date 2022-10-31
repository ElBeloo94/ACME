package com.example.acme.data.viewModel

import androidx.lifecycle.ViewModel
import com.example.acme.data.db.model.User
import com.example.acme.data.repository.UserRepository


class UserViewModel(
    private val repository: UserRepository
): ViewModel() {

    suspend fun insertUser(user: User) = repository.insertUser(user)

    suspend fun updateUser(user: User) = repository.updateUser(user)

    suspend fun deleteUser(user: User) = repository.deleteUser(user)

    //suspend fun deleteUserById(id: Int) = repository.deleteUserById(id)

    //suspend fun clearUser() = repository.clearUser()

    fun getAllUser() = repository.getAllUser()

    fun getUserbyName(name: String) = repository.getUserbyName(name)
}