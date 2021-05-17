package com.designpatterns.FactoryMethod;

import com.designpatterns.SimpleFactoryPattern.Animal;

class TigerFactory  extends AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}
