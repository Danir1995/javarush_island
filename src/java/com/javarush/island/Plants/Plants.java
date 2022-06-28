package com.javarush.island.Plants;

import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.BasicItem;

@Emoji(emoji = "\uD83C\uDF31")
public class Plants extends BasicItem {
    public final int MaxQuantity = 200;
    int x;
    int y;
    boolean isEaten = false;

    int weight = 1;

    public int getWeight() {
        return weight;
    }

    public boolean isEaten() {
        return isEaten;
    }

    public void setEaten(boolean eaten) {
        this.isEaten = eaten;
    }

    public Plants(int x, int y, String  emoji) {
        super(x, y, "\uD83C\uDF31");
    }

    protected void grow(){
        System.out.println("Grass grows");
    }


}
