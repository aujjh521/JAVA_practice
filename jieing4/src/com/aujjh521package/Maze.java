package com.aujjh521package;

public class Maze {

    private String[][] mazeMap;

    //public Maze不是一般的方法,是一個java class的constructor(定義這個物件一開始要產生需要的輸入,就像python的 __init__)
    public Maze(String[][] mazeArray){
        this.mazeMap = mazeArray;
        System.out.println("create mazeMap done!");
    }

    public void printMazeMap(){
        // check 2d string array content
        System.out.println("The content of 2D string array is");
        for (String[] x : this.mazeMap) {
            for (String y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

}
