//9. Write a program to display times in different country format.

package com.bootcamp.collection;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Q9 {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        System.out.println("Current : "+d1);

        Locale locItalian = new Locale("it","ch");
        DateFormat df = DateFormat.getDateInstance (DateFormat.FULL, locItalian);
        System.out.println("Italian : "+df.format(d1));

        Locale locale = new Locale("en","US");
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,locale);
        System.out.println("USA : "+df1.format(d1));

        Locale locale1 = new Locale("fr","FR");
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,locale1);
        System.out.println("France : "+df2.format(d1));

    }
}
