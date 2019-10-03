package com.example.secondassigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView simpleListView;
    ArrayList<String> topicList = new ArrayList<>();
    public final static String MESSAGE = "BookList";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleListView = (ListView) findViewById(R.id.simpleListView);
        topicList.add("Android");
        topicList.add("Machine Learning");
        topicList.add("Python");
        //adapter that binds each item of the topicList to a layout for items
        ArrayAdapter<String> myAdapter =
                new ArrayAdapter<String>(
                        this, android.R.layout.simple_list_item_1, topicList);
        simpleListView.setAdapter(myAdapter);
        //clickListener that sends information to the other activity
        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String subject = (String) simpleListView.getItemAtPosition(position);
                Toast.makeText(getBaseContext(), subject, Toast.LENGTH_SHORT).show();
                try {
                    Intent intent = new Intent(MainActivity.this, BookList.class);
                    intent..putExtra(MESSAGE, subject);
                    startActivity(intent);
                } catch (Exception e) {/* Log error messages */}
            }
        });//end of setOnClickListener()
    }// end of onCreate()
}// end of class MainActivity
