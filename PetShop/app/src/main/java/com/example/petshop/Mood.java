package com.example.petshop;

import java.util.Date;

public abstract class Mood {

    private Date dateofDay;

    public Mood() {
        this.dateofDay = new Date();
    }

    public Mood(Date dateofDay) {
        this.dateofDay = dateofDay;
    }

    public Date getDateofDay() {
        return dateofDay;
    }

    public void setDateofDay(Date dateofDay) {
        this.dateofDay = dateofDay;
    }

    public abstract String getMood();
}

