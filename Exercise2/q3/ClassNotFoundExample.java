public class ClassNotFoundExample {

    public static void main(String[] args) {

        try
        {
            Class.forName("Question12");
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
