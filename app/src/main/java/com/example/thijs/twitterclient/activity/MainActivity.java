package com.example.thijs.twitterclient.activity;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.thijs.twitterclient.R;
import com.example.thijs.twitterclient.model.Data;
import com.example.thijs.twitterclient.model.DataModel;
import com.example.thijs.twitterclient.view.ListAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

        DataModel model = DataModel.getInstance();


        adapter = new ListAdapter(this, model.getData());
        listView.setAdapter(adapter);
    }

}
