package com.designpatterns.prototype;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        BasicCar nano= new Nano("Green Nano");
        nano.basicPrice=100000;

        BasicCar ford = new Ford("Ford Yellow");
        ford.basicPrice=500000;

        BasicCar bc1;

        bc1=nano.clone();
        bc1.onRoadPrice=nano.basicPrice+BasicCar.setAdditionalPrice();
        System.out.println("Car is: "+bc1.modelName+" and it's price is Rs."+bc1.onRoadPrice);

        bc1=ford.clone();
        bc1.onRoadPrice=ford.basicPrice+BasicCar.setAdditionalPrice();
        System.out.println("Car is: "+bc1.modelName+" and it's price is Rs."+bc1.onRoadPrice);
    }
}
