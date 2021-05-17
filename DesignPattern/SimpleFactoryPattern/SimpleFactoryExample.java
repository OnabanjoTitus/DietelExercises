package com.designpatterns.SimpleFactoryPattern;

public class SimpleFactoryExample {
    public static void main(String[] args) {
        System.out.println("The demo for simple factory pattern");
        Animal preferredType= null;
        SimpleFactory simpleFactory= new SimpleFactory();
        preferredType = simpleFactory.createAnimal();

        preferredType.speak();
        preferredType.preferredAction();
    }
}
