package org.javaHead.reflectionExercise;

public class ReflectionPractice {
    public static void main(String[] args) throws Exception {

        Test t = new Test();
        Class c = t.getClass();
       c.getMethod("m1").invoke(t);
    }
}

class Test {
    public void m1(){
        System.out.println("Hi....");
    }
    public void m2(){
        System.out.println("Hi");
    }

}
