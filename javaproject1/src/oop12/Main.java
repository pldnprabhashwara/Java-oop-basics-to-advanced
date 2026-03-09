package oop12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int studentId = input.nextInt();
        input.nextLine();

        System.out.print("Enter Full Name: ");
        String studentName = input.nextLine();

        System.out.print("Math Mark: ");
        double mathMark = input.nextDouble();
        input.nextLine();

        System.out.print("Science Mark: ");
        double scienceMark = input.nextDouble();
        input.nextLine();

        System.out.print("English Mark: ");
        double englishMark = input.nextDouble();
        input.nextLine();

        Student student = new Student(studentId, studentName, mathMark, scienceMark, englishMark);

        student.displayStudentReport();

    }
}
