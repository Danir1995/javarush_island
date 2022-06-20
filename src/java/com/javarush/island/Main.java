package com.javarush.island;

import com.javarush.island.Carnivores.*;
import com.javarush.island.Herbivores.*;
import com.javarush.island.Plants.Plants;
import com.javarush.island.abstractClasses.BasicItem;
import com.javarush.island.abstractClasses.Carnivores;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static AnimalMaking animalMaking = new AnimalMaking();
    private static int[][] island = null;
    private static int[][] copyIsland = null;
    private static List<BasicItem> basicItemList;
    private static Map<String, List<BasicItem>> mapOfAnimals = new HashMap<>();
    private static ThreadLocalRandom chooseYourDestiny = ThreadLocalRandom.current();

    public static void main(String[] args) {
        AnimalMovements animals = new AnimalMovements();
        AnimalEating animalEating = new AnimalEating();

        island = dialogAndRules(island);

        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                mapOfAnimals.put("x" + i + "y" + j, basicItemList = allAnimalsCreator(i, j));
                System.out.print("["+ (basicItemList.size()) + "]");
            }
            System.out.println();
        }

        System.out.println("=====================================================================");

        animals.chooseSide(island, mapOfAnimals);

        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                System.out.print("["+ (mapOfAnimals.get("x" + i + "y" + j).size()) + "]");
            }
            System.out.println();
        }

        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                List<BasicItem> islandSquare = mapOfAnimals.get("x" + i + "y" + j);
                for (int carnivore = 0; carnivore < islandSquare.size(); carnivore++) {
                    if (islandSquare.get(carnivore) instanceof Carnivores) {
                        for (int herbivore = 0; herbivore < islandSquare.size(); herbivore++) {
                            int timeToEat = chooseYourDestiny.nextInt(1, 101);
                            animalEating.eaten(islandSquare,islandSquare.get(carnivore), islandSquare.get(herbivore), timeToEat);
                            if (((Carnivores) islandSquare.get(carnivore)).getSaturation() >= animalMaking.saturation(islandSquare.get(carnivore).getClass())){
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("=====================================================================");
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {

                    System.out.print("[" + (mapOfAnimals.get("x" + i + "y" + j).size()) + "]");
            } System.out.println();
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
        List<BasicItem> all = new ArrayList<>();
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

            all.addAll(listBear);
            all.addAll(listBoa);
            all.addAll(listEagle);
            all.addAll(listFox);
            all.addAll(listWolf);
            all.addAll(listBuffalo);
            all.addAll(listCaterpillar);
            all.addAll(listDeer);
            all.addAll(listDuck);
            all.addAll(listGoat);
            all.addAll(listHorse);
            all.addAll(listMouse);
            all.addAll(listRabbit);
            all.addAll(listSheep);
            all.addAll(grassGrows(x, y));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return all;
    }

    private static List<BasicItem> grassGrows(int x, int y){
        List<BasicItem> grass = new ArrayList<>();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int grassQuantity = random.nextInt(10, 201);
        for (int i = 0; i < grassQuantity; i++){
            grass.add(new Plants(x, y, "\uD83C\uDF31"));
        }
        return grass;
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