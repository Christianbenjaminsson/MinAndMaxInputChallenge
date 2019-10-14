package com.example.minandmaxinputchallenge;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int min = 0, max = 0;
        boolean first = true;

        while(true) {

            System.out.print("Enter number (enter a letter to finish): ");
            boolean isAnInt = scan.hasNextInt();

            if(isAnInt) {

                int number = scan.nextInt();

                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }
            } else {
                break;
            }

            scan.nextLine();
        }

        System.out.println("Min= " + min + " max= " +max);

        scan.close();
    }
}
