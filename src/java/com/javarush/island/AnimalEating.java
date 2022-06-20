package com.javarush.island;

import com.javarush.island.Carnivores.Wolf;
import com.javarush.island.Herbivores.Deer;
import com.javarush.island.Herbivores.Horse;
import com.javarush.island.Herbivores.Rabbit;

public class AnimalEating {

public boolean eaten(Object animal, Object victim, int chance){

   if (animal instanceof Wolf){
       if (victim instanceof Horse){
           if (chance <= 10){
               ((Wolf) animal).setSaturation(8);
               ((Wolf) animal).setAte(true);
               ((Horse) victim).setDied(true);
               return true;
           }
       }
       if (victim instanceof Deer){
           if (chance <= 15){
               ((Wolf) animal).setSaturation(8);
               ((Wolf) animal).setAte(true);
               ((Deer) victim).setDied(true);
               return true;
           }
       }
       if (victim instanceof Rabbit){
           if (chance <= 60){
               ((Wolf) animal).setSaturation(2);
               ((Rabbit) victim).setDied(true);
               return false;
           }
       }
   }
   return false;
}
}
