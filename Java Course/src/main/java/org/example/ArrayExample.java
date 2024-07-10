package org.example;

public class ArrayExample {
    public static void main(String[] args){
        int[] myArray = {1, 2, 3, 4, 5};

        // print each element in the array using a for loop
        for(int i = 0; i < myArray.length; i++){
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }
    }
}
