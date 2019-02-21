//3. WAP to produce ClassNotFoundException exception.
public class ClassNotFoundExample {

    public static void main(String[] args) {

        try
        {
            Class.forName("Question12"); //Question12 is not present in the system.
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
