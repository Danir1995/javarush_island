package com.javarush.island.Plants;

import com.javarush.island.abstractClasses.BasicPosition;

public class Plants extends BasicPosition {
    protected Plants(int[][] position) {
        super(position);
    }

    protected void grow(){
        System.out.println("Grass grows");
    }
}
