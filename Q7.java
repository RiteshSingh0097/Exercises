// 7. Design a Data Structure SpecialStack that supports all the stack
// operations like push(), pop(), isEmpty(), isFull() and an additional
// operation getMin() which should return minimum element from the SpecialStack.
// (Expected complexity ­ O(1))

package com.bootcamp.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q7 {

    static int size = 5;
    static List<Integer> list = new LinkedList<>();
    static int top = -1;

    public static void push(int n) {
        if (list.size()==size){
            System.out.println("Stack is full");
        }
        else {
            list.add(n);
        }
    }

    public static void pop(){
        if (list.size()==0)
            System.out.println("Stack is empty");
        list.remove(list.size()-1);
    }

    public static boolean isfull(){
        if (list.size()==size)
            return true;
        else
            return false;
    }

    public static boolean isEmpty(){
        if (list.size()==0)
            return true;
        else
            return false;
    }
    public static int getMin(){
        return Collections.min(list);
    }


    public static void main(String[] args) {

        push(7);
        push(4);
        push(3);
        push(9);
        pop();
        System.out.println(isEmpty());
        System.out.println(isfull());
        System.out.println(getMin());

    }
}
