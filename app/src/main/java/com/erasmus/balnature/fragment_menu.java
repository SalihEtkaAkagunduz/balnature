package com.erasmus.balnature;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class fragment_menu extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View ff=inflater.inflate(R.layout.fragment_veri, container, false);
        // Inflate the layout for this fragment
        return ff; }
}