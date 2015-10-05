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

public class ResortsFragment extends ListFragment  {

    ListView list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_resorts, container, false);
        list = (ListView) contentView.findViewById(android.R.id.list);
        setListAdapter(new MyAdapter());
        return contentView;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Fragment fragment = new AvailableSkipassesFragment();
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).addToBackStack( "tag" ).commit();

        //((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("aa");


    }



    private class MyAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return Data.Resorts.length;
        }

        @Override
        public String getItem(int position) {
            return Data.Resorts[position];
        }

        @Override
        public long getItemId(int position) {
            return Data.Resorts[position].hashCode();
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