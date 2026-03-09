package oop9;

class Student {
    private String name;
    private int age;

    // Overloaded constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Course extends Student {
    private String courseName;

    // Overloaded constructor
    public Course(String name, int age, String courseName) {
        super(name, age);
        this.courseName = courseName;
    }

    public void displayCourseInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course Name: " + courseName);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Alice", 20, "Java Programming");
        Course course2 = new Course("Bob", 22, "Data Structures");

        course1.displayCourseInfo();
        course2.displayCourseInfo();
    }
}
