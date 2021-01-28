package com.turtle.com;

public class SketchPad {
private int[][]floor;

    public SketchPad(int numberOfRows,int numberOfColumns) {
        this.floor = new int[numberOfRows][numberOfColumns];
    }

    public int[][] getFloor() {
        return floor;
    }
}
