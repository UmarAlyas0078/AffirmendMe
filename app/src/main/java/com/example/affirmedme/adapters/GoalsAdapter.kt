package com.example.affirmedme.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmedme.R
import com.example.affirmedme.model.Goals

class GoalsAdapter(var context: Context, var list: ArrayList<Goals>) :
    RecyclerView.Adapter<GoalsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itrem_goals, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val goalsList = list[position]
        holder.lblGoalAction.text = goalsList.name
    }

    override fun getItemCount(): Int {
        return if (list.size > 0) {
            6
        } else {
            0
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var lblGoalAction = itemView.findViewById(R.id.lbl_goal_action) as TextView
    }

}