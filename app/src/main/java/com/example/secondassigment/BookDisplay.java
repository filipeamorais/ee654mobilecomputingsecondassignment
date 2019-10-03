package com.example.secondassigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_display);

        //getting the intend and checking its selection
        Intent intent = getIntent();
        Item bookChosen =
                (Item) intent.getSerializableExtra(BookList.MESSAGE);

        ImageView imageView = (ImageView)
                findViewById(R.id.bookImage);
        imageView.setImageResource(bookChosen.getbookImage());

        TextView bookTitle = (TextView)
                findViewById(R.id.bookTitle);
        bookTitle.setText("Title: " + bookChosen.getbookTitle());

        TextView bookAuthor = (TextView)
                findViewById(R.id.bookAuthor);
        bookAuthor.setText("Author: " +bookChosen.getbookAuthor());

        TextView bookYear = (TextView)
                findViewById(R.id.bookYear);
        bookYear.setText("Year: " +bookChosen.getbookYear());
    }
}
