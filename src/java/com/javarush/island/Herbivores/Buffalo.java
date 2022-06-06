package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;
@Emoji(emoji = "\uD83E\uDDAC")
@CharacteristicsOfAnimal(weight = 700, amountOfKgForFullSaturation = 100, walkingDistance = 3, maxQuantityOfAnimal = 10)

public class Buffalo extends Herbivores {
    protected Buffalo(int x, int y) {
        super(x, y);
    }
}
