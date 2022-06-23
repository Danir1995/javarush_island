package com.javarush.island;

import com.javarush.island.Carnivores.*;
import com.javarush.island.Herbivores.*;
import com.javarush.island.Plants.Plants;

public class AnimalEating {

    double saturation;
    double fullSaturation;

    public boolean eaten(Object animal, Object victim, int chance) {
        AnimalMaking animalMaking = new AnimalMaking();
        if (animal instanceof Wolf) {
            saturation = ((Wolf) animal).getSaturation();
            fullSaturation = animalMaking.saturation(animal.getClass());

            if (saturation < fullSaturation) {
                if (victim instanceof Horse) {
                    if (chance <= 10) {
                        ((Wolf) animal).setSaturation(fullSaturation);
                        ((Wolf) animal).setEaten(true);
                        ((Horse) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Deer) {
                    if (chance <= 15) {
                        ((Wolf) animal).setSaturation(fullSaturation);
                        ((Wolf) animal).setEaten(true);
                        ((Deer) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Rabbit) {
                    if (chance <= 60) {
                        ((Wolf) animal).setSaturation(((Wolf) animal).getSaturation() + animalMaking.animalKg(Rabbit.class));
                        ((Rabbit) victim).setDied(true);
                    }
                }

                if (victim instanceof Mouse) {
                    if (chance <= 80) {
                        ((Wolf) animal).setSaturation(((Wolf) animal).getSaturation() + animalMaking.animalKg(Mouse.class));
                        ((Mouse) victim).setDied(true);
                    }
                }

                if (victim instanceof Goat) {
                    if (chance <= 60) {
                        ((Wolf) animal).setSaturation(fullSaturation);
                        ((Goat) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Sheep) {
                    if (chance <= 70) {
                        ((Wolf) animal).setSaturation(fullSaturation);
                        ((Sheep) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Boar) {
                    if (chance <= 15) {
                        ((Wolf) animal).setSaturation(fullSaturation);
                        ((Boar) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Buffalo) {
                    if (chance <= 10) {
                        ((Wolf) animal).setSaturation(fullSaturation);
                        ((Buffalo) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Duck) {
                    if (chance <= 40) {
                        ((Wolf) animal).setSaturation(((Wolf) animal).getSaturation() + animalMaking.animalKg(Duck.class));
                        ((Duck) victim).setDied(true);
                    }
                }
            } else return true;
        }

        if (animal instanceof Boa) {
            saturation = ((Boa) animal).getSaturation();
            fullSaturation = animalMaking.saturation(Boa.class);
            if (saturation < fullSaturation) {
                if (victim instanceof Fox) {
                    if (chance <= 15) {
                        ((Boa) animal).setSaturation(fullSaturation);
                        ((Fox) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Rabbit) {
                    if (chance <= 20) {
                        ((Boa) animal).setSaturation(((Boa) animal).getSaturation() + animalMaking.animalKg(Rabbit.class));
                        ((Rabbit) victim).setDied(true);
                    }
                }

                if (victim instanceof Duck) {
                    if (chance <= 10) {
                        ((Boa) animal).setSaturation(((Boa) animal).getSaturation() + animalMaking.animalKg(Duck.class));
                        ((Duck) victim).setDied(true);

                    }
                }

                if (victim instanceof Mouse) {
                    if (chance <= 40) {
                        ((Boa) animal).setSaturation(((Boa) animal).getSaturation() + animalMaking.animalKg(Mouse.class));
                        ((Mouse) victim).setDied(true);
                    }
                }
            } else return true;
        }
        if (animal instanceof Fox) {
            saturation = ((Fox) animal).getSaturation();
            fullSaturation = animalMaking.saturation(Fox.class);
            if (saturation < fullSaturation) {
                if (victim instanceof Rabbit) {
                    if (chance <= 70) {
                        ((Fox) animal).setSaturation(fullSaturation);
                        ((Rabbit) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Mouse) {
                    if (chance <= 90) {
                        ((Fox) animal).setSaturation(((Fox) animal).getSaturation() + animalMaking.animalKg(Mouse.class));
                        ((Mouse) victim).setDied(true);
                    }
                }

                if (victim instanceof Duck) {
                    if (chance <= 60) {
                        ((Fox) animal).setSaturation(((Fox) animal).getSaturation() + animalMaking.animalKg(Duck.class));
                        ((Duck) victim).setDied(true);
                    }
                }

                if (victim instanceof Caterpillar) {
                    if (chance <= 40) {
                        ((Fox) animal).setSaturation(((Fox) animal).getSaturation() + animalMaking.animalKg(Caterpillar.class));
                        ((Caterpillar) victim).setDied(true);

                    }
                }
            } else return true;
        }

        if (animal instanceof Bear) {
            saturation = ((Bear) animal).getSaturation();
            fullSaturation = animalMaking.saturation(Bear.class);
            if (saturation < fullSaturation) {
                if (victim instanceof Boa) {
                    if (chance <= 80) {
                        ((Bear) animal).setSaturation(((Bear) animal).getSaturation() + animalMaking.animalKg(Boa.class));
                        ((Boa) victim).setDied(true);
                    }
                }

                if (victim instanceof Horse) {
                    if (chance <= 40) {
                        ((Bear) animal).setSaturation(fullSaturation);
                        ((Horse) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Deer) {
                    if (chance <= 80) {
                        ((Bear) animal).setSaturation(fullSaturation);
                        ((Deer) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Rabbit) {
                    if (chance <= 80) {
                        ((Bear) animal).setSaturation(((Bear) animal).getSaturation() + animalMaking.animalKg(Rabbit.class));
                        ((Rabbit) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Mouse) {
                    if (chance <= 90) {
                        ((Bear) animal).setSaturation(((Bear) animal).getSaturation() + animalMaking.animalKg(Mouse.class));
                        ((Mouse) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Goat) {
                    if (chance <= 70) {
                        ((Bear) animal).setSaturation(((Bear) animal).getSaturation() + animalMaking.animalKg(Goat.class));
                        ((Goat) victim).setDied(true);
                    }
                }

                if (victim instanceof Sheep) {
                    if (chance <= 70) {
                        ((Bear) animal).setSaturation(((Bear) animal).getSaturation() + animalMaking.animalKg(Sheep.class));
                        ((Sheep) victim).setDied(true);

                    }
                }

                if (victim instanceof Boar) {
                    if (chance <= 50) {
                        ((Bear) animal).setSaturation(fullSaturation);
                        ((Boar) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Buffalo) {
                    if (chance <= 20) {
                        ((Bear) animal).setSaturation(fullSaturation);
                        ((Buffalo) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Duck) {
                    if (chance <= 10) {
                        ((Bear) animal).setSaturation(((Bear) animal).getSaturation() + animalMaking.animalKg(Duck.class));
                        ((Duck) victim).setDied(true);
                    }
                }
            } else return true;
        }

        if (animal instanceof Eagle) {
            saturation = ((Eagle) animal).getSaturation();
            fullSaturation = animalMaking.saturation(Eagle.class);
            if (saturation < fullSaturation) {
                if (victim instanceof Fox) {
                    if (chance <= 10) {
                        ((Eagle) animal).setSaturation(fullSaturation);
                        ((Fox) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Rabbit) {
                    if (chance <= 90) {
                        ((Eagle) animal).setSaturation(fullSaturation);
                        ((Rabbit) victim).setDied(true);
                        return true;
                    }
                }

                if (victim instanceof Mouse) {
                    if (chance <= 90) {
                        ((Eagle) animal).setSaturation(((Eagle) animal).getSaturation() + animalMaking.animalKg(Mouse.class));
                        ((Mouse) victim).setDied(true);
                    }
                }

                if (victim instanceof Duck) {
                    if (chance <= 80) {
                        ((Eagle) animal).setSaturation(fullSaturation);
                        ((Duck) victim).setDied(true);
                        return true;
                    }
                }
            } else return true;
        }

        if (animal instanceof Horse) {
            saturation = ((Horse) animal).getSaturation();
            fullSaturation = animalMaking.saturation(Horse.class);
            if (saturation < fullSaturation) {
                if (victim instanceof Plants) {
                    ((Horse) animal).setSaturation(((Horse) animal).getSaturation() + ((Plants) victim).getWeight());
                    ((Plants) victim).setEaten(true);

                }
            }else return true;
        }

        if (animal instanceof Deer) {
            saturation = ((Deer) animal).getSaturation();
            fullSaturation = animalMaking.saturation(Deer.class);
            if (saturation < fullSaturation) {
                if (victim instanceof Plants) {
                    ((Deer) animal).setSaturation(((Deer) animal).getSaturation() + ((Plants) victim).getWeight());
                    ((Plants) victim).setEaten(true);
                }
            }else return true;
        }

        if (animal instanceof Rabbit) {
            saturation = ((Rabbit) animal).getSaturation();
            fullSaturation = animalMaking.saturation(Rabbit.class);
            if (saturation < fullSaturation) {
                if (victim instanceof Plants) {
                    ((Rabbit) animal).setSaturation(fullSaturation);
                    ((Plants) victim).setEaten(true);
                    return true;
                }
            }else return true;
        }

        if (animal instanceof Mouse) {
            saturation = ((Mouse) animal).getSaturation();
            fullSaturation = animalMaking.saturation(Mouse.class);
            if (saturation < fullSaturation) {
                if (victim instanceof Plants) {
                    ((Mouse) animal).setSaturation(fullSaturation);
                    ((Plants) victim).setEaten(true);
                    return true;
                }
            }else return true;
        }

        if (animal instanceof Sheep) {
            saturation = ((Sheep) animal).getSaturation();
            fullSaturation = animalMaking.saturation(Sheep.class);
            if (saturation < fullSaturation) {
                if (victim instanceof Plants) {
                    ((Sheep) animal).setSaturation(((Sheep) animal).getSaturation() + ((Plants) victim).getWeight());
                    ((Plants) victim).setEaten(true);
                   // return true;
                }
            } else return true;
        }

        if (animal instanceof Boar) {
            saturation = ((Boar) animal).getSaturation();
            fullSaturation = animalMaking.saturation(Boar.class);
            if (saturation < fullSaturation) {
                if (victim instanceof Plants) {
                    ((Boar) animal).setSaturation(((Boar) animal).getSaturation() + ((Plants) victim).getWeight());
                    ((Plants) victim).setEaten(true);
                }
                if (victim instanceof Mouse){
                    if (chance <= 50){
                        ((Boar) animal).setSaturation(((Boar) animal).getSaturation() + animalMaking.animalKg(Mouse.class));
                        ((Mouse) victim).setDied(true);
                    }
                }
                if (victim instanceof Caterpillar){
                    if (chance <= 90){
                        ((Boar) animal).setSaturation(((Boar) animal).getSaturation() + animalMaking.animalKg(Caterpillar.class));
                        ((Caterpillar) victim).setDied(true);
                    }
                }
            }else return true;
        }

        if (animal instanceof Buffalo) {
            saturation = ((Buffalo) animal).getSaturation();
            fullSaturation = animalMaking.saturation(Buffalo.class);
            if (saturation < fullSaturation) {
                if (victim instanceof Plants) {
                    ((Buffalo) animal).setSaturation(((Buffalo) animal).getSaturation() + ((Plants) victim).getWeight());
                    ((Plants) victim).setEaten(true);
                }
            }else return true;
        }

        if (animal instanceof Duck) {
            saturation = ((Duck) animal).getSaturation();
            fullSaturation = animalMaking.saturation(Duck.class);
            if (saturation < fullSaturation) {
                if (victim instanceof Plants) {
                    ((Duck) animal).setSaturation(fullSaturation);
                    ((Plants) victim).setEaten(true);
                    return true;
                }
                if (victim instanceof Caterpillar){
                    ((Duck) animal).setSaturation(saturation + animalMaking.animalKg(Caterpillar.class));
                    ((Caterpillar) victim).setEaten(true);
                }
            }else return true;
        }

        if (animal instanceof Caterpillar) {
            saturation = ((Caterpillar) animal).getSaturation();
            fullSaturation = animalMaking.saturation(Caterpillar.class);
            if (saturation < fullSaturation) {
                if (victim instanceof Plants) {
                    ((Caterpillar) animal).setSaturation(fullSaturation);
                    ((Plants) victim).setEaten(true);
                    return true;
                }
            }else return true;
        }
        return false;
    }
}
