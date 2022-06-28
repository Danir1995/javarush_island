package com.javarush.island;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.Carnivores.*;
import com.javarush.island.Herbivores.*;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.BasicItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class AnimalMaking {
    public String createAnimalEmoji(Class<?> animal){
        Emoji emoji = (Emoji) animal.getAnnotation(Emoji.class);
        return emoji.emoji();
    }

    public int animalQuantity(Class animal){
        CharacteristicsOfAnimal quantity = (CharacteristicsOfAnimal) animal.getAnnotation(CharacteristicsOfAnimal.class);
        return quantity.maxQuantityOfAnimal();
    }

    public double animalKg(Class animal){
        CharacteristicsOfAnimal weightOfAnimal = (CharacteristicsOfAnimal) animal.getAnnotation(CharacteristicsOfAnimal.class);
        return weightOfAnimal.weight();
    }

    public double saturation(Class animal){
        CharacteristicsOfAnimal saturation = (CharacteristicsOfAnimal) animal.getAnnotation(CharacteristicsOfAnimal.class);
        return saturation.amountOfKgForFullSaturation();
    }

    public int move(Class animal){
        CharacteristicsOfAnimal steps = (CharacteristicsOfAnimal) animal.getAnnotation(CharacteristicsOfAnimal.class);
        return steps.walkingDistance();
    }

    public List<BasicItem> goCreate(Class animal, int x, int y) throws NoSuchFieldException {
        ThreadLocalRandom randomPosition = ThreadLocalRandom.current();
        if (!animal.isAnnotationPresent(CharacteristicsOfAnimal.class)){
            throw new RuntimeException("It is not animal");
        }
        int quantityOfAnimals = randomPosition.nextInt(1, animalQuantity(animal));
        List<BasicItem> listOfAnimals = new ArrayList<>();
        for (int i = 0; i < quantityOfAnimals; i++){
            switch (animal.getSimpleName().toLowerCase()) {
                case "bear" -> listOfAnimals.add(new Bear(x, y, Bear.class.getAnnotation(Emoji.class).emoji()));
                case "boa" -> listOfAnimals.add(new Boa(x, y, Boa.class.getAnnotation(Emoji.class).emoji()));
                case "eagle" -> listOfAnimals.add(new Eagle(x, y, Eagle.class.getAnnotation(Emoji.class).emoji()));
                case "fox" -> listOfAnimals.add(new Fox(x, y, Fox.class.getAnnotation(Emoji.class).emoji()));
                case "wolf" -> listOfAnimals.add(new Wolf(x, y, Wolf.class.getAnnotation(Emoji.class).emoji()));
                case "boar" -> listOfAnimals.add(new Boar(x, y, Boar.class.getAnnotation(Emoji.class).emoji()));
                case "buffalo" -> listOfAnimals.add(new Buffalo(x, y, Buffalo.class.getAnnotation(Emoji.class).emoji()));
                case "caterpillar" -> listOfAnimals.add(new Caterpillar(x, y, Caterpillar.class.getAnnotation(Emoji.class).emoji()));
                case "deer" -> listOfAnimals.add(new Deer(x, y, Deer.class.getAnnotation(Emoji.class).emoji()));
                case "duck" -> listOfAnimals.add(new Duck(x, y, Duck.class.getAnnotation(Emoji.class).emoji()));
                case "goat" -> listOfAnimals.add(new Goat(x, y, Goat.class.getAnnotation(Emoji.class).emoji()));
                case "horse" -> listOfAnimals.add(new Horse(x, y, Horse.class.getAnnotation(Emoji.class).emoji()));
                case "mouse" -> listOfAnimals.add(new Mouse(x, y, Mouse.class.getAnnotation(Emoji.class).emoji()));
                case "rabbit" -> listOfAnimals.add(new Rabbit(x, y, Rabbit.class.getAnnotation(Emoji.class).emoji()));
                case "sheep" -> listOfAnimals.add(new Sheep(x, y, Sheep.class.getAnnotation(Emoji.class).emoji()));

            }
        }
        return listOfAnimals;
    }
}