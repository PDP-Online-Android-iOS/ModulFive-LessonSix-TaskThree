package dev.ogabek.java.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.model.Department;

public class DepartmentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Department> departments;

    public DepartmentAdapter(List<Department> departments) {
        this.departments = departments;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_department, parent, false);
        return new DepartmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Department department = departments.get(position);

        if (holder instanceof DepartmentViewHolder) {
            ((DepartmentViewHolder) holder).photo.setImageResource(department.getPhoto());
            ((DepartmentViewHolder) holder).title.setText(department.getTitle());
        }
    }

    @Override
    public int getItemCount() {
        return departments.size();
    }

    private static class DepartmentViewHolder extends RecyclerView.ViewHolder {

        ImageView photo;
        TextView title;

        public DepartmentViewHolder(View view) {
            super(view);

            photo = view.findViewById(R.id.iv_department_photo);
            title = view.findViewById(R.id.tv_department_title);
        }
    }
}

