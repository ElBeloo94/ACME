package com.example.acme.data.viewModel

import androidx.lifecycle.ViewModel
import com.example.acme.data.db.model.ServiceModel
import com.example.acme.data.repository.ServiceRepository

class ServiceViewModel(
    private val repository: ServiceRepository
): ViewModel() {

    suspend fun insertService(service: ServiceModel) = repository.insertService(service)

    suspend fun updateService(service: ServiceModel) = repository.updateService(service)

    suspend fun deleteService(service: ServiceModel) = repository.deleteService(service)

    fun getServicesByUserId(idUser: Int) = repository.getServicesByUserId(idUser)

    fun getServicebyId(idService: Int) = repository.getServicebyId(idService)

    fun getAllService() = repository.getAllServiceby()
}