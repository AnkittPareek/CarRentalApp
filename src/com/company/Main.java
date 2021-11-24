package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int bill , hours;
        Scanner babulal = new Scanner(System.in);

        System.out.println("Welcome to Alpha Rentals. \n" +
                "Do you want the car in Mumbai? Y/N");
        char cityCheck = babulal.nextLine().charAt(0);

        // Checking if the car is requested for mumbai.

        if (cityCheck == 89 || cityCheck == 121 ){
            System.out.println("How many hours do you need the car for?");
            hours = babulal.nextInt();
            bill = hours * 100;

            // Checking if the car is booked for more than 3 hours.

            if (bill > 300) {
                System.out.println("Congratulations! We have booked your car." +
                        "\nYour bill is "+bill+" Rupees.");
            } else {
                System.out.println("Oh snap! We can not provide cars for less than 4 hours." +
                        "Try booking again.");
            }

        } else
            System.out.println("Unfortunately At this time we only have cars available for Mumbai." +
                    "We will come to your city soon.");
    }
}