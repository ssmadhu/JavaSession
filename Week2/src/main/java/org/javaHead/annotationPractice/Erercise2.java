package org.javaHead.annotationPractice;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Erercise2 {
    public static void main(String[] args) throws IllegalAccessException {
        Car car = new Car("Ford", "Accord", "2019");
        Map<String, String> myMap = new HashMap<String, String>();
        Class<?> class1 = car.getClass();
        for(Field f :class1.getDeclaredFields()) {
            if(f.isAnnotationPresent(JsonField.class)) {
                myMap.put(f.getAnnotation(JsonField.class).value().isEmpty() ? f.getName(): f.getAnnotation(JsonField.class).value(), (String)f.get(car));
            }
        }
        for(Map.Entry<String,String> entry: myMap.entrySet()) {
            System.out.println(entry.getKey() + ":"+ entry.getValue());
        }











    }

}


