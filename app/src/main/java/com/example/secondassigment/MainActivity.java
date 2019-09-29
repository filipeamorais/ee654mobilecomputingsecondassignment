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

    ListView simpleList;
    ArrayList<String> topicList = new ArrayList<>();
    public final static String MESSAGE = "BookList";

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
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String book = (String) simpleList.getItemAtPosition(position);
                Toast.makeText(getBaseContext(), book, Toast.LENGTH_SHORT).show();
                try {
                    Intent intent = new Intent(MainActivity.this, BookList.class);
                    intent.putExtra(MESSAGE, book);
                    startActivity(intent);
                } catch (Exception e) {/* Log error messages */}
            }
        });//end of setOnClickListener()
    }// end of onCreate()
}// end of class MainActivity
