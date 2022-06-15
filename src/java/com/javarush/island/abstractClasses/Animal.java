package com.javarush.island.abstractClasses;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;

@CharacteristicsOfAnimal
public class Animal extends BasicItem {

    public Animal(int x, int y, String  emoji) {
        super(x, y, emoji);
    }

    protected void eat() {
        System.out.println("I can eat");
    }

    protected void move(){
        System.out.println("I can move");
    }

    protected void reproduce(){
        System.out.println("I can reproduce!");
    }

    protected void die(){
        System.out.println("I died");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "x=" + x +
                ", y=" + y +
                ", emoji='" + emoji + '\'' +
                '}';
    }
}
