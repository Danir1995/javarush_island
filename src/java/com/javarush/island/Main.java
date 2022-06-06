package com.javarush.island;

import com.javarush.island.Carnivores.Bear;
import com.javarush.island.Herbivores.Boar;
import com.javarush.island.Herbivores.Caterpillar;
import com.javarush.island.Herbivores.Horse;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static final String[][] island = new String[100][20];

    public static void main(String[] args) {
        AnimalMaking animalMaking = new AnimalMaking();
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < animalMaking.animalQuantity(Caterpillar.class); i++) {
            Caterpillar caterpillar = new Caterpillar(random.nextInt(0, 99), random.nextInt(0, 19));
            animalMaking.goCreate(caterpillar.getClass(), island, caterpillar.getX(), caterpillar.getY());
        }
        for (int i = 0; i < island.length; i++){
            for (int j = 0; j < island[i].length; j++){
                if (island[i][j] == null){
                    System.out.print("[ ]");
                }else
                    System.out.print("["+ island[i][j] + "]");

            }System.out.println();
        }
    }
}
