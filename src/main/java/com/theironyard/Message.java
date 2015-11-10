package com.theironyard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by earlbozarth on 11/9/15.
 */

@Entity
public class Message {

    @Id
    @GeneratedValue
    Integer id;
    String text;

    public Message(){

    }

    public Message(int id,  String text) {
        this.id = id;
        this.text = text;
    }
    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
