package com.bootcamp.collection;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class User {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,9,22,03,40,50);


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println(simpleDateFormat1.format(calendar.getTime()));
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }

}
