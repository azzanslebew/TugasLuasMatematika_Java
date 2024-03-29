package com.example.tugasluasmatematika_java.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.tugasluasmatematika_java.R;
import com.example.tugasluasmatematika_java.bangundatar.Circle;
import com.example.tugasluasmatematika_java.bangundatar.Parallelogram;
import com.example.tugasluasmatematika_java.bangundatar.Rectangle;
import com.example.tugasluasmatematika_java.bangundatar.Rhombus;
import com.example.tugasluasmatematika_java.bangundatar.Square;
import com.example.tugasluasmatematika_java.bangundatar.Triangle;

public class BangunDatarFragment extends Fragment {

    public BangunDatarFragment() {

    }

    CardView square;
    CardView rectangle;
    CardView triangle;
    CardView circle;
    CardView rhombus;
    CardView parallelogram;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.bangundatar_fragment, container, false);
        square = view.findViewById(R.id.cardSquare);
        rectangle = view.findViewById(R.id.cardRectangle);
        triangle = view.findViewById(R.id.cardTriangle);
        circle = view.findViewById(R.id.cardCircle);
        rhombus = view.findViewById(R.id.cardRhombus);
        parallelogram = view.findViewById(R.id.cardParallelogram);

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Square.class);
                startActivity(intent);
            }
        });
        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Rectangle.class);
                startActivity(intent);
            }
        });
        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Triangle.class);
                startActivity(intent);
            }
        });
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Circle.class);
                startActivity(intent);
            }
        });
        rhombus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Rhombus.class);
                startActivity(intent);
            }
        });
        parallelogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Parallelogram.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
