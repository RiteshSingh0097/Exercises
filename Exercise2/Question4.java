// 3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("Singleton Class");
    }

    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }
}

public class Question4 {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

    }
}
