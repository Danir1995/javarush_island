package com.javarush.island;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Carnivores.Bear;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.BasicItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class AnimalReproduce {
    AnimalMaking animalMaking = new AnimalMaking();
    Factory factory = new Factory();

    public List<BasicItem> reproduce(List<BasicItem> animals, int x, int y, ThreadLocalRandom chance, int[][] island) {

        List<BasicItem> children = animals;

        for (int man = 0; man < animals.size(); man++) {
            BasicItem male = animals.get(man);
            for (int fem = 1; fem < children.size(); fem++) {
                BasicItem female = children.get(fem);
                if (male instanceof Animal) {
                    if (female instanceof Animal) {
                        if (!((Animal) female).isGaveBirth() && male.getEmoji().equals(female.getEmoji())) {
                            int letsReproduce = chance.nextInt(1, 100);
                            int howManyChildren = ((Animal) male).getChildren();
                            int quantityOfChildren = chance.nextInt(0, howManyChildren);
                            if (letsReproduce < 10 && animals.size() < Main.maxQuantityOfAnimalsOnSquare && (Main.getCounters(male) / island.length * island[0].length) < animalMaking.animalQuantity(male.getClass())) {
                                   for (int j = 0; j < quantityOfChildren; j++) {
                                       animals.add(factory.create(male, x, y));
                                   }
                                   ((Animal) female).setGaveBirth(true);
                                   break;
                               }
                            }
                        }

                    }
                }
            }
        return animals;
    }
}
