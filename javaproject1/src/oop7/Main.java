package oop7;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}

class Student extends Person{
    String stdID;
    String course;


    Student(String name, int age, String stdID, String course){
        super(name, age);
        this.stdID = stdID;
        this.course = course;
    }

    public void display(){
        super.display();
        System.out.println("StdID: "+stdID);
        System.out.println("Course: "+course);
    }


}

class GraduatedStudent extends Student{
    String research;
    GraduatedStudent(String name, int age, String stdID, String course, String research){
        super(name, age, stdID, course);
        this.research = research;
    }

    public void display(){
        super.display();
        System.out.println("Research: "+research);
    }



}


public class Main {
    public static void main(String[] args){
        Person person = new Person("Nayana", 25);
        Student student = new Student("kaml", 23, "it25xxx", "java");
        GraduatedStudent graduatedStudent = new GraduatedStudent("anura", 25, "it26xxx", "python",  "AI" );


        person.display();
        System.out.println(" ");

        student.display();
        System.out.println(" ");

        graduatedStudent.display();
        System.out.println(" ");

    }
}
