package com.aujjh521package;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // get input
        Scanner scanner = new Scanner(System.in);
        System.out.print("pls enter a number: ");
        int input = scanner.nextInt();

        Float test_3 = input % 3F;
        Float test_5 = input % 5F;

        if (test_3 == 0 && test_5 == 0)
            System.out.println("FizzBuzz");
        else if (test_3 != 0 && test_5 == 0)
            System.out.println("Buzz");
        else if (test_3 == 0 && test_5 != 0)
            System.out.println("Fizz");
        else
            System.out.println(input);
    }
}
