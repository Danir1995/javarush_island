package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;

import java.lang.annotation.Annotation;

@Emoji(emoji = "\uD83D\uDC1B")
@CharacteristicsOfAnimal(weight = 0.01, amountOfKgForFullSaturation = 0, walkingDistance = 0, maxQuantityOfAnimal = 1000)

public class Caterpillar extends Herbivores {
    @Override
    public int getChildren() {
        return 30;
    }

    public Caterpillar(int x, int y, String emoji) {
        super(x, y, emoji);
    }
}
