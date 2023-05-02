package abstractfactorypattern.factories;

import abstractfactorypattern.dog.Dog;
import abstractfactorypattern.dog.WildDog;
import abstractfactorypattern.tiger.Tiger;
import abstractfactorypattern.tiger.WildTiger;

public class WildAnimalFactory extends AnimalFactory {

    public WildAnimalFactory() {
        System.out.println("You opt for a wild animal factory.\n");
    }

    @Override
    public Tiger createTiger(String color) {
        return new WildTiger(color);
    }

    @Override
    public Dog createDog(String color) {
        return new WildDog(color);
    }
}
