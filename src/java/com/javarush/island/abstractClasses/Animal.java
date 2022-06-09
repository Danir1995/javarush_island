package com.javarush.island.abstractClasses;



import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Animal extends BasicPosition{


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
        return super.toString();
    }
}
