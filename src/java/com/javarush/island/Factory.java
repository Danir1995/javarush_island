package com.javarush.island;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.Carnivores.*;
import com.javarush.island.Herbivores.*;
import com.javarush.island.abstractClasses.Animal;

public class Factory {
    public Animal create(Object typeOfAnimal, int x, int y){
        if (typeOfAnimal instanceof Animal) {
            String emoji = typeOfAnimal.getClass().getAnnotation(Emoji.class).emoji();
            return switch (typeOfAnimal.getClass().getSimpleName().toLowerCase()) {
                case "bear" -> new Bear(x, y, emoji);
                case "boa" -> new Boa(x, y, emoji);
                case "eagle" -> new Eagle(x, y, emoji);
                case "fox" -> new Fox(x, y, emoji);
                case "wolf" -> new Wolf(x, y, emoji);
                case "boar" -> new Boar(x, y, emoji);
                case "buffalo" -> new Buffalo(x, y, emoji);
                case "caterpillar" -> new Caterpillar(x, y, emoji);
                case "deer" -> new Deer(x, y, emoji);
                case "duck" -> new Duck(x, y, emoji);
                case "goat" -> new Goat(x, y, emoji);
                case "horse" -> new Horse(x, y, emoji);
                case "mouse" -> new Mouse(x, y, emoji);
                case "rabbit" -> new Rabbit(x, y, emoji);
                case "sheep" -> new Sheep(x, y, emoji);
                default -> throw new RuntimeException("this is not animal");
            };
        }return null;
    }
}
