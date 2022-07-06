import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 比較
        int x = 1;
        double y = 1D;
        System.out.println(x == y);

        // 邏輯運算 (注意& 跟 &&不一樣)
        boolean a = true;
        boolean b = false;
        int x1 = 5;
        int y1 = 0;
        System.out.println(b && x1/y1 == 0);

        //if
        int temp = 32;
        int high_criteria = 30;
        int low_crteria = 20;
        if (temp > high_criteria) {
            System.out.println("it's a hot day");
            System.out.println("pls drink water");
        }

        else if (temp < high_criteria && temp > low_crteria) {
            System.out.println("it's a nice day");
        }
        else {
            System.out.println("it's cold day");
        }

        //簡化的if statement
        int income = 90_000;
        int rich_spec = 100_000;
        boolean hasHighIncome = (income > rich_spec);
        System.out.println("if high income : " + hasHighIncome);


        //ternary operator
        int income1 = 90_000;
        String className = income1 > 100_000 ? "First" : "Economy";
        System.out.println("className is : " + className);

        //switch statement
        String role = "admin";
        if (role=="admin")
            System.out.println("you are admin");
        else if (role=="moderator")
            System.out.println("you are moderator");
        else
            System.out.println("you are a guest");

        switch (role) {
            case "admin":
                System.out.println("you are admin");
                break;
            case "moderator":
                System.out.println("you are moderator");
                break;
            default:
                System.out.println("you are a guest");
                break;
        }

        // for loop
        for (int i=0;i<5; i++)
            System.out.println("for loop" + i);

        //while loop (結合 break , continue)
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }



    }
}