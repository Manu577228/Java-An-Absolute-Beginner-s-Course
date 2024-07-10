package org.example;

// define an interface named animal
interface Animal{
    void makeSound();
}

// Define a class named dog that implements the Animal interface
class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}

// define a class named Cat that implements the Animal interface
class Cat implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}

public class InterfaceExample {
    public static void main(String[] args){
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
}
