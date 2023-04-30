package factorymethodpattern.factories;

import factorymethodpattern.concrete.Lion;
import factorymethodpattern.interfaces.Animal;

// This class is used to create Lion instance.
public class LionFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Lion();
    }
}
