package com.example.acme.data.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    val userName: String?,
    val password: String?,
    val phoneNumber:String?,
    val name: String?
)