package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionsExample {
    public static void main(String[] args){
        // ArrayList example
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        for(String str : stringList){
            System.out.println("Fruit: " + str);
        }

        // Hashmap Example
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("Apple", 95);
        fruitCalories.put("banana", 105);
        fruitCalories.put("Cherries", 50);

        for(Map.Entry<String, Integer> entry : fruitCalories.entrySet()){
            System.out.println(entry.getKey() + " has " + entry.getValue() + " calories");
        }
    }
}
