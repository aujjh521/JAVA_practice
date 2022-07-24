package com.aujjh521package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // check current directory
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        //read file to maze array
        String[][] mazeArray = new String[10][15]; // the size of mazeArray need to be declared first
        int i = 0;
        String fileName = "input.txt";
        try (Scanner sc = new Scanner(new FileReader(fileName));) {
            while (sc.hasNextLine()) {
                // read 1 line
                String line = sc.nextLine();
                //System.out.println(line);
                // save 1 line in to maze array
                String[] line_array = line.split(" ");
                mazeArray[i] = line_array;
                i = i +1;
            }
            System.out.println("Read file " + fileName + " done!");
        }
        catch (Exception e1){
            System.out.println(e1);
        }

        //create maze
        Maze mazeMap = new Maze(mazeArray);
        mazeMap.printMazeMap();
    }


}
