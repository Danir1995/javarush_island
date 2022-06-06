package com.javarush.island.Carnivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Carnivores;
@Emoji(emoji = "\uD83D\uDC3B")

public class Bear extends Carnivores {
    protected Bear(int x, int y) {
        super(x, y);
    }
}
