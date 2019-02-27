//3. Write a method that takes a string and print the number of
// occurrence of each character characters in the string.

package com.bootcamp.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String string = sc.next();

        Map<Character, Integer> map = new HashMap<>();
        Character character;
        for (int i = 0; i < string.length(); i++) {

            character = string.charAt(i);

            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else
                map.put(character, 1);
        }

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + "   " + m.getValue());
        }
    }
}
