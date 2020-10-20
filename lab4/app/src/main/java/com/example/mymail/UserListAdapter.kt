package com.example.recyclerviewapplication
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mymail.R
import com.example.mymail.User

class UserListAdapter(val users: ArrayList<User>, val context: Context):RecyclerView.Adapter<UserListAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view =LayoutInflater.from(context).inflate(R.layout.activity_main,parent,false)
    return MyViewHolder(view)
    }


    override fun getItemCount(): Int {
         return users.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val userr: User= users.get(position)
        holder.nameText=userr.name
        holder.positionText=userr.position

    }
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
    var nameText: TextView=view.findViewById(R.id.name1)
        var positionText: TextView=view.findViewById(R.id.position)
    }
}

