package com.designpatterns.AbstractFactoryPattern;

class PetDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Pet Dog says softly: Bow-Wow.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet Dog prefer to stay at home.\n");
    }
}
