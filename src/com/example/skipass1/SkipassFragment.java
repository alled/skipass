package com.example.skipass1;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Alyosha on 02.10.2015.
 */
public class SkipassFragment extends ListFragment {

    ListView list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_skipass, container, false);
        list = (ListView) contentView.findViewById(android.R.id.list);
        setListAdapter(new MyAdapter());
        return contentView;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // TODO implement some logic
    }


    private class MyAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return SkipassList.Skipasses.length;
        }

        @Override
        public String getItem(int position) {
            return SkipassList.Skipasses[position];
        }

        @Override
        public long getItemId(int position) {
            return SkipassList.Skipasses[position].hashCode();
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
