package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;

import java.lang.annotation.Annotation;

@Emoji(emoji = "\uD83D\uDC0E")
@CharacteristicsOfAnimal(weight = 400, amountOfKgForFullSaturation = 60, walkingDistance = 4, maxQuantityOfAnimal = 20)

public class Horse extends Animal {
    public Horse(int x, int y, String emoji) {
        super(x, y, emoji);
    }
}
