package com.designpatterns.AbstractFactoryPattern;

class WildDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Wild Dog says loudly: Bow-Wow.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild Dog prefer to roam freely in jungles.\n");
    }
}
