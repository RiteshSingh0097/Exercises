//8. WAP to read words from the keyboard until the word done is entered. For each word except done, 
//report whether its first character is equal   to  its last character. For the required loop, use a 
//a)while statement 
//b)do-while statement
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        // (i) with the help of while loop
        while (!word.equals("done")) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equals.");
            } else {
                System.out.println("First and last character are NOT equals.");
            }
            word = sc.next();
        }
        // (ii) with the help of do-while loop
        System.out.println("Enter a word");
        String word1;
         do {
             word1 = sc.next();
            if (word1.charAt(0) == word1.charAt(word1.length() - 1)) {
                System.out.println("First and last character are equals.");
            } else {
                System.out.println("First and last character are NOT equals.");
            }
        }while (!word1.equals("done"));
    }
}
