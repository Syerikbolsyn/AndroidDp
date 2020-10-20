package com.example.midterm

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences
    lateinit var items: ArrayList<String>
    lateinit var itemsAdapter: ArrayAdapter<String>
    lateinit var lvItems: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lvItems = findViewById(R.id.task)
        items = ArrayList<String>()
        itemsAdapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1, items
        );
        lvItems.setAdapter(itemsAdapter);
        items.add("First task")


    fun onClick(view: View) {

        val enterText: String = Enter.text.toString()


        if (enterText.isNotEmpty()) {
            lateinit var items: ArrayList<String>
            lateinit var itemsAdapter: ArrayAdapter<String>
            lateinit var lvItems: ListView
            lvItems = findViewById(R.id.task)
            items = ArrayList<String>()
            itemsAdapter = ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1, items
            );
            lvItems.setAdapter(itemsAdapter);
            items.add(enterText);


            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("enterText", enterText)

            editor.apply()


        }
    }
       fun onClick2( view: View){
           val intent: Intent = Intent(this, page2::class.java)
           startActivity(intent)
       }
}
    }



