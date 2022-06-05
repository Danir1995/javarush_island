package com.javarush.island.abstractClasses;

public abstract class BasicPosition {
    int[][] position;

    protected BasicPosition(int[][] position){
        this.position = position;
    }

    public int[][] getPosition() {
        return position;
    }

    public void setPosition(int[][] position) {
        this.position = position;
    }
}
