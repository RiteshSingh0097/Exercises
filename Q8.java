// Q8. Implement multiple inheritance with default method inside  interface.
package com.bootcamp.java_8_features;

interface R {
    default void display() {
        System.out.println("hi");
    }
}

interface S {
    default void display() {
        System.out.println("hello");
    }
}

public class Q8 implements R, S {

    public void display() {
        System.out.println("hey");
    }

    /*
        public void display(){
            R.super.display();
        }
    */
    public static void main(String[] args) {

        new Q8().display();
    }
}
