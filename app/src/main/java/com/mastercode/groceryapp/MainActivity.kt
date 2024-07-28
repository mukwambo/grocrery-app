package com.mastercode.groceryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // The adapter view
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)

        // The data source
        val groceriesList = ArrayList<Groceries>()

        val beverage = Groceries(R.drawable.beverage, "Beverages", "Beverages")
        val bread = Groceries(R.drawable.bread, "Bread", "Bread, Wheat and Beans")
        val fruit = Groceries(R.drawable.fruit,"Fruits", "Fresh fruits from the garden")
        val milk = Groceries(R.drawable.milk, "Milk", "Milk, Shakes and Yoghurt")
        val popcorn = Groceries(R.drawable.popcorn, "Popcorn","Popcorn, Donut and Drinks")
        val vegetables = Groceries(R.drawable.vegetables, "Vegetables", "Delicious vegetables")

        groceriesList.add(beverage)
        groceriesList.add(bread)
        groceriesList.add(fruit)
        groceriesList.add(milk)
        groceriesList.add(popcorn)
        groceriesList.add(vegetables)

        // The adapter
        recyclerView.adapter = GroceryCustomAdapter(this, groceriesList)
    }
}