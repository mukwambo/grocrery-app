package com.mastercode.groceryapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GroceryCustomAdapter(private val context:Context, private val groceriesList:ArrayList<Groceries>)
    :RecyclerView.Adapter<GroceryCustomAdapter.MyViewHolder>(){

    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        // We initialize the views in our custom layout in the view holder class
       val groceryImg: ImageView
       val groceryName: TextView
       val description: TextView

       init {
           groceryImg = itemView.findViewById(R.id.groceryImg)
           groceryName = itemView.findViewById(R.id.groceryName)
           description = itemView.findViewById(R.id.description)

           // Set the on Click listener
           itemView.setOnClickListener {
               Toast.makeText(context, "You chose ${groceriesList[adapterPosition].groceryName}",
                   Toast.LENGTH_SHORT).show()
           }
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // This method is called by the recycler View if it needs to create a new instance
        val newView = LayoutInflater.from(parent.context).inflate(R.layout.grocery_custom_layout,
            parent, false)
        return MyViewHolder(newView)
    }

    override fun getItemCount(): Int {
        // This method returns the total number of items in the data set
        return groceriesList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // This method binds data to a view holder at a specific position
        holder.groceryImg.setImageResource(groceriesList[position].groceryImg)
        holder.groceryName.text = groceriesList[position].groceryName
        holder.description.text = groceriesList[position].description
    }

}