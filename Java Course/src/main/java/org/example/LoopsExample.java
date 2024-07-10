package org.example;

public class LoopsExample {
    public static void main(String[] args){
        // For Loop
        for(int i = 0; i < 5; i++){
            System.out.println("For Loop: " + i);
        }

        // while Loop
        int j = 0;
        while(j < 5){
            System.out.println("While Loop: " +j);
            j++;
        }

        // Do while Loop
        int k = 0;
        do {
            System.out.println("Do while loop: " +k);
            k++;
        } while(k < 5); // loop while k is less than 5
    }
}
