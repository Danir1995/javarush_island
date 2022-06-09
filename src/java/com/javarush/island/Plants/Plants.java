package com.javarush.island.Plants;

import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.BasicPosition;

import java.lang.annotation.Annotation;
import java.util.StringTokenizer;
@Emoji(emoji = "\uD83C\uDF31")
public class Plants extends BasicPosition{
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
