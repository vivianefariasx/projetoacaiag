package com.example.projetoacaiag.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projetoacaiag.Adapter.CategoryAdaptor;
import com.example.projetoacaiag.Adapter.PopularAdaptor;
import com.example.projetoacaiag.Domain.CategoryDomain;
import com.example.projetoacaiag.Domain.FoodDomain;
import com.example.projetoacaiag.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
        recyclerViewPopular();
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList = findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category=new ArrayList<>();
        category.add(new CategoryDomain("Granola", "cat_1"));
        category.add(new CategoryDomain("Chocolate", "cat_5"));
        category.add(new CategoryDomain("Amendoim", "cat_3"));
        category.add(new CategoryDomain("Leite em pó", "cat_2"));
        category.add(new CategoryDomain("Farinha Lactea", "cat_4"));



        adapter:new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);

    }

    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPopularList=findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(LinearLayoutManager);


        ArrayList<FoodDomain> foodList=new ArrayList<>();
        foodList.add(new FoodDomain("Açai com morango", "acai1","acai de 300 MLS com pedaços de morango e calda de morango","15.00"));
        foodList.add(new FoodDomain("Açai com morango", "acai2","acai de 300 MLS com pedaços de morango e calda de morango","22.00"));
        foodList.add(new FoodDomain("Açai com kiwi e morango", "acai3","acai de 300 MLS com pedaços de kiwi e morango e calda de kiwi","15.00"));
        foodList.add(new FoodDomain("Açai com kiwi", "acai4","acai de 300 MLS com pedaços de kiwi  e calda de kiwi","15.00"));
        foodList.add(new FoodDomain("Açai com kiwi", "acai5","acai de 300 MLS com pedaços de kiwi  e calda de kiwi","22.00"));

        adapter2=new PopularAdaptor((foodList));
        recyclerViewPopularList.setAdapter(adapter2);


    }
}