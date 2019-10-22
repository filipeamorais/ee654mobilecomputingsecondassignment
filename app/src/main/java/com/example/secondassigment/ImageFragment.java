package com.example.secondassigment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageFragment extends Fragment {

    public static final String IMAGE_NUMBER ="IMAGE_NUMBER";

    public ImageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = getArguments();
        int bookImageNumber = bundle.getInt("IMAGE_NUMBER");
        setImage(bookImageNumber);
    }

    public void setImage (int bookImageNumber) {
        ImageView imageView = (ImageView) getView().findViewById(R.id.bookImage); //This could be wrong because it is expending to find it from the activity
        imageView.setImageResource(bookImageNumber);
    }

}
