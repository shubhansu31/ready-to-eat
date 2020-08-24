package com.e.untammeddragons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    List<String> itemList;
    List<Integer> priceList;
    List<Integer> imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        itemList = new ArrayList<>();
        priceList = new ArrayList<>();
        imageList = new ArrayList<>();

        recyclerView = findViewById(R.id.recyclerView);
        myAdapter = new MyAdapter(itemList, priceList, imageList);

//        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(myAdapter);

        itemList.add("Aloo-Paratha");
        itemList.add("Burger");
        itemList.add("Chole-Bhature");
        itemList.add("Coffee");
        itemList.add("Cold-Coffee");
        itemList.add("Hot-Dog");
        itemList.add("Masala-Dosa");
        itemList.add("Plain-Dosa");
        itemList.add("Samosa");
        itemList.add("Tea");

        priceList.add(45);
        priceList.add(25);
        priceList.add(45);
        priceList.add(20);
        priceList.add(30);
        priceList.add(20);
        priceList.add(45);
        priceList.add(35);
        priceList.add(10);
        priceList.add(10);

        imageList.add(R.drawable.aloo_paratha);
        imageList.add(R.drawable.burger);
        imageList.add(R.drawable.chole_bhature);
        imageList.add(R.drawable.coffee);
        imageList.add(R.drawable.cold_coffee);
        imageList.add(R.drawable.hot_dog);
        imageList.add(R.drawable.masala_dosa);
        imageList.add(R.drawable.plain_dosa);
        imageList.add(R.drawable.samosa);
        imageList.add(R.drawable.tea);

    }
}