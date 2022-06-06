package com.javarush.island;

import com.javarush.island.Carnivores.*;
import com.javarush.island.Herbivores.*;
import com.javarush.island.Plants.Plants;

import java.nio.file.StandardOpenOption;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static final String[][] island = new String[100][20];

    public static void main(String[] args) {
        grassGrows();
        allAnimalsCreator();
        showIsland();

    }

    private static void showIsland(){
        for (int i = 0; i < island.length; i++){
            for (int j = 0; j < island[i].length; j++){
                if (island[i][j] == null){
                    System.out.print("[ ]");
                }else
                    System.out.print("["+ island[i][j] + "]");
            }
            System.out.println();
        }
    }

    private static void putOnIsland(Class animal){
        AnimalMaking animalMaking = new AnimalMaking();
        System.out.println(animalMaking.goCreate(animal, island));
    }

    private static void allAnimalsCreator(){
        putOnIsland(Bear.class);
        putOnIsland(Boar.class);
        putOnIsland(Boa.class);
        putOnIsland(Eagle.class);
        putOnIsland(Fox.class);
        putOnIsland(Wolf.class);
        putOnIsland(Buffalo.class);
        putOnIsland(Caterpillar.class);
        putOnIsland(Deer.class);
        putOnIsland(Duck.class);
        putOnIsland(Goat.class);
        putOnIsland(Horse.class);
        putOnIsland(Mouse.class);
        putOnIsland(Rabbit.class);
        putOnIsland(Sheep.class);
    }

    private static void grassGrows(){
        ThreadLocalRandom randomPosition = ThreadLocalRandom.current();
        for (int i = 0; i < 200; i++){
            int x = randomPosition.nextInt(0, 100);
            int y = randomPosition.nextInt(0, 20);
            island[x][y] = "\uD83C\uDF31";
        }
        System.out.println(Plants.class.getSimpleName() + " = " + 200);
    }
}
