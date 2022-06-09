package com.javarush.island.abstractClasses;

import java.lang.annotation.Annotation;

public class BasicPosition {
    int x;
    int y;
    String emoji;

    public BasicPosition(int x, int y, String  emoji) {
        this.x = x;
        this.y = y;
        this.emoji = emoji;
    }

    public String getEmoji() {
        return emoji;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "BasicPosition{" +
                "x=" + x +
                ", y=" + y +
                ", emoji='" + emoji + '\'' +
                '}';
    }
}
