package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;
@Emoji(emoji = "\uD83E\uDD86")
public class Duck extends Herbivores {
    protected Duck(int x, int y) {
        super(x, y);
    }
}
