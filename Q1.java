// 1. Write Java code to define List . Insert 5 floating point numbers in List,
// and using an iterator, find the sum of the numbers in List.

package com.bootcamp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1 {

    public static void main(String[] args) {

        List<Float> list = new ArrayList<>();

        list.add(1.2f);
        list.add(2.2f);
        list.add(3.6f);
        list.add(4.2f);
        list.add(2.7f);

        float sum = 0.0f;

        Iterator<Float> iterator = list.iterator();

        while (iterator.hasNext()){
            sum += iterator.next();
        }

        System.out.println("Sum of the numbers in the List : "+sum);
    }
}
