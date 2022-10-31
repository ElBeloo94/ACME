package com.example.acme.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.acme.data.db.model.ServiceModel

@Dao
interface ServicesDao {

    @Query("SELECT * FROM Services WHERE id = :idService")
    fun getService (idService: Int): LiveData<ServiceModel>

    @Query("SELECT * FROM Services WHERE idUser = :user ORDER BY id ASC")
    fun getServices (user: Int): LiveData<List<ServiceModel>>

    @Query("SELECT * FROM Services ORDER BY id ASC")
    fun getAllServices (): LiveData<List<ServiceModel>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertService( services: ServiceModel)

    @Update
    fun updateService(services: ServiceModel)

    @Delete
    fun deleteService(services: ServiceModel)
}