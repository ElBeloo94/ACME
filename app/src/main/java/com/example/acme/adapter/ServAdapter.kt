package com.example.acme.adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.acme.R
import com.example.acme.activities.WorkTicketActivity
import com.example.acme.activities.UpdateServiceActivity
import com.example.acme.data.db.model.ServiceModel

class ServAdapter(val context: Context, private val mList: List<ServiceModel>) : RecyclerView.Adapter<ServAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_service, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val services = mList[position]

        // sets the text to the textview from our itemHolder class
        holder.dateService.text = services.date
        holder.idService.text = services.id.toString()
        holder.tipeService.text = services.serviceType
        holder.street.text = services.street
        holder.city.text = services.city
        holder.country.text = services.country
        holder.postalCode.text = services.postalCode

        holder.edit.setOnClickListener{
            val sharedPreference =  context.getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.putInt("idService",services.id!!)
            editor.putString("name", services.name)
            editor.putString("phone", services.phone)
            editor.putString("street", services.street)
            editor.putString("city", services.city)
            editor.putString("country", services.country)
            editor.putString("postalCode", services.postalCode)
            editor.putString("date",  services.date)
            editor.putString("dispatchNote", services.dispatchNote)
            editor.putString("serviceType", services.serviceType)
            editor.putString("department", services.department)
            editor.putString("reason", services.reason)
            editor.apply()
            (context as Activity).finish()
            val init = Intent(context, UpdateServiceActivity::class.java)
            context.startActivity(init)
        }

        holder.viewButton.setOnClickListener{
            val sharedPreference =  context.getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.putInt("idService",services.id!!)
            editor.putString("name", services.name)
            editor.putString("phone", services.phone)
            editor.putString("street", services.street)
            editor.putString("city", services.city)
            editor.putString("country", services.country)
            editor.putString("postalCode", services.postalCode)
            editor.putString("date",  services.date)
            editor.putString("dispatchNote", services.dispatchNote)
            editor.putString("serviceType", services.serviceType)
            editor.putString("department", services.department)
            editor.putString("reason", services.reason)
            editor.apply()
            (context as  Activity).finish()
            val init = Intent(context, WorkTicketActivity::class.java)
            context.startActivity(init)
        }

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val dateService: TextView = itemView.findViewById(R.id.dateService)
        val idService: TextView = itemView.findViewById(R.id.idService)
        val tipeService: TextView = itemView.findViewById(R.id.tipeService)
        val street: TextView = itemView.findViewById(R.id.streetService)
        val city: TextView = itemView.findViewById(R.id.cityService)
        val country: TextView = itemView.findViewById(R.id.countryService)
        val postalCode: TextView = itemView.findViewById(R.id.postalCodeService)
        val edit: ConstraintLayout = itemView.findViewById(R.id.car)
        val viewButton : Button = itemView.findViewById(R.id.viewService)
    }
}