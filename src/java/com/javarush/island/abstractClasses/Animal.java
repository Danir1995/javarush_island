package com.javarush.island.abstractClasses;

public abstract class Animal extends BasicPosition{
    protected Animal(int x, int y) {
        super(new int[][]{{x,y}});
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
