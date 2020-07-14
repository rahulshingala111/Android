package com.rahul.demo;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);

        ArrayList<String> myBikes = new ArrayList<String>();

        myBikes.add("Ducati");
        myBikes.add("Kawasaki");
        myBikes.add("Yamaha");
        myBikes.add("Honda");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myBikes);

        myListView.setAdapter(arrayAdapter);

    }
}