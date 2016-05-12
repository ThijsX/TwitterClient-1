package com.example.thijs.twitterclient.model;

import java.util.ArrayList;

/**
 * Created by thijs on 27-4-2016.
 */
public class DataModel {
    private static DataModel model = null;
    private ArrayList<Data> dataArrayList;

    public static DataModel getInstance() {
        if (model == null) {
            model = new DataModel();
        }
        return model;
    }
    public DataModel(){
        dataArrayList = new ArrayList<>();

        for(int i = 0; i< 10; i++){
            dataArrayList.add(new Data("tweet text 1","UserName1"));
        }
    }
    public void setData(Data d){
        dataArrayList.add(d);
    }
    public ArrayList<Data> getData(){
        return dataArrayList;
    }
}
