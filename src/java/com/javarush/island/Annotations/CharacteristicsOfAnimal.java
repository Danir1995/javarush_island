package com.javarush.island.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CharacteristicsOfAnimal {
    double weight() default 0;
    double amountOfKgForFullSaturation() default 0;
    int walkingDistance() default 0;
    int maxQuantityOfAnimal() default 0;
}
