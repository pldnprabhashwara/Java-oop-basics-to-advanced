package oop2;

public class student {
    int studentID;
    String studentName;
    int age;


    student(int StudentID, String StudentName, int Age){
        this.studentID = StudentID; // local variable acceses to the instance variables
        this.studentName = StudentName;
        this.age = Age;

    }

    public void display(){

        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + age);

    }


}