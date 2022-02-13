package dev.ogabek.kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.model.Department

class DepartmentAdapter(var departments: List<Department>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_department, parent, false)
        return DepartmentViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val department: Department = departments[position]
        if (holder is DepartmentViewHolder) {
            holder.photo.setImageResource(department.photo)
            holder.title.setText(department.title)
        }
    }

    override fun getItemCount(): Int {
        return departments.size
    }

    private class DepartmentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var photo: ImageView = view.findViewById(R.id.iv_department_photo)
        var title: TextView = view.findViewById(R.id.tv_department_title)

    }

}