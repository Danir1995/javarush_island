package com.javarush.island.abstractClasses;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Main;

@CharacteristicsOfAnimal
public abstract class Animal extends BasicItem {
    private double saturation;
    private boolean isDied = false;
    private boolean isEaten = false;
    private int children;
    private boolean gaveBirth = false;

    public boolean isGaveBirth() {
        return gaveBirth;
    }

    public void setGaveBirth(boolean gaveBirth) {
        this.gaveBirth = gaveBirth;
    }

    public int getChildren() {
        return children;
    }

    public Animal(int x, int y, String  emoji) {
        super(x, y, emoji);
        saturation = 0;
    }

    protected void eat(int chance) {
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

    public double getSaturation() {
        return saturation;
    }

    public void setSaturation(double saturation) {
        this.saturation = saturation;
    }

    public boolean isDied() {
        return isDied;
    }

    public void setDied(boolean died) {
        isDied = died;
    }

    public boolean isEaten() {
        return isEaten;
    }

    public void setEaten(boolean eaten) {
        isEaten = eaten;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "saturation=" + saturation +
                ", isDied=" + isDied +
                ", isEaten=" + isEaten +
                ", children=" + children +
                ", gaveBirth=" + gaveBirth +
                '}';
    }
}
