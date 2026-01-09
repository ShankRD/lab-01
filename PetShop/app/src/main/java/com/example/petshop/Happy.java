package com.example.petshop;
import java.util.Date;

public class Happy extends Mood {

    public Happy() {
        super();
    }

    public Happy(Date dateofDay) {
        super(dateofDay);
    }

    @Override
    public String getMood() {
        return "happy";
    }
}
