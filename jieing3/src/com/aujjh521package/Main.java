package com.aujjh521package;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // define answer
        LotteryTicket answer_ticket = new LotteryTicket();
        int[] answer_ticket_num = answer_ticket.getTicket_num();
        System.out.println("Goal lottery ticket number is " + Arrays.toString(answer_ticket_num));

        // ask for ticket amount
        Scanner scanner = new Scanner(System.in);
        System.out.print("pls enter a number for lottery ticket amount: ");
        int input = scanner.nextInt();

        // store matched number
        int[] match_record = new int[input];

        // create lottery ticket
        for (int i=1 ; i<=input ; i++){
            // create ticket
            LotteryTicket ticket = new LotteryTicket();
            int[] ticket_num = ticket.getTicket_num();

            // check if bingo
            Checker checker = new Checker();
            boolean if_bingo = checker.ifBingo(answer_ticket_num, ticket_num);
            int matched_num = checker.getMatchCnt(answer_ticket_num, ticket_num);

            String mesg = i + "th lottery ticket number is " + Arrays.toString(ticket_num) + " --> " + matched_num;
            System.out.println(mesg);

            // record matched number count
            match_record[i-1] = matched_num;
        }
        System.out.println("matched record is " + Arrays.toString(match_record));
    }
}


