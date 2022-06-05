package com.javarush.island.Carnivores;

import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Carnivores;
@Emoji(emoji = "\uD83E\uDD8A")
public class Fox extends Carnivores {
    protected Fox(int x, int y) {
        super(x, y);
    }
}
