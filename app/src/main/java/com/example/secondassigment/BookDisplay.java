package com.example.secondassigment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class BookDisplay extends Activity {
    private static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_display);

        //getting the intend and then the book chosen
        Intent intent = getIntent();
        Item bookChosen =
                (Item) intent.getSerializableExtra(BookList.MESSAGE);

        //instantiating the fragments
        ImageFragment imageFragment = new ImageFragment();
//        getFragmentManager().executePendingTransactions();
//        fragmentManager = getFragmentManager();//Get Fragment Manager
//        DetailFragment detailFragment = new DetailFragment();


//        //instantiating the fragments and displaying them
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//            ImageFragment imageFragment = (ImageFragment) getFragmentManager().findFragmentById(R.id.imageFragment);
//        }
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//            DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
//        }


//        ImageView imageView = (ImageView)
//                findViewById(R.id.bookImage);
//        imageView.setImageResource(bookChosen.getbookImage());

        Bundle argsPicture = new Bundle();
        argsPicture.putInt(ImageFragment.IMAGE_NUMBER,bookChosen.getbookImage());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            imageFragment.setArguments(argsPicture);
        }
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, imageFragment).addToBackStack(null).commit();
//
//        Bundle argsDetail = new Bundle();
//        argsDetail.putInt(BookList.MESSAGE,bookChosen.getbookImage());
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//            detailFragment.setArguments(argsDetail);
//        }

//        TextView bookTitle = (TextView)
//                findViewById(R.id.bookTitle);
//        bookTitle.setText("Title: " + bookChosen.getbookTitle());
//
//        TextView bookAuthor = (TextView)
//                findViewById(R.id.bookAuthor);
//        bookAuthor.setText("Author: " +bookChosen.getbookAuthor());
//
//        TextView bookYear = (TextView)
//                findViewById(R.id.bookYear);
//        bookYear.setText("Year: " +bookChosen.getbookYear());
    }

}
