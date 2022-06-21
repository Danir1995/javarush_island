package com.javarush.island;

import com.javarush.island.Annotations.CharacteristicsOfAnimal;
import com.javarush.island.Carnivores.*;
import com.javarush.island.Herbivores.*;
import com.javarush.island.abstractClasses.BasicItem;

import java.text.Format;
import java.util.List;

public class AnimalEating {
    AnimalMaking animalMaking = new AnimalMaking();
    double saturation;
    double fullSaturation;

    public boolean eaten(Object predator, Object victim, int chance) {
        boolean eaten = false;
        if (predator instanceof Wolf) {
            saturation = ((Wolf) predator).getSaturation();
            fullSaturation = animalMaking.saturation(predator.getClass());

            if (saturation <= fullSaturation) {
                if (victim instanceof Horse) {
                    if (chance <= 10) {
                        ((Wolf) predator).setSaturation(fullSaturation);
                        ((Wolf) predator).setAte(true);
                        ((Horse) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Deer) {
                    if (chance <= 15) {
                        ((Wolf) predator).setSaturation(fullSaturation);
                        ((Wolf) predator).setAte(true);
                        ((Deer) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Rabbit) {
                    if (chance <= 60) {
                        ((Wolf) predator).setSaturation(((Wolf) predator).getSaturation() + animalMaking.animalKg(Rabbit.class));
                        ((Rabbit) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }

                if (victim instanceof Mouse) {
                    if (chance <= 80) {
                        ((Wolf) predator).setSaturation(((Wolf) predator).getSaturation() + animalMaking.animalKg(Mouse.class));
                        ((Mouse) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }

                if (victim instanceof Goat) {
                    if (chance <= 60) {
                        ((Wolf) predator).setSaturation(fullSaturation);
                        ((Goat) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Sheep) {
                    if (chance <= 70) {
                        ((Wolf) predator).setSaturation(fullSaturation);
                        ((Sheep) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Boar) {
                    if (chance <= 15) {
                        ((Wolf) predator).setSaturation(fullSaturation);
                        ((Boar) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Buffalo) {
                    if (chance <= 10) {
                        ((Wolf) predator).setSaturation(fullSaturation);
                        ((Buffalo) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Duck) {
                    if (chance <= 40) {
                        ((Wolf) predator).setSaturation(((Wolf) predator).getSaturation() + animalMaking.animalKg(Duck.class));
                        ((Duck) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }
            } else return true;
        }

        if (predator instanceof Boa) {
            saturation = ((Boa) predator).getSaturation();
            fullSaturation = animalMaking.saturation(Boa.class);
            if (saturation <= fullSaturation) {
                if (victim instanceof Fox) {
                    if (chance <= 15) {
                        ((Boa) predator).setSaturation(fullSaturation);
                        ((Fox) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Rabbit) {
                    if (chance <= 20) {
                        ((Boa) predator).setSaturation(((Boa) predator).getSaturation() + animalMaking.animalKg(Rabbit.class));
                        ((Rabbit) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }

                if (victim instanceof Duck) {
                    if (chance <= 10) {
                        ((Boa) predator).setSaturation(((Boa) predator).getSaturation() + animalMaking.animalKg(Duck.class));
                        ((Duck) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }

                if (victim instanceof Mouse) {
                    if (chance <= 40) {
                        ((Boa) predator).setSaturation(((Boa) predator).getSaturation() + animalMaking.animalKg(Mouse.class));
                        ((Mouse) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }
            } else return true;
        }
        if (predator instanceof Fox) {
            saturation = ((Fox) predator).getSaturation();
            fullSaturation = animalMaking.saturation(Fox.class);
            if (saturation <= fullSaturation) {
                if (victim instanceof Rabbit) {
                    if (chance <= 70) {
                        ((Fox) predator).setSaturation(fullSaturation);
                        ((Rabbit) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Mouse) {
                    if (chance <= 90) {
                        ((Fox) predator).setSaturation(((Fox) predator).getSaturation() + animalMaking.animalKg(Mouse.class));
                        ((Mouse) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }

                if (victim instanceof Duck) {
                    if (chance <= 60) {
                        ((Fox) predator).setSaturation(((Fox) predator).getSaturation() + animalMaking.animalKg(Duck.class));
                        ((Duck) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }

                if (victim instanceof Caterpillar) {
                    if (chance <= 40) {
                        ((Fox) predator).setSaturation(((Fox) predator).getSaturation() + animalMaking.animalKg(Caterpillar.class));
                        ((Caterpillar) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }
            } else return true;
        }

        if (predator instanceof Bear) {
            saturation = ((Bear) predator).getSaturation();
            fullSaturation = animalMaking.saturation(Bear.class);
            if (saturation <= fullSaturation) {
                if (victim instanceof Boa) {
                    if (chance <= 80) {
                        ((Bear) predator).setSaturation(((Bear) predator).getSaturation() + animalMaking.animalKg(Boa.class));
                        ((Boa) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }

                if (victim instanceof Horse) {
                    if (chance <= 40) {
                        ((Bear) predator).setSaturation(fullSaturation);
                        ((Horse) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Deer) {
                    if (chance <= 80) {
                        ((Bear) predator).setSaturation(fullSaturation);
                        ((Deer) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Rabbit) {
                    if (chance <= 80) {
                        ((Bear) predator).setSaturation(((Bear) predator).getSaturation() + animalMaking.animalKg(Rabbit.class));
                        ((Rabbit) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Mouse) {
                    if (chance <= 90) {
                        ((Bear) predator).setSaturation(((Bear) predator).getSaturation() + animalMaking.animalKg(Mouse.class));
                        ((Mouse) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Goat) {
                    if (chance <= 70) {
                        ((Bear) predator).setSaturation(((Bear) predator).getSaturation() + animalMaking.animalKg(Goat.class));
                        ((Goat) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }

                if (victim instanceof Sheep) {
                    if (chance <= 70) {
                        ((Bear) predator).setSaturation(((Bear) predator).getSaturation() + animalMaking.animalKg(Sheep.class));
                        ((Sheep) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }

                if (victim instanceof Boar) {
                    if (chance <= 50) {
                        ((Bear) predator).setSaturation(fullSaturation);
                        ((Boar) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Buffalo) {
                    if (chance <= 20) {
                        ((Bear) predator).setSaturation(fullSaturation);
                        ((Buffalo) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Duck) {
                    if (chance <= 10) {
                        ((Bear) predator).setSaturation(((Bear) predator).getSaturation() + animalMaking.animalKg(Duck.class));
                        ((Duck) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }
            } else return true;
        }

        if (predator instanceof Eagle) {
            saturation = ((Eagle) predator).getSaturation();
            fullSaturation = animalMaking.saturation(Eagle.class);
            if (saturation <= fullSaturation) {
                if (victim instanceof Fox) {
                    if (chance <= 10) {
                        ((Eagle) predator).setSaturation(fullSaturation);
                        ((Fox) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Rabbit) {
                    if (chance <= 90) {
                        ((Eagle) predator).setSaturation(fullSaturation);
                        ((Rabbit) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Mouse) {
                    if (chance <= 90) {
                        ((Eagle) predator).setSaturation(((Eagle) predator).getSaturation() + animalMaking.animalKg(Mouse.class));
                        ((Mouse) victim).setDied(true);
                        eaten(predator, victim, chance);
                    }
                }

                if (victim instanceof Duck) {
                    if (chance <= 80) {
                        ((Eagle) predator).setSaturation(fullSaturation);
                        ((Duck) victim).setDied(true);
                        return true;
                    }
                }
            } else return true;
        }return false;
    }
}
