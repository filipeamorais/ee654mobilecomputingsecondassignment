package com.example.secondassigment;

import android.app.Fragment;
import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {

    public static final String DETAIL_INFO ="DETAIL_INFO";

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = getArguments();
        String [] bookDetail = bundle.getStringArray(DETAIL_INFO);
        setText(bookDetail[0], R.id.bookTitle, "Title: ");
        setText(bookDetail[1], R.id.bookAuthor, "Author: ");
        setText(bookDetail[2], R.id.bookYear, "Year: ");
    }

    public void setText (String bookDetail, int textViewName, String caption) {
        TextView textView = (TextView) getView().findViewById(textViewName);
        textView.setText(caption + bookDetail);
    }
}
