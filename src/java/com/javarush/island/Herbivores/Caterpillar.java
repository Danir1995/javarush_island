package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;
@Emoji(emoji = "\uD83D\uDC1B")
public class Caterpillar extends Herbivores {
    protected Caterpillar(int x, int y) {
        super(x, y);
    }
}
