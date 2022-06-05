package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;
@Emoji(emoji = "\uD83E\uDDAC")
public class Buffalo extends Herbivores {
    protected Buffalo(int x, int y) {
        super(x, y);
    }
}
