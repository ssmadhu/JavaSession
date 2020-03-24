package org.javaHead;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Trail {
    public static void main(String[] args) {


    }
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.CONSTRUCTOR)
@interface Bean {

}

//class Test {
//    int a=10;
//    public void print() {
//        System.out.println("Base");
//    }
//}
//class Test1 extends Test {
//    int a=20;
//    @Override
//    public void print(){
//        System.out.println("Derived");
//    }
//    public void rePrint(){
//        System.out.println("Reprint");
//    }
//}
