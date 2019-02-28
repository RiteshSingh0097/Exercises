//Q6. Create and access default and static method of an interface.
package com.bootcamp.java_8_features;

interface P {
    static void print() {
        System.out.println("Print method");
    }

    default void display() {
        System.out.println("Display Method");
    }
}

public class Q6 implements P {

    public static void main(String[] args) {

        P.print();
        new Q6().display();
    }
}
