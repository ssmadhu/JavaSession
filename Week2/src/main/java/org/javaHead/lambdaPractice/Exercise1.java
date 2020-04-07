package org.javaHead.lambdaPractice;

public class Exercise1 {

    public static void greet(IGreeeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
//            HelloGreeting helloGreeting = new HelloGreeting();
//            helloGreeting.perform();

    greet(new IGreeeting() {
            @Override
            public void perform() {
                System.out.println("Hello World");
            }
        });

    greet(()-> System.out.println("Hello World"));








    }


}
