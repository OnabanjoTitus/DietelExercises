package com.designpatterns.builderPattern;

public class BuilderPattern {
    public static void main(String[] args) {
        Director director = new Director();

        Builder fordCar = new Car("Ford");
        Builder hondaMotorcycle = new MotorCycle("Honda");

        director.construct(fordCar);
        //Making Car
        Product product=fordCar.getVehicle();
        product.showProduct();

        //Making MotorCycle

        director.construct(hondaMotorcycle);
        Product product1 = hondaMotorcycle.getVehicle();
        product1.showProduct();

    }
}
