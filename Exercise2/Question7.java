//7. WAP to convert seconds into days, hours, minutes and seconds.
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long seconds = sc.nextInt();
        long value1 = 24*60*60;
        long day = seconds/value1;
        seconds = seconds%value1;
        value1 /= 24;
        long hours = seconds/value1;
        seconds %= value1;
        value1 /=60;
        long minute = seconds/value1;
        seconds %= value1;

        System.out.println(""+day+" Days, "+hours+" Hours, "+minute+" Minutes, "+seconds+" Seconds");

    }
}
