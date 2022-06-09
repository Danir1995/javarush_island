package com.javarush.island.Carnivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Carnivores;

import java.lang.annotation.Annotation;

@Emoji(emoji = "\uD83D\uDC3A")
@CharacteristicsOfAnimal(weight = 50, amountOfKgForFullSaturation = 8, walkingDistance = 3, maxQuantityOfAnimal = 30)

public class Wolf extends Carnivores {


    public Wolf(int x, int y, String emoji) {
        super(x, y, emoji);
    }
}
