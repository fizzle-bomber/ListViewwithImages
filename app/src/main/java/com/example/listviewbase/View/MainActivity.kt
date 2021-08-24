package com.example.listviewbase.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.listviewbase.Adapter.CustomListAdapter
import com.example.listviewbase.Model.Data
import com.example.listviewbase.R

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var customListAdapter: CustomListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userdata = listOf<Data>(Data("Sanjay" , "How are you"),
            Data("Sanjay" , "How are you"),
            Data("Sanjay" , "How are you"),
            Data("Sanjay" , "How are you"),
            Data("Sanjay" , "How are you"),
            Data("Sanjay" , "How are you"),
            Data("Sanjay" , "How are you"),
            Data("Sanjay" , "How are you"),
            Data("Sanjay" , "How are you"),
            Data("Sanjay" , "How are you"),
            Data("Sanjay" , "How are you"),
            Data("Sanjay" , "How are you"),
            Data("Sanjay" , "How are you"),
            Data("Sanjay" , "How are you"))


        listView = findViewById(R.id.list_item)
        customListAdapter = CustomListAdapter(this , userdata)
        listView.adapter = customListAdapter
    }
}