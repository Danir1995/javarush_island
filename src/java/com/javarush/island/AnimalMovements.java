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

public class AnimalMovements {
    public ThreadLocalRandom chooseSideByNum = ThreadLocalRandom.current();

    public final int LEFT = 1;
    public final int RIGHT = 2;
    public final int UP = 3;
    public final int DOWN = 4;

    public void chooseSide(int[][] island, Map<String, List<BasicItem>> animalsOnSquare) {
        AnimalMaking animalMaking = new AnimalMaking();
        List<BasicItem> animals;

        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                animals = animalsOnSquare.get("x" + i + "y" + j);
                for (int e = 0; e < animals.size(); e++) {

                    int randomSide = chooseSideByNum.nextInt(1, 5);
                    if ((animals.get(e) instanceof Animal)) {
                        try {
                            int steps = animals.get(e).getClass().getAnnotation(CharacteristicsOfAnimal.class).walkingDistance();

                            switch (randomSide) {
                                case LEFT -> {
                                    animals.get(e).setY(j - steps);
                                    animalsOnSquare.get("x" + i + "y" + (j - steps)).add(animals.get(e));
                                    animals.remove(e);
                                }
                                case RIGHT -> {
                                    animals.get(e).setY(j + steps);
                                    animalsOnSquare.get("x" + i + "y" + (j + steps)).add(animals.get(e));
                                    animals.remove(e);
                                }
                                case UP -> {
                                    animals.get(e).setX(i - steps);
                                    animalsOnSquare.get("x" + (i - steps) + "y" + j).add(animals.get(e));
                                    animals.remove(e);
                                }
                                case DOWN -> {
                                    animals.get(e).setX(i + steps);
                                    animalsOnSquare.get("x" + (i + steps) + "y" + j).add(animals.get(e));
                                    animals.remove(e);
                                }
                            }
                        } catch (NullPointerException ignored) {
                        //if animal will choose the side to go to outside of the island - he will stay in the same place
                        }
                    }
                }
            }
        }
    }
}
