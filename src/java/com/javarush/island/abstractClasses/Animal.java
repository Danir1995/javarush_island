package com.javarush.island.abstractClasses;



import java.lang.annotation.Annotation;

public abstract class Animal{
    int x;
    int y;

    public Animal(int x, int y) {
       this.x = x;
       this.y = y;
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
