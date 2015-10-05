package com.example.skipass2.app;

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
public class ProfileEditFragment extends Fragment {

    Button _submit;

    public ProfileEditFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_edit_profile, container, false);
        _submit = (Button) rootView.findViewById(R.id.submit_button);


        _submit.setOnClickListener(new View.OnClickListener(){
            Fragment fragment = null;

            @Override
            public void onClick(View v) {
                //SUBMIT
                fragment = new ProfileFragment();

                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

            }
        });

        return rootView;
    }

}
