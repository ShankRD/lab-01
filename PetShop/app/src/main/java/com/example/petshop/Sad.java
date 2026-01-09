package com.example.petshop;
import java.util.Date;

public class Sad extends Mood {

    public Sad() {
        super();
    }

    public Sad(Date dateofDay) {
        super(dateofDay);
    }

    @Override
    public String getMood() {
        return "sad";
    }
}
