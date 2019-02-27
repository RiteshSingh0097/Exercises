// 4. Write a program to sort Employee objects based on highest salary using
// Comparator. Employee class{ Double Age; Double Salary; String Name

package com.bootcamp.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Employee{
    double age;
    double salary;
    String name;

    public Employee(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "  "+age+"  "+salary;
    }
}

class SortBySalary implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.salary<e2.salary?1:-1;
    }
}
public class Q4 {

    public static void main(String[] args) {

        List<Employee> list = new LinkedList<>();
        list.add(new Employee(21.2,35000.3,"Ritesh"));
        list.add(new Employee(20.3,40000.4,"Vishal"));
        list.add(new Employee(22.2,42000.6,"Pankaj"));
        list.add(new Employee(23.2,40000.9,"Ankush"));

        Collections.sort(list,new SortBySalary());

        System.out.println("Sorted on the basis of Salary\n");
        for (int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
