package org.example;

import java.util.ArrayList;

public class LambdaExample {
    public static void main(String[] args){
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        // Use a lambda expression to print each element in the stringList
        stringList.forEach(str -> System.out.println(str));
    }
}
