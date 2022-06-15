package com.javarush.island;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.Carnivores.*;
import com.javarush.island.Herbivores.*;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.BasicItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class AnimalMaking {
    public String createAnimalEmoji(Class animal){

        if (!animal.isAnnotationPresent(Emoji.class)){
            throw new RuntimeException("It is not animal");
        }
        Emoji emoji = (Emoji) animal.getAnnotation(Emoji.class);
        return emoji.emoji();
    }

    public int animalQuantity(Class animal){
        if (!animal.isAnnotationPresent(CharacteristicsOfAnimal.class)){
            throw new RuntimeException("It is not animal");
        }
        CharacteristicsOfAnimal quantity = (CharacteristicsOfAnimal) animal.getAnnotation(CharacteristicsOfAnimal.class);
        return quantity.maxQuantityOfAnimal();
    }

    public double animalKg(Class animal){
        if (!animal.isAnnotationPresent(CharacteristicsOfAnimal.class)){
            throw new RuntimeException("It is not animal");
        }
        CharacteristicsOfAnimal weightOfAnimal = (CharacteristicsOfAnimal) animal.getAnnotation(CharacteristicsOfAnimal.class);
        return weightOfAnimal.weight();
    }

    public double saturation(Class animal){
        if (!animal.isAnnotationPresent(CharacteristicsOfAnimal.class)){
            throw new RuntimeException("It is not animal");
        }
        CharacteristicsOfAnimal saturation = (CharacteristicsOfAnimal) animal.getAnnotation(CharacteristicsOfAnimal.class);
        return saturation.amountOfKgForFullSaturation();
    }

    public int move(Class animal){
        if (!animal.isAnnotationPresent(CharacteristicsOfAnimal.class)){
            throw new RuntimeException("It is not animal");
        }
        CharacteristicsOfAnimal steps = (CharacteristicsOfAnimal) animal.getAnnotation(CharacteristicsOfAnimal.class);
        return steps.walkingDistance();
    }

    public int goCreate(Class animal, BasicItem[][] island) throws NoSuchFieldException {
        ThreadLocalRandom randomPosition = ThreadLocalRandom.current();
        int counterOfAnimals = 0;

        for (int i = 0; i < randomPosition.nextInt(1, animalQuantity(animal)); i++){
            int x = randomPosition.nextInt(0, island.length);
            int y = randomPosition.nextInt(0, island[0].length);
            if (animal.getSimpleName().equalsIgnoreCase("bear"))
                island[x][y] = new Bear(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("boa"))
                island[x][y] = new Boa(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("eagle"))
                island[x][y] = new Eagle(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("fox"))
                island[x][y] = new Fox(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("wolf"))
                island[x][y] = new Wolf(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("boar"))
                island[x][y] = new Boar(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("buffalo"))
                island[x][y] = new Buffalo(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("caterpillar"))
                island[x][y] = new Caterpillar(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("deer"))
                island[x][y] = new Deer(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("duck"))
                island[x][y] = new Duck(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("goat"))
                island[x][y] = new Goat(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("horse"))
                island[x][y] = new Horse(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("mouse"))
                island[x][y] = new Mouse(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("rabbit"))
                island[x][y] = new Rabbit(x, y, createAnimalEmoji(animal));
            if (animal.getSimpleName().equalsIgnoreCase("sheep"))
                island[x][y] = new Sheep(x, y, createAnimalEmoji(animal));
            ++counterOfAnimals;
        }

        System.out.print(animal.getSimpleName() + " = ");
        return counterOfAnimals;
    }
}