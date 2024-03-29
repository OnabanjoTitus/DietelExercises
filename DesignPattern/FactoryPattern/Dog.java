package com.designpatterns.FactoryMethod;

import com.designpatterns.SimpleFactoryPattern.Animal;

class Dog implements Animal {

    @Override
    public void speak() {
        System.out.println("Dog says: Bow-Wow");
    }

    @Override
    public void preferredAction() {
        System.out.println("Dogs prefer barking...");
    }

}
