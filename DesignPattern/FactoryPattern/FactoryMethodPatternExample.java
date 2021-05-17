package com.designpatterns.FactoryMethod;

import com.designpatterns.SimpleFactoryPattern.Animal;

class FactoryMethodPatternExample {
    public static void main(String[] args) {
        System.out.println("Factory Pattern Demo");
        AnimalFactory tigerFactory = new TigerFactory();
        Animal aTiger = tigerFactory.createAnimal();
        aTiger.speak();
        aTiger.preferredAction();

        AnimalFactory dogFactory= new DogFactory();
        Animal aDog = dogFactory.createAnimal();
        aDog.speak();
        aDog.preferredAction();
    }
}
