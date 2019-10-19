package com.example.secondassigment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

@SuppressLint({"NewApi", "ValidFragment"})
class PictureFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.picture_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int bookImageNumber = getArguments().getInt("book_image");
        setImage(bookImageNumber);
    }

    public void setImage (int bookImageNumber) {
        ImageView imageView = (ImageView) findViewById(R.id.bookImage);
        imageView.setImageResource(bookImageNumber);
    }


}
