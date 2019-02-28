// Q3 Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference
// create and apply multiplication method for the functional interface created.

package com.bootcamp.java_8_features;

interface MyInterface {
    void display(int a, int b);
}

public class Q3 {

    void displayAdd(int a, int b) {
        System.out.println(a + b);
    }

    void displaySub(int a, int b) {
        System.out.println(a - b);
    }

    static void displayMul(int a, int b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {

        MyInterface myInterface = new Q3()::displayAdd;
        MyInterface myInterface1 = new Q3()::displaySub;
        MyInterface myInterface2 = Q3::displayMul;

        myInterface.display(3, 2);
        myInterface1.display(3, 2);
        myInterface2.display(3, 2);

    }
}
