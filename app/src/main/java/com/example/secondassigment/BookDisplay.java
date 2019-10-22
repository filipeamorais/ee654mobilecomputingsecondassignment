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
        DetailFragment detailFragment = new DetailFragment();

        //saving the arguments and sending to the fragments
        String[] bookDetails = {bookChosen.getbookTitle(), bookChosen.getbookAuthor(), bookChosen.getbookYear()};
        Bundle argsFragment = new Bundle();
        argsFragment.putInt(ImageFragment.IMAGE_NUMBER,bookChosen.getbookImage());
        argsFragment.putStringArray(DetailFragment.DETAIL_INFO, bookDetails);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            imageFragment.setArguments(argsFragment);
            detailFragment.setArguments(argsFragment);
        }

        //running the transaction of the fragments
        if (getResources().getBoolean(R.bool.twoPaneMode)) {
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container_land, imageFragment).addToBackStack(null).commit();
            FragmentTransaction transaction_2 = getFragmentManager().beginTransaction();
            transaction_2.replace(R.id.fragment_container_2_land, detailFragment).addToBackStack(null).commit();
        } else {
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, imageFragment).addToBackStack(null).commit();
            FragmentTransaction transaction_2 = getFragmentManager().beginTransaction();
            transaction_2.replace(R.id.fragment_container_2, detailFragment).addToBackStack(null).commit();
        }
    }

}
