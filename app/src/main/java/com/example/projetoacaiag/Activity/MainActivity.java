package com.example.projetoacaiag.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projetoacaiag.Adapter.CategoryAdaptor;
import com.example.projetoacaiag.Domain.CategoryDomain;
import com.example.projetoacaiag.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewCategoryList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList = findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category=new ArrayList<>();
        category.add(new CategoryDomain("Frutas", "cat_1"));
        category.add(new CategoryDomain("Chocolate", "cat_5"));
        category.add(new CategoryDomain("Amendoim", "cat_3"));
        category.add(new CategoryDomain("Leite em pó", "cat_2"));
        category.add(new CategoryDomain("Farinha Lactea", "cat_4"));



        adapter:new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);









    }
}