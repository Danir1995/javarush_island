package com.javarush.island;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Herbivores.Boar;
import com.javarush.island.Herbivores.Horse;
import com.javarush.island.Herbivores.Mouse;
import com.javarush.island.Plants.Plants;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.BasicItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class MoveAnimals {
    public ThreadLocalRandom chooseSideByNum = ThreadLocalRandom.current();

    public final int LEFT = 1;
    public final int RIGHT = 2;
    public final int UP = 3;
    public final int DOWN = 4;

    public void chooseSide(int[][] island, Map<String, List<BasicItem>> animalList) {
        AnimalMaking animalMaking = new AnimalMaking();
        List<BasicItem> animals;

        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                animals = animalList.get("x" + i + "y" + j);
                for (int e = 0; e < animals.size(); e++) {

                    int randomSide = chooseSideByNum.nextInt(1, 5);
                    try {
                        switch (randomSide) {
                            case LEFT -> {
                                animalList.get("x" + i + "y" + (j - animalMaking.move(animals.get(e).getClass()))).add(animals.get(e));
                                animals.remove(e);
                            }
                            case RIGHT -> {
                                animalList.get("x" + i + "y" + (j + animalMaking.move(animals.get(e).getClass()))).add(animals.get(e));
                                animals.remove(e);
                            }
                            case UP -> {
                                animalList.get("x" + (i - animalMaking.move(animals.get(e).getClass())) + "y" + j).add(animals.get(e));
                                animals.remove(e);
                            }
                            case DOWN -> {
                                animalList.get("x" + (i + animalMaking.move(animals.get(e).getClass())) + "y" + j).add(animals.get(e));
                                animals.remove(e);
                            }
                        }
                    } catch (NullPointerException animalChoseSideToGoOutsideOfIsland) {
                        System.out.println("animal can not go outside of island");
                    }
                }
            }
        }
    }
}
//work on logic if animal want go outside of island