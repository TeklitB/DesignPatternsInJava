package factorymethodpattern.factories;

import factorymethodpattern.concrete.Elephant;
import factorymethodpattern.interfaces.Animal;

public class ElephantFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Elephant();
    }
}
