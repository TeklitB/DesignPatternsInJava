package abstractfactorypattern.factories;

import abstractfactorypattern.dog.Dog;
import abstractfactorypattern.dog.PetDog;
import abstractfactorypattern.tiger.PetTiger;
import abstractfactorypattern.tiger.Tiger;

public class PetAnimalFactory extends AnimalFactory {
    public PetAnimalFactory() {
        System.out.println("You opt for a pet animal factory.\n");
    }

    @Override
    public Tiger createTiger(String color) {
        return new PetTiger(color);
    }

    @Override
    public Dog createDog(String color) {
        return new PetDog(color);
    }
}
