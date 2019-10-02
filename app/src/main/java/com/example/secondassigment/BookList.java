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
        androidList.add(new Item("Android Studio 3.4 Development Essentials", R.drawable.androidstudioessential));
        androidList.add(new Item("Android Programming: The Big Nerd Ranch Guide", R.drawable.androidprogramming));

        mlList.add(new Item("The Hundred-Page Machine Learning Book", R.drawable.hundredpageml));
        mlList.add(new Item("Hands-On Machine Learning with Scikit-Learn and TensorFlow: Concepts, Tools, and Techniques to Build Intelligent Systems", R.drawable.handonsmachinelearning));

        pythonList.add(new Item("Learning Python", R.drawable.learningpython));
        pythonList.add(new Item("Python Crash Course", R.drawable.pythoncrash));
        pythonList.add(new Item("Starting Out with Python", R.drawable.startingoutwithpython));

    }
}
