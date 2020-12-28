package com.example.foodapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.model.AsiaFood;
import com.example.foodapp.model.PopularFood;

import java.util.List;

public class AsiaFoodAdapter extends RecyclerView.Adapter<AsiaFoodAdapter.AsiaFoodViewHolder> {

    Context context;
    List<AsiaFood> asiaFoodList;

    public AsiaFoodAdapter(Context context, List<AsiaFood> asiaFoodList) {
        this.context = context;
        this.asiaFoodList = asiaFoodList;
    }

    @NonNull
    @Override
    public AsiaFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.asia_food_row_item, parent, false);
        return new AsiaFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AsiaFoodViewHolder holder, int position) {
        holder.foodImage.setImageResource(asiaFoodList.get(position).getImageUrl());
        holder.name.setText(asiaFoodList.get(position).getName());
        holder.price.setText(asiaFoodList.get(position).getPrice());
        holder.rating.setText(asiaFoodList.get(position).getRating());
        holder.restaurantname.setText(asiaFoodList.get(position).getRestaurantname());

    }

    @Override
    public int getItemCount() {
        return asiaFoodList.size();
    }

    public static final class AsiaFoodViewHolder extends RecyclerView.ViewHolder {

        ImageView foodImage;
        TextView price, name, rating, restaurantname;

        public AsiaFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name);
            rating = itemView.findViewById(R.id.rating);
            restaurantname = itemView.findViewById(R.id.restaurant_name);
        }
    }
}