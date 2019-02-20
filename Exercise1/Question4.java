//Q4. Calculate the number & Percentage Of Lowercase Letters,
//Uppercase Letters, Digits And Other Special Characters In A String

import java.util.Scanner;
public class Question4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        double lowerCount = 0;
        double upperCount = 0;
        double digitCount = 0;
        double specialCount =0;
        double length = str.length();
        for (int i=0;i<length;i++){
            char ch = str.charAt(i);

            if(ch>=97 && ch<=122)
                lowerCount++;

            else if (ch>=48 && ch<=57)
                digitCount++;

            else if (ch>=65 && ch<=90)
                upperCount++;
            else
                specialCount++;
        }

        double lowPercent = (lowerCount/length)*100;
        double uppPercent = (upperCount/length)*100;
        double digitPercent = (digitCount/length)*100;
        double specPercent = (specialCount/length)*100;

        System.out.println("No. of lowercase letters : "+lowerCount+" percent : "+lowPercent);
        System.out.println("No. of uppercase letters : "+upperCount+" percent : "+uppPercent);
        System.out.println("No. of digits : "+digitCount+" percent : "+digitPercent);
        System.out.println("No. of special characters : "+specialCount+" percent : "+specPercent);
    }
}
