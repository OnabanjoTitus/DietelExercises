package com.company;

public class TrianglePrintingTogether {
    public static void main(String[] args) {
        for (int asterisksCounter = 1; asterisksCounter <= 10; asterisksCounter++) {
            for (int asterisks = 1; asterisks <= asterisksCounter; asterisks++) {
                System.out.print("*");
            }
            for (int asterisksSpacer = 9; asterisksSpacer >= asterisksCounter; asterisksSpacer--) {
                System.out.print(" ");
            }

            for (int asterisks = 10; asterisks >= asterisksCounter; asterisks--) {
                System.out.print("*");
            }

            System.out.println();

            }



            }}




