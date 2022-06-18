package com.javarush.island.Carnivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Carnivores;

import java.lang.annotation.Annotation;

@Emoji(emoji = "\uD83E\uDD8A")
@CharacteristicsOfAnimal(weight = 8, amountOfKgForFullSaturation = 2, walkingDistance = 2, maxQuantityOfAnimal = 30)

public class Fox extends Animal {
    public Fox(int x, int y, String emoji) {
        super(x, y, emoji);
    }
}
