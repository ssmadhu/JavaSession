package org.javaHead.lambdaPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise2 {


    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Tim", "Arnold", 39)
        );

        // Step 1: Sort list by last name
//        Collections.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getLastName().compareTo(o2.getLastName());
//            }
//        });

        Collections.sort(people, (Person o1, Person o2) -> o1.getLastName().compareTo(o2.getLastName()));

        people.sort(Comparator.comparing(Person::getLastName));

        for(Person p: people){
            System.out.println(p);
        }



        // Step 2: Create a method that prints all elements in the list

        people.forEach(x -> System.out.println(x));

        people.forEach(System.out::println);

        // Step 3: Create a method that prints all people that have last name beginning with C

        people.stream()
                .filter(x -> x.getLastName().startsWith("C"))
                .forEach(x -> System.out.println(x));


        // Group person less than 50 into one and greater than 50 into another
        System.out.println(people.stream().collect(Collectors.partitioningBy(x -> x.getAge()> 50)));

        // Group persons based on the starting letter of the first name
        System.out.println(people.stream()
                .map(Person::getFirstName)
                .collect(Collectors.groupingBy(x -> x.toCharArray()[0])));

        //reduce
        List<Integer> a = Arrays.asList(1, 3 , 5, 7, 8, 10);
        System.out.println(a.stream().reduce(0, (i, b) -> i+b));

        // lazy loading
        System.out.println(people.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .map(Person::getFirstName)
                .findFirst());

        //closures

        int b = 20;
        System.out.println(a.stream()
                .map(x -> x+b)
                .collect(Collectors.toList())
        );

    }

}

//class SortbylastName implements Comparator<Person>
//{
//    @Override
//    public int compare(Person o1, Person o2) {
//        return o1.getLastName().compareTo(o2.getLastName());
//    }
//}
