package org.javaHead.exceptionHandlingExercise;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        try {
            int age;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your age");
            age = scan.nextInt();
            if(age<0 || age>100){
                throw new AgeNotValid();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

}
class AgeNotValid extends Exception {
    public String toString(){
        return "Age has to be between 0 and 100";
    }
}
