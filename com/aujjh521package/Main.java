package com.aujjh521package;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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

        //Implicit casting
        // byte -> short -> int -> long -> float -> double
        double xx = 1.1;
        double yy = xx + 2; // 2 will be casted to double (記憶體小的會被轉成大的,因為大的可以描述小的)
        System.out.println(yy);

        //Explicit casting
        // byte -> short -> int -> long -> float -> double
        double xxx = 1.1;
        int yyy = (int)xxx + 2; // 強制把xx轉成int
        System.out.println(yyy);

        //把string做類別轉換
        String x_string = "1";
        int y_int = Integer.parseInt(x_string) + 2; // 利用Integer.parseInt把string轉int, 還有其他類別對應的轉換
        System.out.println(y_int);

        //Math class
        int x_ceil = (int)Math.ceil(1.1); //因為Math.ceil預設是返回double, 所以如果要得到int要自己做轉換
        System.out.println(x_ceil);

        //Formatting numbers (把數字轉成特定格式的string)
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // NumberFormat是一個abstract, 要先產生他的instance
        String result_string = currency.format(12312414.5656);
        System.out.println(result_string);

        NumberFormat percent = NumberFormat.getPercentInstance(); // NumberFormat是一個abstract, 要先產生他的instance
        String percent_string = percent.format(0.34);
        System.out.println(percent_string);

        //Reading input
        Scanner scanner = new Scanner(System.in);
        System.out.print("pls enter your name: ");
        String name = scanner.nextLine().trim();
        System.out.println("name is " + name);

        

    }
}
