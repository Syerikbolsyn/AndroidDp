package com.example.mymail

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerviewapplication.MainActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
   private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       sharedPreferences= getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
        val username : String?= sharedPreferences.getString("username","")
        if(username?.isNotEmpty()!!){
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        setContentView(R.layout.activity_login)

     }
    fun onClick (view: View){
        val username: String= username.text.toString()
        val password: String= password.text.toString()
    if(username.isNotEmpty() and password.isNotEmpty()){

        val editor : SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString("username",username)
        editor.putString("password",password)
        editor.apply()

        val intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    }

}