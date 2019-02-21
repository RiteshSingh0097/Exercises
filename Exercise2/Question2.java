// 2. WAP to sorting string without using string Methods?.
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String[] str1 = str.split(" ");
        int length = str1.length;
        String temp;
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length - i - 1; j++) {

                if (str1[j].compareTo(str1[j + 1]) > 0) {
                    temp = str1[j];
                    str1[j] = str1[j + 1];
                    str1[j + 1] = temp;
                }

            }

        }
        for (int i = 0; i < length; i++)
            System.out.print(str1[i] + " ");
    }
}
