package com.javarush.island;

import com.javarush.island.Annotations.Emoji;
import com.javarush.island.Carnivores.*;
import com.javarush.island.Herbivores.*;
import com.javarush.island.Plants.Plants;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.BasicPosition;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static AnimalMaking animalMaking = new AnimalMaking();
    private static BasicPosition[][] island = null;

    public static void main(String[] args) {
        island = dialogAndRules(island);
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
                    System.out.print("["+ (island[i][j].getEmoji()) + "]");
            }
            System.out.println();
        }
    }

    private static void putOnIsland(Class animal){
        try {
            System.out.println(animalMaking.goCreate(animal, island));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
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
            int x = randomPosition.nextInt(0, island.length);
            int y = randomPosition.nextInt(0, island[0].length);
            island[x][y] = new BasicPosition(x, y, "\uD83C\uDF31");
        }
        System.out.println(Plants.class.getSimpleName() + " = " + 200);
    }

    public static BasicPosition[][] dialogAndRules(BasicPosition[][] island){
        int width = 20;
        int length = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Welcome to the wild animal world!");
        System.out.println("You have an island 100x20 and a lot of animals!\nDo you want to change size of island?: " );
        System.out.println("YES(1)/NO(2):");

        int answer = 0;
        try {
             answer = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Put only numbers 1-for YES or 2-for NO");
        }

        if (answer == 1) {
            System.out.println("Let's choose the size of the island!\nPlease write width of the island: ");
            try {
                width = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You should put the number! Try 5 min later.");
            }
            System.out.println("Now choose the length of the island");
            try {
                length = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You should put the number! Try 5 min later.");
            }
            System.out.println("You chose size of the island, now island's size is: " + width + "x" + length);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Quantity of animals: ");
            return island = new BasicPosition[length][width];
        }else if (answer == 2){
            System.out.println("You chose default option, Island's size is 100x20");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Quantity of animals: ");
            return island = new BasicPosition[length][width];
        } else throw new RuntimeException("You didn't choose any option! (YES(1) or NO(2))");
    }
}
