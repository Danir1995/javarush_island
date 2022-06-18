package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;

import java.lang.annotation.Annotation;

@Emoji(emoji = "\uD83D\uDC07")
@CharacteristicsOfAnimal(weight = 2, amountOfKgForFullSaturation = 0.45, walkingDistance = 2, maxQuantityOfAnimal = 150)

public class Rabbit extends Animal {
    public Rabbit(int x, int y, String emoji) {
        super(x, y, emoji);
    }
}
