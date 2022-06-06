package com.javarush.island;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;

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
    //дописать сатурэйшн, и ходы

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

    public void goCreate(Class animal, String[][] island, int x, int y){
        for (int i = 0; i < animalQuantity(animal); i++){
            island[x][y] = createAnimalEmoji(animal);
        }
    }
}
