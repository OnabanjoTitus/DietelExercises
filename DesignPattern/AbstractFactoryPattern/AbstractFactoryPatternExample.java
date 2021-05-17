package com.designpatterns.AbstractFactoryPattern;

class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        AnimalFactory animalFactory;
        Dog myDog;
        Tiger myTiger;
        System.out.println("Abstract Factory Pattern Demo");
        animalFactory= new WildAnimalFactory();
        myDog = animalFactory.createDog();
        myDog.speak();
        myDog.preferredAction();
        myTiger=animalFactory.createTiger();
        myTiger.speak();
        myTiger.preferredAction();
        System.out.println("*******************");
        animalFactory= new PetAnimalFactory();
        myDog=animalFactory.createDog();
        myDog.speak();
        myDog.preferredAction();
        myTiger=animalFactory.createTiger();
        myTiger.speak();
        myTiger.preferredAction();
    }
}
