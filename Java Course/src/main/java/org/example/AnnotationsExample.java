package org.example;

// Define a class named DeprecatedExample
class DeprecatedExample {
    @Deprecated
    public void oldMethod(){
        System.out.println("The method is deprecated");
    }
}

public class AnnotationsExample {
    public static void main(String[] args){
        DeprecatedExample example = new DeprecatedExample();
        example.oldMethod();
    }
}
