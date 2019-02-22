// Q13. Create a custom exception that do not have any stack trace.
class MyException extends Exception {
    @Override
    public void printStackTrace() {

        System.out.println("new exception created");
    }
}

public class Question13 {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
