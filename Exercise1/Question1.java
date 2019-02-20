//Q1. Write a program to replace a substring inside a string with other string ?

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currentString = sc.next();
        String subString = sc.next();
        String replaceBy = sc.next();
        String updatedString = currentString.replace(subString,replaceBy);
        System.out.println(updatedString);
    }
}