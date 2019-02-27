//Write a program to sort the Student objects based on Score ,
// if the score are same then sort on First Name . Class Student{ String Name;
// Double Score; Double Age

package com.bootcamp.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    double score;
    double age;

    public Student(String name, double score, double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+" "+score+" "+age;
    }

    @Override
    public int compareTo(Student student) {
        if (score == student.score)
            return name.compareTo(student.name);
        else if (score>student.score)
            return -1;
        else
            return 1;
    }
}

public class Q5 {

    public static void main(String[] args) {

        List<Student> list = new LinkedList<>();

        list.add(new Student("Ritesh",94.6,21.2));
        list.add(new Student("Vishal",98.3,23.3));
        list.add(new Student("Pankaj",98.3,27.5));
        list.add(new Student("Ankush",95.9,23.1));

        Collections.sort(list);

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
