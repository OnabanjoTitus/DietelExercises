package com.designpatterns.builderPattern;

import java.util.LinkedList;

public class Product {
    private LinkedList<String>parts;
    public Product(){
        parts= new LinkedList<String>();
    }
    public void add(String part){
        parts.addLast(part);
    }
    public void showProduct(){
        System.out.println("Product completed as below: ");
        for(String part:parts){
            System.out.println(part);
        }
    }
}
