package com.example.acme.data.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.security.cert.CertPathValidatorException
import java.sql.Date
import java.time.LocalDateTime

@Entity(tableName = "Services")
class  ServiceModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    val idUser: Int?,
    val date: String?,
    val street: String?,
    val city: String?,
    val country: String?,
    val postalCode: String?,
    val name: String?,
    val phone: String?,
    val dispatchNote: String?,
    val department: String?,
    val serviceType: String?,
    val reason: String?
)