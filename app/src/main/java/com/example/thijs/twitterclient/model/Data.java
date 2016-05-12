package com.example.thijs.twitterclient.model;

/**
 * Created by thijs on 27-4-2016.
 */
public class Data {
    String tweetText;
    String fullName;

    public Data(String tweetText, String fullName) {
        this.tweetText = tweetText;
        this.fullName = fullName;
    }

    public String getTweetText() {
        return tweetText;
    }

    public void setTweetText(String tweetText) {
        this.tweetText = tweetText;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
