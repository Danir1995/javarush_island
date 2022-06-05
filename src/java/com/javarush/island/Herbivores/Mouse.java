package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;
@Emoji(emoji = "\uD83D\uDC00")
public class Mouse extends Herbivores {
    protected Mouse(int x, int y) {
        super(x, y);
    }
}
