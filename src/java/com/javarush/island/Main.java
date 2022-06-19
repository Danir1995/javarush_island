package com.javarush.island;

import com.javarush.island.Annotations.Emoji;
import com.javarush.island.Carnivores.*;
import com.javarush.island.Herbivores.*;
import com.javarush.island.Plants.Plants;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.BasicItem;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static AnimalMaking animalMaking = new AnimalMaking();
    private static int[][] island = null;
    private static int[][] copyIsland = null;
    private static List<BasicItem> basicItemList;
    private static Map<String, List<BasicItem>> mapOfAnimals = new HashMap<>();



    public static void main(String[] args) {
        island = dialogAndRules(island);
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                mapOfAnimals.put("x" + i + "y" + j, basicItemList = allAnimalsCreator(i, j));//сделать чтоб в бэсикайтем сразу закидывались животные
                System.out.println(basicItemList.size());
            }
        }

        System.out.println("=====================================================================");
        MoveAnimals animals = new MoveAnimals();
        animals.chooseSide(island, mapOfAnimals);
        for (Map.Entry<String, List<BasicItem>> m: mapOfAnimals.entrySet()){
           // System.out.println(m);
            System.out.println(m.getValue().size());
        }

    }

    private static void showIsland(BasicItem[][] island){
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

    private static List<BasicItem> allAnimalsCreator(int x, int y){
        List<BasicItem> allAnimals = new ArrayList<>();
        try {
           List<BasicItem> listBear = animalMaking.goCreate(Bear.class, x, y);
           List<BasicItem> listBoa = animalMaking.goCreate(Boa.class, x, y);
           List<BasicItem> listEagle = animalMaking.goCreate(Eagle.class, x, y);
           List<BasicItem> listFox = animalMaking.goCreate(Fox.class, x, y);
           List<BasicItem> listWolf = animalMaking.goCreate(Wolf.class, x, y);
           List<BasicItem> listBuffalo = animalMaking.goCreate(Buffalo.class, x, y);
           List<BasicItem> listCaterpillar = animalMaking.goCreate(Caterpillar.class, x, y);
           List<BasicItem> listDeer = animalMaking.goCreate(Deer.class, x, y);
           List<BasicItem> listDuck = animalMaking.goCreate(Duck.class, x, y);
           List<BasicItem> listGoat = animalMaking.goCreate(Goat.class, x, y);
           List<BasicItem> listHorse = animalMaking.goCreate(Horse.class, x, y);
           List<BasicItem> listMouse = animalMaking.goCreate(Mouse.class, x, y);
           List<BasicItem> listRabbit = animalMaking.goCreate(Rabbit.class, x, y);
           List<BasicItem> listSheep = animalMaking.goCreate(Sheep.class, x, y);

           allAnimals.addAll(listBear);
           allAnimals.addAll(listBoa);
           allAnimals.addAll(listEagle);
           allAnimals.addAll(listFox);
           allAnimals.addAll(listWolf);
           allAnimals.addAll(listBuffalo);
           allAnimals.addAll(listCaterpillar);
           allAnimals.addAll(listDeer);
           allAnimals.addAll(listDuck);
           allAnimals.addAll(listGoat);
           allAnimals.addAll(listHorse);
           allAnimals.addAll(listMouse);
           allAnimals.addAll(listRabbit);
           allAnimals.addAll(listSheep);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
      return allAnimals;
    }

    private static void grassGrows(){
        ThreadLocalRandom randomPosition = ThreadLocalRandom.current();

        for (int i = 0; i < 200; i++){
            int x = randomPosition.nextInt(0, island.length);
            int y = randomPosition.nextInt(0, island[0].length);
           // island[x][y] = new Plants(x, y, "\uD83C\uDF31");
        }
        System.out.println(Plants.class.getSimpleName() + " = " + 200);
    }

    public static int[][] dialogAndRules(int[][] island){
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
            return island = new int[length][width];
        }else if (answer == 2){
            System.out.println("You chose default option, Island's size is 100x20");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Quantity of animals: ");
            return island = new int[length][width];
        } else throw new RuntimeException("You didn't choose any option! (YES(1) or NO(2))");
    }
}