package com.example.secondassigment;

import android.annotation.SuppressLint;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;


@SuppressLint("ValidFragment")
class PictureFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.picture_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        int bookImageNumber = getArguments().getInt("book_image");
//        setImage(bookImageNumber);
    }

//    public void setImage (int bookImageNumber) {
//        ImageView imageView = (ImageView) getActivity().findViewById(R.id.bookImage); //This could be wrong because it is expending to find it from the activity
//        imageView.setImageResource(bookImageNumber);
//    }

    public interface OnItemSelectedListener {
        void onDateTimeItemSelected(String arg);
    }


}
