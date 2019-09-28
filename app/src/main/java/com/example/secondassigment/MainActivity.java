package com.example.secondassigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    ArrayList<String> topicList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        topicList.add("Android");
        topicList.add("Machine Learning");
        topicList.add("Python");
        //adapter that binds each item of the topicList to a layout for items
        ArrayAdapter<String> myAdapter =
                new ArrayAdapter<String>(
                        this, android.R.layout.simple_list_item_1, topicList);
        simpleList.setAdapter(myAdapter);
        //clickListener that sends information to the other activity

    }
}
