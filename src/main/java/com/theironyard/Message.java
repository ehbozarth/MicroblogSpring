package com.theironyard;

/**
 * Created by earlbozarth on 11/9/15.
 */
public class Message {
    int id;
    String text;

    public Message(int id,  String text) {
        this.id = id;
        this.text = text;
    }
    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
