package org.javaHead.lambdaPractice;

public class HelloGreeting implements IGreeeting{
    @Override
    public void perform() {
        System.out.println("Hello World");
    }
}
