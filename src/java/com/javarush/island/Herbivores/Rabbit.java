package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;
@Emoji(emoji = "\uD83D\uDC07")
@CharacteristicsOfAnimal(weight = 2, amountOfKgForFullSaturation = 0.45, walkingDistance = 2, maxQuantityOfAnimal = 150)

public class Rabbit extends Herbivores {
    public Rabbit(int x, int y) {
        super(x, y);
    }
}
