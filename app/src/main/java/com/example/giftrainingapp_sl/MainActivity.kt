package com.example.giftrainingapp_sl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var searchBar: SearchView
    private lateinit var textBox: TextView
    //private lateinit var layoutGrid: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchBar = findViewById(R.id.gifSearch)
        textBox = findViewById(R.id.textView)
        //layoutGrid = findViewById(R.id.rvGifsGrid)

        searchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                //TODO("Take search query and apply it to the API")
                textBox.text = "You have searched $query"
                return false
            }

            //TODO ("Correct way of dealing with this function")
            override fun onQueryTextChange(newText: String?): Boolean {
                //This was here to test whether it worked, as I had never done this
                //textBox.text = newText
                return false
            }

        } )

        //TODO ("Implement recycler view")
        //TODO ("Implement getting information from API and apply it to RecView")
    }
}