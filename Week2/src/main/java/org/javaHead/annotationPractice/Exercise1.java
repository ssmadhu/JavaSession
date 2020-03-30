package org.javaHead.annotationPractice;

public class Exercise1 {
    public static void main(String[] args) {

    }
}

class Shape {
    public void drawShape(){
        System.out.println("Shape Drawn");
    }
}

class Rectangle extends Shape {
    @Override
    public void drawShape() {
        System.out.println("Rectangle drawn");
    }
}

