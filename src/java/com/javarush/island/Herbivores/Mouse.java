package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;
@Emoji(emoji = "\uD83D\uDC00")
@CharacteristicsOfAnimal(weight = 0.05, amountOfKgForFullSaturation = 0.01, walkingDistance = 1, maxQuantityOfAnimal = 500)

public class Mouse extends Herbivores {
    protected Mouse(int x, int y) {
        super(x, y);
    }
}
