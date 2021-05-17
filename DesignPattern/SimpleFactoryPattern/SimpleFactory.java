package com.designpatterns.SimpleFactoryPattern;

import java.util.Scanner;

public class SimpleFactory {
    public Animal createAnimal(){
        Animal intendedAnimal= null;
        System.out.println("Enter your choice( DOG, TIGER)");
        Scanner input=new Scanner(System.in);
        Choice choice= Choice.valueOf(input.nextLine());
        System.out.println("You have entered :"+ choice);
        switch (choice){
            case DOG -> intendedAnimal= new Dog();
            case TIGER -> intendedAnimal = new Tiger();
            default -> System.out.println("wrong choice of animal");
        }
        return intendedAnimal;
    }
}
