package com.theironyard;

import java.util.ArrayList;

/**
 * Created by earlbozarth on 11/9/15.
 */
public class Person {
    int id;
    String name;
    ArrayList<Message> usersMessagesList;

    public Person(int id, String name, ArrayList<Message> usersMessagesList) {
        this.id = id;
        this.name = name;
        this.usersMessagesList = usersMessagesList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Message> getUsersMessagesList() {
        return usersMessagesList;
    }
}
