package com.designpatterns.singleton;

public class SingletonPatternExample {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern Demo");
        System.out.println("Trying to make a captain for your team");
//        Captain c3 = new Captain(); this wont work
        Captain captain = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team");
        Captain captain1 = Captain.getCaptain();
        if(captain==captain1){
            System.out.println("captain and captain1 are same instance");
        }
    }
}
