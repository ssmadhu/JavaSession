package org.javaHead;

public class Exercise1 {
    public static void main(String[] args) {
//        Laptop dell = new Laptop("Latitude", "Windows", 120, "Dell");
//        dell.printDetails();
        Electronics mixer = new Electronics(120, "Mixer");
    }
}

class Electronics {
    public int powerLevel;
    String name;
    public Electronics(int powerLevel, String name) {
        this.name = name;
        this.powerLevel = powerLevel;
    }
    public void printDetails(){
        System.out.println("Electronics Name is "+ name );
    }
}

class Laptop extends Electronics {
    String model;
    String os;
    public Laptop(String model, String os, int powerLevel, String name){
        super(powerLevel, name);
        this.model = model;
        this.os = os;

    }
    public void printDetails(){
        super.printDetails();
        System.out.println("The model is "+ model);
    }

}

//class Television extends  Electronics {
//    int size;
//    boolean isSmartTv;
//}

//

//abstract  class Shape {
//    String name;
//    abstract public void drawShape();
//    public void printDetails(){
//        System.out.println("Print name os ....");
//    }
//}
//class Rectangle extends Shape{
//    int length, breadth;
//    public void drawShape(){
//        System.out.println("This is a rectangle");
//    }
//}

interface Shape {
    String name = null;
    public void drawShape();
//    public void printDetails();
}

interface Pattern {
    String patternNAme = null;
}

class Rectangle implements Shape, Pattern{
    int length, breadth;
    public void drawShape(){
        System.out.println("This is a rectangle");
    }
}


//class Circle extends Shape {
//    int radius;
//}
//class Square extends Shape {
//    int side;
//}