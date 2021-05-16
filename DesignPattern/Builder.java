package com.designpatterns.builderPattern;

interface Builder {
    void startUpOperations();
    void buildBody();
    void insertWheels();
    void addHeadlights();
    void endOperations();
    Product getVehicle();
}
