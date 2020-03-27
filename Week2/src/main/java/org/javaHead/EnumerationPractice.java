package org.javaHead;

public class EnumerationPractice {
    public static void main(String[] args) {
        Laptop1 laptop = new Laptop1(OS.Windows, "Dell");
        Laptop1 laptop1 = new Laptop1(OS.Linux, "Dell");
    }
}
enum OS {
     Windows, Linux, Mac
}

class Laptop1 {
    public Laptop1(OS os, String model) {
        this.os = os;
        this.model = model;
    }
    OS os;
    String model;
}

