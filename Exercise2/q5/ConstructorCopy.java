//5. WAP to show object cloning in java using copy constructor.
class Student {

    public int id;
    public String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // copy constructor
    Student(Student student) {
        System.out.println("Copy constructor");
        id = student.id;
        name = student.name;
    }

    // Overriding toString
    @Override
    public String toString() {
        return "Student Id : " + id + " Name : " + name;
    }
}
public class ConstructorCopy {

    public static void main(String[] args) {

        Student student1 = new Student(101,"Ritesh Singh");
        Student student2 = new Student(student1);
        student2.id = 10;
        student2.name = "Vishal Aggrawal";

        System.out.println(student1);
        System.out.println(student2);

    }
}
