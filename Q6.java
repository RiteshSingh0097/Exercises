//6. Print the elements of an array in the decreasing frequency if 2 numbers have same frequency
// then print the one which came first.

package com.bootcamp.collection;

import java.util.*;

public class Q6 {


    public static Map<Integer, Integer> sortByValue(Map<Integer, Integer> map) {

        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());


        Collections.sort(list, (Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) -> {
            return -o1.getValue().compareTo(o2.getValue());
        });
    
        Map<Integer, Integer> temp = new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int occurences = 1;
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else
                map.put(arr[i], occurences);
        }

        Map<Integer, Integer> map1 = sortByValue(map);

        for (Map.Entry<Integer, Integer> en : map1.entrySet()) {
            System.out.println("Element = " + en.getKey() + " frequency = " + en.getValue());
        }
    }
}

