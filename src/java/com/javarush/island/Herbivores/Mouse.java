package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;

import java.lang.annotation.Annotation;

@Emoji(emoji = "\uD83D\uDC00")
@CharacteristicsOfAnimal(weight = 0.05, amountOfKgForFullSaturation = 0.01, walkingDistance = 1, maxQuantityOfAnimal = 500)

public class Mouse extends Herbivores {
    @Override
    public int getChildren() {
        return 7;
    }

    public Mouse(int x, int y, String emoji) {
        super(x, y, emoji);
    }
}
