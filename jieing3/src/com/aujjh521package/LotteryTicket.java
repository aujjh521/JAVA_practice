package com.aujjh521package;

import java.util.ArrayList;
import java.util.Arrays;

public class LotteryTicket {

    int[] ticket_num = new int[7];

    int[] getTicket_num() {

        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                ticket_num[i] = (int) (Math.random() * (42 - 1 + 1)) + 1;
            } else {
                int temp = (int) (Math.random() * (42 - 1 + 1)) + 1;
                while (contains(ticket_num, temp)) {
                    temp = (int) (Math.random() * (42 - 1 + 1)) + 1;
                }
                ticket_num[i] = temp;
            }
        }

        return ticket_num;
    }

    boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }

}
