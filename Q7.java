// Q7  Override the default method of the interface.
package com.bootcamp.java_8_features;

interface Q {
    default void display() {
        System.out.println("Display method");
    }
}

public class Q7 implements Q {

    public void display() {
        System.out.println("Overridden display method");
    }

    public static void main(String[] args) {

        Q7 q7 = new Q7();
        q7.display();
    }
}
