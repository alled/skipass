package com.example.skipass1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alyosha on 02.10.2015.
 */
public class SkipassFragment extends Fragment {

    public SkipassFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_skipass, container, false);

        return rootView;
    }

}
