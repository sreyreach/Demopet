package com.sreyreach_sem.demopet;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdater extends RecyclerView.Adapter<CustomAdater.MyViewHolder> {
    List<Model> my_list;
    Context context;

    public CustomAdater(List<Model> my_list, Context context) {
        this.my_list = my_list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model model = my_list.get(position);
        holder.name.setText(model.getPet_name());
        holder.age.setText(model.getPet_age());
        holder.type.setText(model.getPet_type());
        holder.price.setText(model.getPet_price());
        holder.image.setImageDrawable(context.getResources().getDrawable(model.getImage()));

    }

    @Override
    public int getItemCount() {
        return my_list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name,age,type,price;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.chily_age);
            type = itemView.findViewById(R.id.chily_type);
            price = itemView.findViewById(R.id.chily_price);
        }
    }
}
