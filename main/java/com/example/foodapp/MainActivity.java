package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodapp.adapter.AsiaFoodAdapter;
import com.example.foodapp.adapter.PopularFoodAdapter;
import com.example.foodapp.model.AsiaFood;
import com.example.foodapp.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsiaFoodAdapter asiaFoodAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<PopularFood> popularFoodList = new ArrayList<>();
        popularFoodList.add(new PopularFood("Float Cake Vietnam","Rs. 400",R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chicken Drumsticks","Rs. 320",R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka Masala","Rs. 280",R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Float Cake Vietnam","Rs. 400",R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chicken Drumsticks","Rs. 320",R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka Masala","Rs. 280",R.drawable.popularfood3));

        setPopularRecycler(popularFoodList);

        List<AsiaFood> asiaFoodList = new ArrayList<>();
        asiaFoodList.add(new AsiaFood("Chicago Pizza","Rs. 420","Chicago Pizzeria","4.5",R.drawable.asiafood1));
        asiaFoodList.add(new AsiaFood("Strawberry Cake","Rs. 290","Bakery Star","4.0",R.drawable.asiafood2));

        setAsiaRecycler(asiaFoodList);

    }

    private void setPopularRecycler(List<PopularFood> popularFoodList){
        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this,popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }
    private void setAsiaRecycler(List<AsiaFood> asiaFoodList){
        asiaRecycler = findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        asiaRecycler.setLayoutManager(layoutManager);
        asiaFoodAdapter = new AsiaFoodAdapter(this,asiaFoodList);
        asiaRecycler.setAdapter(asiaFoodAdapter);
    }
}