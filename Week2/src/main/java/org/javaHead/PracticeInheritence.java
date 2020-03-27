package org.javaHead;

import org.w3c.dom.ls.LSOutput;



public class PracticeInheritence {
    public static void main(String[] args) {
        Base b = new Derived();
        ((Derived)b).print();
    }


}
class Base {
    public void print(){
        System.out.println("Hi");
    }
}
class Derived extends  Base {
    public void print(){
//        super.print();
        System.out.println("Hello");
    }


}
