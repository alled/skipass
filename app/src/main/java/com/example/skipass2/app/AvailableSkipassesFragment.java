package com.example.skipass2.app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.melnykov.fab.FloatingActionButton;


/**
 * Created by Alyosha on 04.10.2015.
 */
public class AvailableSkipassesFragment extends ListFragment {

    ListView list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_ava_skipasses, container, false);
        list = (ListView) contentView.findViewById(android.R.id.list);
        setListAdapter(new MyAdapter());

        FloatingActionButton addButton = (FloatingActionButton) contentView.findViewById(R.id.add_button);
        addButton.attachToListView(list);



        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "add", Toast.LENGTH_LONG).show();
            }
        });


        return contentView;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Fragment fragment = new SkipassFragment();
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).addToBackStack( "tag" ).commit();


    }




    private class MyAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return Data.Skipasses.length;
        }

        @Override
        public String getItem(int position) {
            return Data.Skipasses[position];
        }

        @Override
        public long getItemId(int position) {
            return Data.Skipasses[position].hashCode();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup container) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item, container, false);
            }

            ((TextView) convertView.findViewById(android.R.id.text1))
                    .setText(getItem(position));
            return convertView;
        }
    }

}