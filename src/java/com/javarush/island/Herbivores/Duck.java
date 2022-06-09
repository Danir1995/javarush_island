package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;

import java.lang.annotation.Annotation;

@Emoji(emoji = "\uD83E\uDD86")
@CharacteristicsOfAnimal(weight = 1, amountOfKgForFullSaturation = 0.15, walkingDistance = 4, maxQuantityOfAnimal = 200)

public class Duck extends Herbivores {
    public Duck(int x, int y, String emoji) {
        super(x, y, emoji);
    }
}
