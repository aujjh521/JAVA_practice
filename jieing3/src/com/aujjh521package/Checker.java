package com.aujjh521package;

public class Checker {
    boolean ifBingo(int[] goal, int[] nums) {
        boolean res = false;
        for (int i = 0; i < 7; i++) {
            res = res || (goal[i] == nums[i]);
        }
        return res;
    }

    int getMatchCnt(int[] goal, int[] nums){
        int cnt = 0;
        for (int i=0 ; i<7 ; i++){
            if (goal[i]==nums[i]){
                cnt = cnt + 1;
            }
        }
        return cnt;
    }
}

