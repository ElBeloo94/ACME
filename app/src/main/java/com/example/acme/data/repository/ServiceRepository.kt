package com.example.acme.data.repository

import androidx.lifecycle.LiveData
import com.example.acme.data.db.DatabaseACME
import com.example.acme.data.db.model.ServiceModel
import com.example.acme.data.db.model.User
import java.sql.RowId

class ServiceRepository (
    private val database: DatabaseACME
    ) {

        suspend fun insertService(service: ServiceModel) = database.getServiceDAO().insertService(service)

        suspend fun updateService(service: ServiceModel) = database.getServiceDAO().updateService(service)

        suspend fun deleteService(service: ServiceModel) = database.getServiceDAO().deleteService(service)

        fun getServicesByUserId(userId: Int): LiveData<List<ServiceModel>> = database.getServiceDAO().getServices(userId)

        fun getServicebyId(serviceId: Int): LiveData<ServiceModel> = database.getServiceDAO().getService(serviceId)

    fun getAllServiceby(): LiveData<List<ServiceModel>> = database.getServiceDAO().getAllServices()
}