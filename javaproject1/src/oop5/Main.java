package oop5;

public class Main {
    public static void main(String[] args) {

        Student std =  new Student();
        std.setStudentID(1001);
        std.setFullName("Harry Potter");
        std.setAge(19);
        std.setCourse("Java");

        std.displayDetails();

    }
}
