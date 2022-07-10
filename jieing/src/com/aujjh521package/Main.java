package com.aujjh521package;

import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int r;

        Scanner scanner = new Scanner(System.in);
        System.out.print("pls enter a number to roll a dice: ");
        int input = scanner.nextInt();

        for (int i=1; i<=input;i++ ){
            r =  (int)(Math.random()*(6-1+1))+1;
            System.out.println(i + "time, result " + r);

        }





    }
}
