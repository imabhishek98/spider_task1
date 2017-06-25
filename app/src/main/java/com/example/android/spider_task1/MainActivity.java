package com.example.android.spider_task1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three" );


        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, words);




        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);


    }
}