package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;

import java.lang.annotation.Annotation;

@Emoji(emoji = "\uD83E\uDD8C")
@CharacteristicsOfAnimal(weight = 300, amountOfKgForFullSaturation = 50, walkingDistance = 4, maxQuantityOfAnimal = 20)

public class Deer extends Animal {
    public Deer(int x, int y, String emoji) {
        super(x, y, emoji);
    }
}
