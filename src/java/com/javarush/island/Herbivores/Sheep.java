package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;

import java.lang.annotation.Annotation;

@Emoji(emoji = "\uD83D\uDC11")
@CharacteristicsOfAnimal(weight = 70, amountOfKgForFullSaturation = 15, walkingDistance = 3, maxQuantityOfAnimal = 140)

public class Sheep extends Animal {
    public Sheep(int x, int y, String emoji) {
        super(x, y, emoji);
    }
}
