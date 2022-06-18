package com.javarush.island.Carnivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Carnivores;

import java.lang.annotation.Annotation;

@Emoji(emoji = "\uD83D\uDC0D")
@CharacteristicsOfAnimal(weight = 15, amountOfKgForFullSaturation = 3, walkingDistance = 1, maxQuantityOfAnimal = 30)

public class Boa extends Animal {
    public Boa(int x, int y, String emoji) {
        super(x, y, emoji);
    }
}
