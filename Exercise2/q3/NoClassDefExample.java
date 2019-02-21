// 3(a). WAP to produce NoClassDefFoundError

class A{

}
//Delete A.class file and run NoClassDefExample.class file to get NoClassDefExample
public class NoClassDefExample {

    public static void main(String[] args) {

        A a = new A();
    }
}
