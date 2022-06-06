package com.javarush.island.Carnivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Carnivores;
@Emoji(emoji = "\uD83E\uDD85")
@CharacteristicsOfAnimal(weight = 6, amountOfKgForFullSaturation = 1, walkingDistance = 3, maxQuantityOfAnimal = 20)

public class Eagle extends Carnivores {
    protected Eagle(int x, int y) {
        super(x, y);
    }
}
