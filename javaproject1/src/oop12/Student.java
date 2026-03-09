package oop12;

public class Student {
    private int studentId;
    private String fullName;
    private double mathMark;
    private double scienceMark;
    private double englishMark;

    Student(int studentId, String fullName, double mathMark, double scienceMark, double englishMark){
        this.studentId = studentId;
        this.fullName = fullName;
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
        this.englishMark = englishMark;
    }

    public int getStudentId(){return studentId;}
    public void setStudentId(int studentId){this.studentId = studentId;}

    public String getFullName(){return fullName;}
    public void setFullName(String fullName){this.fullName = fullName;}

    public double getMathMark(){return mathMark;}
    public double getScienceMark(){return scienceMark;}
    public double getEnglishMark(){return englishMark;}

    public double getAverage(){
        double total = 0;
        int count = 0;

        if(mathMark > 0){
            total += mathMark;
            count++;
        }
        if(scienceMark > 0){
            total += scienceMark;
            count++;
        }
        if(englishMark > 0){
            total += englishMark;
            count++;
        }

        if(count == 0){
            System.out.println("No marks entered!");
            return 0;
        }

        double average = total / count;
        return average;
    }

    public String getGrade() {
        double average = getAverage();
        if (average >= 75) {
            System.out.println("Average grade is A");
        } else if (average >= 65 && average < 75) {
            System.out.println("Average grade is B");
        } else if (average >= 50 && average < 65) {
            System.out.println("Average grade is C");
        } else if (average >= 40 && average < 50) {
            System.out.println("Average grade is D");
        } else {
            System.out.println("Average grade is F");
        }
        return "";
    }

    public void displayStudentReport(){
        System.out.println("\n-------Student Report -------");
        System.out.println("Student ID: " + studentId);
        System.out.println("Full Name: " + fullName);
        System.out.println("Math Mark: " + mathMark + " |" + "Science " + scienceMark + " |" + "English " + englishMark);
        System.out.println("Average: " + getAverage());
        System.out.println("Grade: " + getGrade());
    }
}
