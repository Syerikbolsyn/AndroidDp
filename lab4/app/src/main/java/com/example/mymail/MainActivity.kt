package com.example.recyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymail.R
import com.example.mymail.User
import com.example.recyclerviewapplication.UserListAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val users= ArrayList<User>()
        for(i in 1..100){
            users.add(User("Name"+i, "explayee", 20+i))
        }
        val userListAdapter=UserListAdapter(users,this)
        val layoutManager=LinearLayoutManager(this)
        recycleriew.layoutManager=layoutManager
        recyclerview.adapter=UserListAdapter


    }

}