package oop5;

public class Student {
    private int studentID;
    private String fullName;
    private int age;
    private String course;

    void setStudentID(int studentID){//create  a setter for student id
        this.studentID = studentID;
    }

    void setFullName(String fullName){
        this.fullName = fullName;
    }

    void setAge(int age){
         this.age = age;
    }

    void setCourse(String course){
         this.course = course;
    }

    public int getStudentID(){
        return this.studentID;
    }

    public String getFullName(){
         return this.fullName;
    }

    public int getAge(){
         return this.age;
    }

    public String getCourse(){
         return this.course;
    }

    public void displayDetails(){
        System.out.println("Student ID: "+this.studentID);
        System.out.println("Full Name: "+this.fullName);
        System.out.println("Age: "+this.age);
        System.out.println("Course: "+this.course);
    }






}
