package com.javarush.island.Carnivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Carnivores;

import java.lang.annotation.Annotation;

@Emoji(emoji = "\uD83D\uDC3B")
@CharacteristicsOfAnimal(weight = 500, amountOfKgForFullSaturation = 80, walkingDistance = 2, maxQuantityOfAnimal = 5)

public class Bear extends Carnivores {
    public Bear(int x, int y, String  emoji) {
        super(x, y, emoji);
    }

}
