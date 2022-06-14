package com.javarush.island.Plants;

import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.BasicItem;

@Emoji(emoji = "\uD83C\uDF31")
public class Plants extends BasicItem {
    public final int MaxQuantity = 200;
    int x;
    int y;

    public Plants(int x, int y, String  emoji) {
        super(x, y, "\uD83C\uDF31");
    }

    protected void grow(){
        System.out.println("Grass grows");
    }


}
