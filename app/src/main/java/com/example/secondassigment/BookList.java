package com.example.secondassigment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookList extends AppCompatActivity {
    ListView simpleListView;
    HashMap<String, List<Item>> BookMap = new HashMap<String, List<Item>>();
    ArrayList<Item> androidList = new ArrayList<>();
    ArrayList<Item> mlList = new ArrayList<>();
    ArrayList<Item> pythonList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        //defining a variable name for the ListView implemented on the BookList layout
        simpleListView = (ListView) findViewById(R.id.simpleListView);

        //adding items to the ArrayList(s) that will be displayed by the ListView according to the selection
        androidList.add(new Item("Python Crash Course", R.drawable.pythoncrash));
        androidList.add(new Item("Starting Out with Python", R.drawable.startingoutwithpython));

        mlList.add(new Item("Starting Out with Python", R.drawable.brazil_flag));
        pythonList.add(new Item("Brazil", R.drawable.brazil_flag));


    }
}
