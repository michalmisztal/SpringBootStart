package com.spring.nauka.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Admin on 2017-02-07.
 */
@Document
public class Forum {

    @Id
    private String id;

    private String topic;
    private String content;
    private Integer number;
    private Date date;
    private String email;



    //private String login;
   // private String password;


    public Forum() {
    }

    public Forum(String topic, String content, Date date) {
        this.topic = topic;
        this.content = content;
        this.date = date;
    }

    public Forum(String topic, String content, String email, Integer number, Date date) {
        this.topic = topic;
        this.content = content;
        this.email = email;
        this.number = number;
        this.date = date;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopic() { return topic;}

    public void setTopic(String topic) {this.topic = topic;}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
