package com.aujjh521package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // check current directory
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        //read file
        String fileName = "input.txt";
        try (Scanner sc = new Scanner(new FileReader(fileName));) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            System.out.println("Read file " + fileName + " done!");
        }
        catch (Exception e1){
            System.out.println(e1);
        }


    }
}
