package org.example;

public class EnumsExample {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args){
        Day today = Day.SUNDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Today is weekday");
        }
    }
}
