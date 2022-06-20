package com.javarush.island.abstractClasses;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;

@CharacteristicsOfAnimal
public abstract class Animal extends BasicItem {
    int saturation;
    boolean isDied = false;
    boolean isAte = false;

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

    public int getSaturation() {
        return saturation;
    }

    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }

    public boolean isDied() {
        return isDied;
    }

    public void setDied(boolean died) {
        isDied = died;
    }

    public boolean isAte() {
        return isAte;
    }

    public void setAte(boolean ate) {
        isAte = ate;
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
