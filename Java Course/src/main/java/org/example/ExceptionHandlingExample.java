package org.example;

public class ExceptionHandlingExample {
    public static void main(String[] args){
        try {
            int[] myArray = {1, 2, 3};
            System.out.println(myArray[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds");
        } finally {
            System.out.println("the try-catch block is finished.");
        }
    }
}
