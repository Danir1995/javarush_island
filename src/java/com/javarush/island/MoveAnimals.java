package com.javarush.island;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Herbivores.Boar;
import com.javarush.island.Herbivores.Horse;
import com.javarush.island.Herbivores.Mouse;
import com.javarush.island.Plants.Plants;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.BasicItem;

import java.util.concurrent.ThreadLocalRandom;

public class MoveAnimals {
    public ThreadLocalRandom chooseSideByNum = ThreadLocalRandom.current();
    public final int LEFT = 1;
    public final int RIGHT = 2;
    public final int UP = 3;
    public final int DOWN = 4;

    public BasicItem[][] chooseSide(BasicItem[][] animalStep) {
        BasicItem[][] island = new BasicItem[animalStep.length][animalStep[0].length];
        AnimalMaking animalMaking = new AnimalMaking();

        for (int i = 0; i < animalStep.length; i++) {
            for (int j = 0; j < animalStep[0].length; j++) {

                if (animalStep[i][j] != null && animalStep[i][j].getClass().isAnnotationPresent(CharacteristicsOfAnimal.class)){
                    try {
                       int steps = animalMaking.move(animalStep[i][j].getClass());
                        int RandomSide = chooseSideByNum.nextInt(1, 5);
                        if (RandomSide == LEFT) {
                            island[i][j + steps] = animalStep[i][j];

                        } else if (RandomSide == RIGHT) {
                            island[i][j - steps] = animalStep[i][j];

                        } else if (RandomSide == UP) {
                            island[i - steps][j] = animalStep[i][j];

                        } else if (RandomSide == DOWN) {
                            island[i + steps][j] = animalStep[i][j];

                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("animal can not go to the river");
                    }
                }
            }
        }return island;
    }
}
//animalMaking.move(animalStep[i][j].getClass())