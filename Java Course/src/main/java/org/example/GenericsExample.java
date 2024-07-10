package org.example;

import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Bharadwaj");

        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
