package com.example.android.spider_task1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> words = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        words.add("one");
        words.add("two");
        words.add("three" );


        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, words);




        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);



    }

    public void addButton(View view)
    {
        EditText temp = (EditText) findViewById(R.id.add_field);
        String x= temp.getText().toString();
        if(x!= null)
        words.add(x);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, words);




        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);
    }
    public void removeButton(View view)
    {
        EditText tempp = (EditText) findViewById(R.id.remove_field);
        String y= tempp.getText().toString();
        int x =  Integer.parseInt(y);
        x+=1;
        if(x<=words.size() +1 )
        {x--;
            x--;
        words.remove(x);

        }
        else
        {
           Toast.makeText(this,"Element does not exits enter", Toast.LENGTH_SHORT).show();
        }
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, words);




        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);

    }

}