//Q1. Write the following a functional interface and implement it using lambda:

package com.bootcamp.java_8_features;

interface A {
    public boolean greater(int a, int b);
}

interface B {
    public int number(int a);
}

interface C {
    public String conc(String str, String str1);
}

interface D {
    public String upper(String str);
}

public class Q1 {

    public static void main(String[] args) {

        // (1) First number is greater than second number or not
        A num = (int a, int b) -> (a > b ? true : false);
        System.out.println(num.greater(9, 10));

        // (2) Increment the number by 1 and return incremented value
        B num1 = a -> ++a;
        System.out.println(num1.number(9));

        // (3) Concatination of 2 string
        C string = (a, b) -> a.concat(b);
        System.out.println(string.conc("Ritesh", " Singh"));

        // (4) Convert a string to uppercase and return .
        D d = a -> a.toUpperCase();
        System.out.println(d.upper("ritesh"));
    }
}
