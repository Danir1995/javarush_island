package com.javarush.island.Herbivores;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Annotations.Emoji;
import com.javarush.island.abstractClasses.Animal;
import com.javarush.island.abstractClasses.Herbivores;

import java.lang.annotation.Annotation;

@Emoji(emoji = "\uD83D\uDC03")
@CharacteristicsOfAnimal(weight = 700, amountOfKgForFullSaturation = 100, walkingDistance = 3, maxQuantityOfAnimal = 10)

public class Buffalo extends Herbivores {

  public Buffalo(int x, int y, String  emoji) {
    super(x, y, emoji);
  }
}
