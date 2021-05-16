package com.designpatterns.builderPattern;

public class MotorCycle implements Builder {
    private String brandName;

    public MotorCycle(String brandName) {
        this.brandName = brandName;
        product = new Product();
    }

    private Product product;

    @Override
    public void startUpOperations() {

    }

    @Override
    public void buildBody() {
        product.add("This is a body of a Motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("1 headlights are added");
    }

    @Override
    public void endOperations() {
        product.add(String.format("Motorcycle model is :%s",this.brandName));
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
