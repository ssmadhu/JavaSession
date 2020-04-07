package org.javaHead.genericsPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercise1 {
    public static void main(String[] args) {

        //type safety

        List<Integer> a = new ArrayList<>();
        a.add(10);




        // create a generic class
        Test<String> b = new Test<String>();
        b.setA("Hello");

        Test<Integer> c = new Test<Integer>();
        c.setA(12);

        //invariance
        // Number base of Integer.
        // List<Number> = cant do List<Integer>



        List<Number> d = new ArrayList<>();

        d.add(1.3);
        d.add(2);



        List<Integer> e = new ArrayList<>();
        e.add(2);
        e.add(5);


        //Generics with wild card

//        List<? extends Number> myList = new ArrayList<>();
//        myList.add(1);

        max(new ArrayList<Integer>());



    List<? super Integer> myist = new ArrayList<>();
    myist.add(2);
    myist.add(3);


        // Not allowed - static, Exception, Primitive, object creation

    }

    public static Optional<? extends Number> max(List<? extends Number> a) {
        return a.stream().sorted(Comparator.comparing(Number::intValue)).findFirst();
    }

}
class Test<T> {
    T a;
    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}
