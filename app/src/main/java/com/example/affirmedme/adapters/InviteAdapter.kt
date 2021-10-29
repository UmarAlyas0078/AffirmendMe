package com.example.affirmedme.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmedme.R
import com.example.affirmedme.model.InviteMember

class InviteAdapter(var context: Context, var list: ArrayList<InviteMember>) : RecyclerView.Adapter<InviteAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_invite_member, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val inviteMember = list[position]
        holder.imgUser.setImageResource(inviteMember.imageId)
        holder.lblName.text = inviteMember.name
        holder.lblPhone.text = inviteMember.mNumber
        holder.imgPhone.setImageResource(inviteMember.imagePhone)
    }

    override fun getItemCount(): Int {
        return if (list.size > 0) {
            list.size
        } else {
            0
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhone = itemView.findViewById(R.id.img_phone) as ImageView
        var imgUser = itemView.findViewById(R.id.img_user) as ImageView
        var lblName = itemView.findViewById(R.id.lbl_name) as TextView
        var lblPhone = itemView.findViewById(R.id.lbl_number) as TextView
    }

}