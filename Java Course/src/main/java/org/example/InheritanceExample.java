package org.example;

class Animal{
    public void eat(){
        System.out.println("This animal eats food.");
    }
}

// define a subclass named Dog that inherits from Animal
class Dog extends Animal{
    public void bark(){
        System.out.println("The dog barks.");
    }
}



public class InheritanceExample {
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
