package com.aujjh521package;

public class Dice {
    int r;
    int getR() {
        r = (int) (Math.random()*(6-1+1))+1;
        return r;
    }
}
