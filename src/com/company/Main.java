package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int input;
        Scanner userInput=new Scanner(System.in);

        System.out.println("Enter input");
        input=userInput.nextInt();
        while(input!=1 && input!=2){
            System.out.println("Enter input");
            input=userInput.nextInt();
        }
    }
}
