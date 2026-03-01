package oop3;

public class car {
    String make;
    String model;
    int year;


    car(String Make, String Model, int year) {

        this.make = Make;
        this.model = Model;
        this.year = year;

    }
    public void display(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }


}