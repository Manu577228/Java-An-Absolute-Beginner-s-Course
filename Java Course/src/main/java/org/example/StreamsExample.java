package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args){
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Apricot");
        stringList.add("Blueberry");

        // Use stream to filter and collect elements that starts with the letter "A"
        List<String> filteredList = stringList.stream()
                .filter(str -> str.startsWith("A"))
                .collect(Collectors.toList());

        filteredList.forEach(System.out::println);
    }
}
