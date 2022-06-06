package com.javarush.island.Plants;

import com.javarush.island.abstractClasses.BasicPosition;

public class Plants{
    public final int MaxQuantity = 200;
    int x;
    int y;

    public Plants(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected void grow(){
        System.out.println("Grass grows");
    }
}
