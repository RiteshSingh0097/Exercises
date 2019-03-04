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

        int uniqueCharacter = noOfUniqueCharacters(string);

        System.out.println("No. of unique character : " + uniqueCharacter);
    }

    public static int noOfUniqueCharacters(String string) {

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < string.length(); i++)
            set.add(string.charAt(i));

        return set.size();
    }
}
