package org.example;

public class ConditionalExample {
    public  static void main(String[] args){
        int number = -10;

        // If else statement
        if(number > 0){
            System.out.println("Positive Number");
        } else {
            System.out.println("non Positive Number");
        }

        // switch statement

        int day = 1;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other Day");
                break;
        }
    }
}
