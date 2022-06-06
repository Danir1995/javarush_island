package com.javarush.island;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;

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

    public int goCreate(Class animal, String[][] island){
        ThreadLocalRandom randomPosition = ThreadLocalRandom.current();
        int counter = 0;
        for (int i = 0; i < randomPosition.nextInt(1, animalQuantity(animal)); i++){
            int x = randomPosition.nextInt(0, 100);
            int y = randomPosition.nextInt(0, 20);
            island[x][y] = createAnimalEmoji(animal);
            ++counter;
        }
        System.out.print(animal.getSimpleName() + " = ");
        return counter;
    }
}
