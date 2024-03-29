package com.example.tugasluasmatematika_java.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.tugasluasmatematika_java.R;
import com.example.tugasluasmatematika_java.bangunruang.Beam;
import com.example.tugasluasmatematika_java.bangunruang.Cube;
import com.example.tugasluasmatematika_java.bangunruang.Cylinder;
import com.example.tugasluasmatematika_java.bangunruang.Prism;
import com.example.tugasluasmatematika_java.bangunruang.Pyramid;
import com.example.tugasluasmatematika_java.bangunruang.Sphere;

public class BangunRuangFragment extends Fragment {
    public BangunRuangFragment() {

    }

    CardView cube;
    CardView beam;
    CardView pyramid;
    CardView prism;
    CardView sphere;
    CardView cylinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.bangunruang_fragment, container, false);
        cube = view.findViewById(R.id.cardCube);
        beam = view.findViewById(R.id.cardBeam);
        pyramid = view.findViewById(R.id.cardPyramid);
        prism = view.findViewById(R.id.cardPrism);
        sphere = view.findViewById(R.id.cardSphere);
        cylinder = view.findViewById(R.id.cardCylinder);

        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cube.class);
                startActivity(intent);
            }
        });
        beam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Beam.class);
                startActivity(intent);
            }
        });
        pyramid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Pyramid.class);
                startActivity(intent);
            }
        });
        prism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Prism.class);
                startActivity(intent);
            }
        });
        sphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sphere.class);
                startActivity(intent);
            }
        });
        cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cylinder.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
