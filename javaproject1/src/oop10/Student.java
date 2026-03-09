package oop10;

public class Student{
    int studentId;
    String name;
    double GPA;


    Student(int studentId, String name, double GPA) {
        this.studentId = studentId;
        this.name = name;
        this.GPA = GPA;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }



}
