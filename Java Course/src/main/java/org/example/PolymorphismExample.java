package org.example;

class Animal{
    public void makeSound(){
        System.out.println("Some Sound");
    }
}

// define a subclass named dog that inherits from Animal
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}

// Define a subclass named Cat that inherits from Animal
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}

public class PolymorphismExample {
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}
