package com.javarush.island;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.Carnivores.*;
import com.javarush.island.Herbivores.*;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.BasicPosition;

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

    public double move(Class animal){
        if (!animal.isAnnotationPresent(CharacteristicsOfAnimal.class)){
            throw new RuntimeException("It is not animal");
        }
        CharacteristicsOfAnimal steps = (CharacteristicsOfAnimal) animal.getAnnotation(CharacteristicsOfAnimal.class);
        return steps.walkingDistance();
    }

    public int goCreate(Class animal, BasicPosition[][] island){
        ThreadLocalRandom randomPosition = ThreadLocalRandom.current();

        int counter = 0;
        for (int i = 0; i < randomPosition.nextInt(1, animalQuantity(animal)); i++){
            int x = randomPosition.nextInt(0, island.length);
            int y = randomPosition.nextInt(0, island[0].length);
//            Animal newAnimal = switch (animal.getSimpleName()) {
//                case "Bear" -> new Bear(x, y);
//                case "Boa" -> new Boa(x, y);
//                case "Eagle" -> new Eagle(x, y);
//                case "Fox" -> new Fox(x, y);
//                case "Wolf" -> new Wolf(x, y);
//                case "Boar" -> new Boar(x, y);
//                case "Buffalo" -> new Buffalo(x, y);
//                case "Caterpillar" -> new Caterpillar(x, y);
//                case "Deer" -> new Deer(x, y);
//                case "Duck" -> new Duck(x, y);
//                case "Goat" -> new Goat(x, y);
//                case "Horse" -> new Horse(x, y);
//                case "Mouse" -> new Mouse(x, y);
//                case "Rabbit" -> new Rabbit(x, y);
//                case "Sheep" -> new Sheep(x, y);
//                default -> throw new RuntimeException("It is not an animal!");
//            };

            island[x][y] = new Animal(x, y);
            ++counter;
        }
        System.out.print(animal.getSimpleName() + " = ");
        return counter;
    }
}
