// Q8 Implement proxy design for accessing Record of a student and allow
// the access only to Admin.
package com.bootcamp.design_patterns;

interface Student {
    void getStudentRecord(String user);
}

class RealUser implements Student {

    @Override
    public void getStudentRecord(String user) {
        System.out.println(user + " accessing student's records.");
    }
}

class ProxyUser implements Student {

    @Override
    public void getStudentRecord(String user) {
        if (user.equalsIgnoreCase("admin")) {
            System.out.println(user + " accessing student's records.");
        } else {
            System.out.println("Access denied.");
        }
    }
}

public class Q8 {

    public static void main(String[] args) {

        Student student = new ProxyUser();
        student.getStudentRecord("Admin");

        Student student1 = new ProxyUser();
        student1.getStudentRecord("Director");
    }
}
