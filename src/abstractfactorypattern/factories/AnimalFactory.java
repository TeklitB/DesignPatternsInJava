package abstractfactorypattern.factories;

import abstractfactorypattern.dog.Dog;
import abstractfactorypattern.tiger.Tiger;

public abstract class AnimalFactory {
    public abstract Tiger createTiger(String color);
    public abstract Dog createDog(String color);
}
