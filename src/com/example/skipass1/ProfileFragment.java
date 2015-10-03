package com.example.skipass1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Alyosha on 02.10.2015.
 */
public class ProfileFragment extends Fragment {

    Button _edit;

    public ProfileFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        _edit = (Button) rootView.findViewById(R.id.edit_button);


        _edit.setOnClickListener(new View.OnClickListener(){
            Fragment fragment = null;

            @Override
            public void onClick(View v) {
                fragment = new ProfileEditFragment();

                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

            }
        });

        return rootView;
    }

}
