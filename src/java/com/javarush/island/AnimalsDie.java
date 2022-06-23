package com.javarush.island;

import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.BasicItem;

import java.util.List;
import java.util.Map;

public class AnimalsDie {
    public void die(int[][] island, Map<String, List<BasicItem>> mapOfAnimals){
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                List<BasicItem> animals = mapOfAnimals.get("x" + i + "y" + j);
                for (int a = 0; a < animals.size(); a++){
                    if (animals.get(a) instanceof Animal){
                        if (((Animal) animals.get(a)).getSaturation() == 0){
                            ((Animal) animals.get(a)).setDied(true);
                            System.out.println(animals.get(a).getClass().getSimpleName() + " died");
                        }
                    }
                }
            }
        }
    }
}
