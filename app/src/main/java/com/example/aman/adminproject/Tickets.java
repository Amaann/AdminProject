package com.example.aman.adminproject;

public class Tickets {

    String  title, date, time;
    int  id;

    public Tickets() {

    }

    public Tickets(int id, String title, String date, String  time) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String  time) {
        this.time = time;
    }
}
