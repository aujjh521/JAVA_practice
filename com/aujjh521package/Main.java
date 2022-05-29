package com.aujjh521package;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //primitive types
        byte age = 30;
        long viewCount = 4_000_000_000L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        //reference types
        Date now = new Date();
        Date now2 = new Date();
        System.out.println(now2);

        //primitive types彼此不會ref對方.也就是一個仁改變不影響其他人
        byte x = 1;
        byte y = x;
        x = 3;
        System.out.println(x);
        System.out.println(y);

        //reference types
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point1);
        System.out.println(point2);

        String meg = "test messege";
        System.out.println(meg);


        double test_x = 10.0 / 3.0 ;
        System.out.println(test_x);

        //array
        int[] numbers = {4,1,6,8,4,2,3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //2D array
        int[][] numbers_2D = { {1,2,3}, {4,5,6} };
        System.out.println(Arrays.deepToString(numbers_2D));


    }
}
