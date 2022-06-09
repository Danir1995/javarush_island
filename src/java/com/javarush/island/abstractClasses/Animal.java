package com.javarush.island.abstractClasses;



import java.lang.annotation.Annotation;

public class Animal extends BasicPosition{


    public Animal(int x, int y) {
        super(x, y);
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


}
