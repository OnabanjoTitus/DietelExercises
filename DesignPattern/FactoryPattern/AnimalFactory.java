package com.designpatterns.FactoryMethod;

import com.designpatterns.SimpleFactoryPattern.Animal;

abstract class AnimalFactory {
    public abstract Animal createAnimal();
}
