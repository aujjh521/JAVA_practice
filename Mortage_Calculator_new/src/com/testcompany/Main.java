package com.testcompany;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //define constant
        final int MONTH_OF_YEAR = 12;
        final int PERCENT = 100;

        //create object to Read input
        //get principle
        Scanner scanner = new Scanner(System.in);
        System.out.print("pls enter principle: ");
        double principle = scanner.nextDouble();

        //get Interest Rate
        System.out.print("pls enter Annual Interest Rate: ");
        double annual_ratio = scanner.nextDouble();
        double monthly_ratio = annual_ratio / PERCENT / MONTH_OF_YEAR;

        //get period
        System.out.print("pls enter period: ");
        double year_period = scanner.nextDouble();
        double month_period = year_period * MONTH_OF_YEAR;

        //calculate
        double mortgage = principle * monthly_ratio * Math.pow((1+monthly_ratio),month_period) / (Math.pow((1+monthly_ratio),month_period) - 1);

        //format result
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // NumberFormat是一個abstract, 要先產生他的instance
        String result_string = currency.format(mortgage);
        System.out.println("Mortgage: " + result_string);
    }
}
