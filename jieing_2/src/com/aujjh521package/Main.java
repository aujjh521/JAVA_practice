package com.aujjh521package;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("pls enter a number to roll a dice: ");
        int input = scanner.nextInt();

        Dice dice = new Dice();

        for (int i=1; i<=input;i++ ){
            int dice_result = dice.getR();
            System.out.println(i + "time, result " + dice_result);
        }

    }
}
