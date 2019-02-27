//8. Write a program to format date as example "21-March-2016"

package com.bootcamp.collection;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Q8 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,2,21);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy");

        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }
}
