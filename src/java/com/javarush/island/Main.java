package com.javarush.island;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Carnivores.*;
import com.javarush.island.Herbivores.*;
import com.javarush.island.Plants.Plants;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.BasicItem;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static AnimalMaking animalMaking = new AnimalMaking();
    public static AnimalEating animalEating = new AnimalEating();
    public static AnimalMovements animals = new AnimalMovements();
    public static int maxQuantityOfAnimalsOnSquare = 2545;
    private static Scanner userChoice = new Scanner(System.in);
    private static int[][] island = null;
    private static List<BasicItem> basicItemList;
    private static Map<String, List<BasicItem>> mapOfAnimals = new HashMap<>();
    private static ThreadLocalRandom chooseYourDestiny = ThreadLocalRandom.current();
    private static AnimalReproduce animalReproduce = new AnimalReproduce();
    static int countPlants = 0;
    static int countAnimals = 0;
    static int countBears = 0;
    static int countMouses = 0;
    static int countBoas = 0;
    static int countEagles =0;
    static int countFox = 0;
    static int countWolfs = 0;
    static int countBoar = 0;
    static int countBuffalos = 0;
    static int countCaterpillars = 0;
    static int countDeers = 0;
    static int countDuck = 0;
    static int countGoat = 0;
    static int countHorse = 0;
    static int countRabbit = 0;
    static int countSheep = 0;

    public static void main(String[] args) throws InterruptedException {
        String oneProcess = "=====================================================================";
        island = dialogAndRules(island);
        int days = 0;
        try {
            days = userChoice.nextInt();
        }catch (InputMismatchException exception){
            System.out.println("Please try more, you have to put amount of days(number).");
            return;
        }
        makeLife();
        System.out.println("Start of life...");
        for (int day = 0; day < days; day++) {
            prepareToReproduce();
            System.out.println("Day" + ++day);
            System.out.println("State of the island: ");
            Thread.sleep(1000);
            showIsland();
            zeroingOfCounters();
            System.out.println(oneProcess);
            System.out.println("Animals went to another area...");
            Thread.sleep(1000);
            animals.chooseSide(island, mapOfAnimals);
            showIsland();
            zeroingOfCounters();
            System.out.println(oneProcess);
            System.out.println("Natural selection...");
            Thread.sleep(1000);
            letsHunt();
            cleanIslandFromDeadBodies();
            showIsland();
            zeroingOfCounters();
            System.out.println(oneProcess);
            System.out.println("Grass grows on fertile land...");
            getHungry();
            Thread.sleep(1000);
            reFillOfGrass();
            showIsland();

            System.out.println(oneProcess);
            System.out.println("Reproduction in action...");
            Thread.sleep(1000);
            reproduceChildren();

            showIsland();
            zeroingOfCounters();
            System.out.println(oneProcess);
            getHungry();
            System.out.println("Hungry animals gonna die...");
            Thread.sleep(1000);
            die();
            cleanIslandFromDeadBodies();
            showIsland();
            zeroingOfCounters();
            System.out.println(oneProcess);
        }
    }

    public static int[][] dialogAndRules(int[][] island){
        int width = 20;
        int length = 100;

        System.out.println("Hello! Welcome to the wild animal world!");
        System.out.println("You have an island 100x20 and a lot of animals!\nDo you want to change size of island?: " );
        System.out.println("YES(1)/NO(2):");

        int answer = 0;
        try {
            answer = userChoice.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Put only numbers 1-for YES or 2-for NO");
        }

        if (answer == 1) {
            System.out.println("Let's choose the size of the island!\nPlease write width of the island: ");
            try {
                width = userChoice.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You should put the number! Try 5 min later.");
            }
            System.out.println("Now choose the length of the island");
            try {
                length = userChoice.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You should put the number! Try 5 min later.");
            }
            System.out.println("You chose size of the island, now island's size is: " + width + "x" + length);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Now, please choose how many days do you want to simulate?");
            return island = new int[length][width];
        }else if (answer == 2){
            System.out.println("You chose default option, Island's size is 100x20");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Now, please choose how many days do you want to simulate?");
            return island = new int[length][width];
        } else throw new RuntimeException("You didn't choose any option! (YES(1) or NO(2))");
    }

    public static void showIsland(){
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                System.out.print("[" + (mapOfAnimals.get("x" + i + "y" + j).size()) + "]");
            } System.out.println();
        }

        for (Map.Entry<String ,List<BasicItem>> allAnimals: mapOfAnimals.entrySet()){
            List<BasicItem> basicItemList = allAnimals.getValue();
            for (BasicItem basicItem : basicItemList) {

                if (basicItem instanceof Plants) {
                    countPlants += 1;
                }
                if (basicItem instanceof Animal){
                    countAnimals += 1;
                }
                if(basicItem instanceof Bear){
                    countBears += 1;
                }
                if (basicItem instanceof Mouse){
                    countMouses += 1;
                }
                if (basicItem instanceof Boa) {
                    countBoas += 1;
                }
                if (basicItem instanceof Horse){
                    countHorse  += 1;
                }
                if (basicItem instanceof Deer){
                    countDeers += 1;
                }
                if (basicItem instanceof Duck){
                    countDuck += 1;
                }
                if (basicItem instanceof Caterpillar){
                    countCaterpillars += 1;
                }
                if (basicItem instanceof Boar){
                    countBoar += 1;
                }
                if (basicItem instanceof Wolf){
                    countWolfs += 1;
                }
                if (basicItem instanceof Fox){
                    countFox += 1;
                }
                if (basicItem instanceof Buffalo){
                    countBuffalos  += 1;
                }
                if (basicItem instanceof Goat){
                    countGoat  += 1;
                }
                if (basicItem instanceof Sheep){
                    countSheep  += 1;
                }
                if (basicItem instanceof Eagle){
                    countEagles  += 1;
                }
                if (basicItem instanceof Rabbit){
                    countRabbit  += 1;
                }
            }
        }
        System.out.println("Total animals = " + countAnimals);
        System.out.println("Plants = " + countPlants);
        System.out.println("Bears = " + countBears);
        System.out.println("Boars = " + countBoar);
        System.out.println("Buffalos = " + countBuffalos);
        System.out.println("Foxes = " + countFox);
        System.out.println("Horses = " + countHorse);
        System.out.println("Wolfs = " + countWolfs);
        System.out.println("Deers = " + countDeers);
        System.out.println("Caterpillars = " + countCaterpillars);
        System.out.println("Ducks = " + countDuck);
        System.out.println("Rabbits = " + countRabbit);
        System.out.println("Mouses = " + countMouses);
        System.out.println("Boas = " + countBoas);
        System.out.println("Goats = " + countGoat);
        System.out.println("Sheeps = " + countSheep);
        System.out.println("Eagles = " + countEagles);
    }

    public static void prepareToReproduce(){
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                List<BasicItem> animals = mapOfAnimals.get("x" + i + "y" + j);
                for (BasicItem animalPrepared: animals){
                    if (animalPrepared instanceof Animal){
                        ((Animal) animalPrepared).setGaveBirth(false);
                    }
                }
            }
        }
    }

    public static int getCounters(BasicItem creatures){
        if (creatures instanceof Animal) {
            if (creatures instanceof Bear) return countBears;
            if (creatures instanceof Mouse) return countMouses;
            if (creatures instanceof Boa) return countBoas;
            if (creatures instanceof Eagle) return countEagles;
            if (creatures instanceof Fox) return countFox;
            if (creatures instanceof Wolf) return countWolfs;
            if (creatures instanceof Boar) return countBoar;
            if (creatures instanceof Buffalo) return countBuffalos;
            if (creatures instanceof Caterpillar) return countCaterpillars;
            if (creatures instanceof Deer) return countDeers;
            if (creatures instanceof Duck) return countDuck;
            if (creatures instanceof Goat) return countGoat;
            if (creatures instanceof Horse) return countHorse;
            if (creatures instanceof Rabbit) return countRabbit;
            if (creatures instanceof Sheep) return countSheep;
        }
        if (creatures instanceof Plants){
            return countPlants;
        }
        else return countAnimals;
    }

    private static void letsHunt(){
        for (int i = 0; i < island.length-1; i++) {
            for (int j = 0; j < island[0].length-1; j++) {
                List<BasicItem> islandSquare = mapOfAnimals.get("x" + i + "y" + j);

                for (int attacker = 0; attacker < islandSquare.size(); attacker++) {
                    for (int victim = 0; victim < islandSquare.size(); victim++) {

                        int timeToEat = chooseYourDestiny.nextInt(1, 101);
                        if (animalEating.eaten(islandSquare.get(attacker), islandSquare.get(victim), timeToEat)) {
                            if (islandSquare.get(victim) instanceof Animal){
                                if (((Animal) islandSquare.get(victim)).isDied()){
                                    islandSquare.remove(victim);
                                }
                            }
                            if (islandSquare.get(victim) instanceof Plants){
                                if (((Plants) islandSquare.get(victim)).isEaten()){
                                    islandSquare.remove(victim);
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void cleanIslandFromDeadBodies(){
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                for (int a = 0; a < mapOfAnimals.get("x" + i + "y" + j).size(); a++ ) {
                    List<BasicItem> nature = mapOfAnimals.get("x" + i + "y" + j);
                    Object uselessInstance = mapOfAnimals.get("x" + i + "y" + j).get(a);
                    if (uselessInstance instanceof Animal){
                        if (((Animal)uselessInstance).isDied()){
                            nature.remove(uselessInstance);
                        }
                    }
                    if (uselessInstance instanceof Plants){
                        if (((Plants) uselessInstance).isEaten()){
                            nature.remove(uselessInstance);
                        }
                    }
                }
            }
        }
    }

    private static void makeLife(){
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                mapOfAnimals.put("x" + i + "y" + j, basicItemList = natureCreator(i, j));
            }
        }
    }

    private static void reproduceChildren(){
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                List<BasicItem> islandSquare = mapOfAnimals.get("x" + i + "y" + j);
                islandSquare = animalReproduce.reproduce(islandSquare, i, j, chooseYourDestiny, island);
                mapOfAnimals.put(("x" + i + "y" + j), islandSquare);
            }
        }
        zeroingOfCounters();
    }

    private static void die(){
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                List<BasicItem> animals = mapOfAnimals.get("x" + i + "y" + j);
                for (int a = 0; a < animals.size(); a++){
                    if (animals.get(a) instanceof Animal){
                        if (((Animal) animals.get(a)).getSaturation() == 0){
                            ((Animal) animals.get(a)).setDied(true);
                        }
                    }
                }
            }
        }
    }

    private static void reFillOfGrass(){
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                mapOfAnimals.get("x" + i + "y" + j).addAll(grassGrows(i, j));
            }
        }
    }

    private static void zeroingOfCounters(){
        countPlants = 0;
        countAnimals = 0;
        countBears = 0;
        countMouses = 0;
        countBoas = 0;
        countEagles =0;
        countFox = 0;
        countWolfs = 0;
        countBoar = 0;
        countBuffalos = 0;
        countCaterpillars = 0;
        countDeers = 0;
        countDuck = 0;
        countGoat = 0;
        countHorse = 0;
        countRabbit = 0;
        countSheep = 0;
    }

    private static List<BasicItem> natureCreator(int x, int y){
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
            List<BasicItem> listBoar = animalMaking.goCreate(Boar.class, x, y);

            all.addAll(listBear);
            all.addAll(listBoa);
            all.addAll(listBoar);
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

    private static void getHungry(){
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                basicItemList = mapOfAnimals.get("x" + i + "y" + j);
                for (int a = 0; a < basicItemList.size(); a++) {
                    if (basicItemList.get(a) instanceof Animal){
                        if (( basicItemList.get(a).getClass().getAnnotation(CharacteristicsOfAnimal.class).amountOfKgForFullSaturation() > 1)) {
                            ((Animal) basicItemList.get(a)).setSaturation(((Animal) basicItemList.get(a)).getSaturation() - 1);
                        }else if (basicItemList.get(a).getClass().getAnnotation(CharacteristicsOfAnimal.class).amountOfKgForFullSaturation() < 1){
                            ((Animal) basicItemList.get(a)).setSaturation(((Animal) basicItemList.get(a)).getSaturation() - 0.005);
                        }
                    }
                }
            }
        }
    }
}