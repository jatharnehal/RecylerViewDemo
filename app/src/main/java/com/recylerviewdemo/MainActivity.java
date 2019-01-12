package com.recylerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.recylerviewdemo.Adapter.CustomAdapter;
import com.recylerviewdemo.Adapter.SimpleDividerItemDecoration;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> personNames=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        personNames.add("person1");
        personNames.add("person2");
        personNames.add("person3");
        personNames.add("person4");
        personNames.add("person5");
        personNames.add("person6");
        personNames.add("person7");
        personNames.add("person8");

        RecyclerView recyclerView=findViewById(R.id.recylerView);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        CustomAdapter customAdapter=new CustomAdapter(MainActivity.this,personNames);
        //recyclerView.addItemDecoration(new SimpleDividerItemDecoration(getApplicationContext()));
        recyclerView.setAdapter(customAdapter);
    }
}
