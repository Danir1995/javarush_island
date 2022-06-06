package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;
@Emoji(emoji = "\uD83E\uDD8C")
@CharacteristicsOfAnimal(weight = 300, amountOfKgForFullSaturation = 50, walkingDistance = 4, maxQuantityOfAnimal = 20)

public class Deer extends Herbivores {
    public Deer(int x, int y) {
        super(x, y);
    }
}
