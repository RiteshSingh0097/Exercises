//Write a method that takes a string and returns the number of
// unique characters in the string.
package com.bootcamp.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String string = sc.next();
        char[] charArray = string.toCharArray();

        Set<Character> set = new HashSet<>();

        for (int i=0; i<charArray.length; i++){
            set.add(charArray[i]);
        }

        System.out.println(set.toString());

    }
}
