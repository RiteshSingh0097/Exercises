// Q4 Create an Employee Class with instance variables (String) name,
// (Integer)age, (String)city and get the instance of the Class using
// constructor reference

package com.bootcamp.java_8_features;

class Employee {
    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}

interface ObjectGenerate {
    Employee getInstance(String name, Integer age, String city);
}

public class Q4 {

    public static void main(String[] args) {

        ObjectGenerate objectGenerate = Employee::new;

        Employee emp = objectGenerate.getInstance("Ritesh", 21, "U.P.");

        System.out.println(emp.name + " " + emp.age + " " + emp.city);


    }
}
