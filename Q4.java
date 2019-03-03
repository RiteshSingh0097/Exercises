//Q4. Implement Builder pattern to create a student object with more than 6 fields.
package com.bootcamp.design_patterns;

class Student {

    private int rollNo;
    private String studentName;
    private int yearOfAdmission;
    private String course;
    private String branch;
    private boolean hostler;
    private boolean feeWaiver;

    public Student() {

    }

    public Student(StudentBuilder studentBuilder) {
        rollNo = studentBuilder.getRollNo();
        studentName = studentBuilder.getStudentName();
        yearOfAdmission = studentBuilder.getYearOfAdmission();
        course = studentBuilder.getCourse();
        branch = studentBuilder.getBranch();
        hostler = studentBuilder.isHostler();
        feeWaiver = studentBuilder.isFeeWaiver();
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public boolean isHostler() {
        return hostler;
    }

    public void setHostler(boolean hostler) {
        this.hostler = hostler;
    }

    public boolean isFeeWaiver() {
        return feeWaiver;
    }

    public void setFeeWaiver(boolean feeWaiver) {
        this.feeWaiver = feeWaiver;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", studentName='" + studentName + '\'' +
                ", yearOfAdmission=" + yearOfAdmission +
                ", course='" + course + '\'' +
                ", branch='" + branch + '\'' +
                ", hostler=" + hostler +
                ", feeWaiver=" + feeWaiver +
                '}';
    }
}

class StudentBuilder {
    private int rollNo;
    private String studentName;
    private int yearOfAdmission;
    private String course;
    private String branch;
    private boolean hostler;
    private boolean feeWaiver;

    public int getRollNo() {
        return rollNo;
    }

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public String getStudentName() {
        return studentName;
    }

    public StudentBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public StudentBuilder setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
        return this;
    }

    public String getCourse() {
        return course;
    }

    public StudentBuilder setCourse(String course) {
        this.course = course;
        return this;
    }

    public String getBranch() {
        return branch;
    }

    public StudentBuilder setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public boolean isHostler() {
        return hostler;
    }

    public StudentBuilder isHostler(boolean hostler) {
        this.hostler = hostler;
        return this;
    }

    public boolean isFeeWaiver() {
        return feeWaiver;
    }

    public StudentBuilder isFeeWaiver(boolean feeWaiver) {
        this.feeWaiver = feeWaiver;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}

public class Q4 {

    public static void main(String[] args) {

        Student student = new StudentBuilder()
                .setStudentName("Ritesh")
                .setRollNo(1509013053)
                .setCourse("B.Tech")
                .setBranch("I.T.")
                .setYearOfAdmission(2015)
                .isFeeWaiver(false)
                .isHostler(false)
                .build();

        System.out.println(student);
    }
}
