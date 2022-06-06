package com.javarush.island.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CharacteristicsOfAnimal {
    long weight();
    long amountOfKgForFullSaturation();
    int walkingDistance();
    int maxQuantityOfAnimal();
}
