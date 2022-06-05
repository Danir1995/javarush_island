package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;
@Emoji(emoji = "\uD83D\uDC10")
public class Goat extends Herbivores {
    protected Goat(int x, int y) {
        super(x, y);
    }
}
