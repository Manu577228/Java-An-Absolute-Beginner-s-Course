package org.example;

public class Dog {
    String name;
    int age;

    // Constructor method for the Dog Class
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    // method to print the dog's details
    public void printDetails(){
        System.out.println("name: " + name + ", Age: " + age);
    }

    public static void main(String[] args){
        Dog myDog = new Dog("Buddy", 3);
        myDog.printDetails();
    }
}
