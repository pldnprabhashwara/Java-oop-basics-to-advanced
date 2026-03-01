package oop4;

public class Test {
    int length;
    int width;

    Test(){
        this(10,20);

    }


    Test(int length, int width) {
        this.length = length;
        this.width = width;

    }

    public void display(){
        System.out.println("Length: "+this.length);
        System.out.println("Width: "+this.width);
    }




}
