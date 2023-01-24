package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter? ");
        int numberOfNumbers = scanner.nextInt();

        int[] numbers = new int[numberOfNumbers];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of the numbers is " + sum);
    }
}
