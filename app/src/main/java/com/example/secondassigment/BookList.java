package com.example.secondassigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookList extends AppCompatActivity {
    ListView simpleListView;
    HashMap<String, ArrayList<Item>> BookMap = new HashMap<String, ArrayList<Item>>();
    ArrayList<Item> androidList = new ArrayList<>();
    ArrayList<Item> mlList = new ArrayList<>();
    ArrayList<Item> pythonList = new ArrayList<>();
    public final static String MESSAGE = "BookDisplay";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        //defining a variable name for the ListView implemented on the BookList layout
        simpleListView = (ListView) findViewById(R.id.simpleListView);

        androidList.add(new Item("Android Studio 3.4 Development Essentials", R.drawable.androidstudioessential, "Neil Smyth", "2019"));
        androidList.add(new Item("Android Programming: The Big Nerd Ranch Guide", R.drawable.androidprogramming, "Bill Phillips", "2019"));

        mlList.add(new Item("The Hundred-Page Machine Learning Book", R.drawable.hundredpageml, "Andriy Burkov", "2019"));
        mlList.add(new Item("Hands-On Machine Learning with Scikit-Learn and TensorFlow: Concepts, Tools, and Techniques to Build Intelligent Systems", R.drawable.handonsmachinelearning, "Aurélien Géron", "2019"));

        pythonList.add(new Item("Learning Python: Powerful Object-Oriented Programming", R.drawable.learningpython, "Mark Lutz", "2013"));
        pythonList.add(new Item("Python Crash Course", R.drawable.pythoncrash, "Eric Matthes", "2019"));
        pythonList.add(new Item("Starting Out with Python", R.drawable.startingoutwithpython, "Tony Gaddis", "2019"));

        //adding the lists to the hashmap variable
        BookMap.put("Android", androidList);
        BookMap.put("Machine Learning", mlList);
        BookMap.put("Python", pythonList);

        //getting the intend and checking its selection
        Intent intent = getIntent();
        String subjectSelected =
                intent.getStringExtra(MainActivity.MESSAGE);

        //creating the adapter used to bind the ArrayList, the ListView and its layout
        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_view_items, BookMap.get(subjectSelected));
        simpleListView.setAdapter(myAdapter);

        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item bookSelected = (Item) simpleListView.getItemAtPosition(position);

                try {
                    Intent intent = new Intent(BookList.this, BookDisplay.class);
                    intent.putExtra(MESSAGE, bookSelected);
                    startActivity(intent);
                } catch (Exception e) {/* Log error messages */}
            }
        });//end of setOnClickListener()


    }
}
