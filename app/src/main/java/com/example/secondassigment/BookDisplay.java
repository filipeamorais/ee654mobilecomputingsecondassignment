package com.example.secondassigment;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

public class BookDisplay extends FragmentActivity implements PictureFragment.OnItemSelectedListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_display);

        //getting the intend and then the book chosen
        Intent intent = getIntent();
        Item bookChosen =
                (Item) intent.getSerializableExtra(BookList.MESSAGE);

        //instantiating the fragments
        PictureFragment pictureFragment = new PictureFragment();
//        DetailFragment detailFragment = new DetailFragment();


//        //instantiating the fragments and displaying them
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//            PictureFragment pictureFragment = (PictureFragment) getFragmentManager().findFragmentById(R.id.pictureFragment);
//        }
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//            DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
//        }


//        ImageView imageView = (ImageView)
//                findViewById(R.id.bookImage);
//        imageView.setImageResource(bookChosen.getbookImage());

        Bundle argsPicture = new Bundle();
        argsPicture.putInt("book_image",bookChosen.getbookImage());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            pictureFragment.setArguments(argsPicture);
        }
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

    @Override
    public void onDateTimeItemSelected(String info) {

    }
}
