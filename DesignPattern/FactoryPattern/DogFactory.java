package com.designpatterns.FactoryMethod;

import com.designpatterns.SimpleFactoryPattern.Animal;

class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
