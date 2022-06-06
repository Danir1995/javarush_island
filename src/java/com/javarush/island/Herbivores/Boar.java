package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;
@Emoji(emoji = "\uD83D\uDC17")
@CharacteristicsOfAnimal(weight = 400, amountOfKgForFullSaturation = 50, walkingDistance = 2, maxQuantityOfAnimal = 50)

public class Boar extends Herbivores {
    public Boar(int x, int y) {
        super(x, y);
    }
}
