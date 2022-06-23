package com.javarush.island;

import com.javarush.island.Carnivores.Bear;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.BasicItem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class AnimalReproduce {
    AnimalMaking animalMaking = new AnimalMaking();

    public List<BasicItem> reproduce(List<BasicItem> animals, int x, int y, ThreadLocalRandom random){

        List<BasicItem> childrenOfAnimals = new ArrayList<>();
        for (int male = 0; male < animals.size(); male++){
            for (int female = 1; female < animals.size(); female++) {
                if (animals.get(male) instanceof Animal){
                    if (animals.get(female) instanceof Animal){
                        int letsReproduce = random.nextInt(1, 100);
                               if (animals.size() < Main.maxQuantityOfAnimalsOnSquare) {
                                   if (!((Animal) animals.get(female)).isGaveBirth()) {
                                       if (letsReproduce <= 10) {
                                   if (animals.get(male).getClass().getSimpleName().equals(animals.get(female).getClass().getSimpleName())) {
                                       for (int i = 0; i < ((Animal) animals.get(female)).getChildren(); i++) {
                                           ((Animal) animals.get(female)).setGaveBirth(true);
                                           animals.add(new Animal(x, y, animals.get(male).getEmoji()) {
                                           });
                                       }
                                       break;
                                   }
                               }
                            }
                        }
                    }

                }
            }
        }
        return animals;
    }
}
