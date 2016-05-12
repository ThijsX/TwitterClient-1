package com.example.thijs.twitterclient.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thijs.twitterclient.R;
import com.example.thijs.twitterclient.model.Data;
import com.example.thijs.twitterclient.model.DataModel;

import java.util.ArrayList;

/**
 * Created by thijs on 27-4-2016.
 */
public class ListAdapter extends ArrayAdapter<Data> {
    private LayoutInflater inflater;
    public ListAdapter(Context context, ArrayList<Data> objects) {
        super(context, -1, objects);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v == null){
            v = inflater.inflate(R.layout.list_item_tweet, parent, false);
        }

        Data data = DataModel.getInstance().getData().get(position);

        TextView tvFullName = (TextView)v.findViewById(R.id.tvFullName);
        TextView tvUserName = (TextView)v.findViewById(R.id.tvUserName);
        TextView tvTweetText = (TextView)v.findViewById(R.id.tvTweetText);
        TextView tvTimeStamp = (TextView)v.findViewById(R.id.tvTimeStamp);
        ImageView ivIcon = (ImageView)v.findViewById(R.id.ivIcon);

        tvFullName.setText(data.getFullName());
        tvTweetText.setText(data.getTweetText());

        return v;
    }
}