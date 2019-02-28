//Q2. Create a functional interface whose method takes 2 integers and return one integer.

package com.bootcamp.java_8_features;

interface Greater {
    int gretestElement(int a, int b);
}

public class Q2 {

    public static void main(String[] args) {

        Greater greater = (a, b) -> a > b ? a : b;

        System.out.println(greater.gretestElement(3, 4));
    }
}
