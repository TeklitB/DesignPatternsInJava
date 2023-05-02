package factoryethodpattern_p2.factories;

import factoryethodpattern_p2.concrete.Lion;
import factoryethodpattern_p2.interfaces.Animal;

public class LionFactory extends AnimalFactory{
    @Override
    public Animal createAnimal(String color) {
        return new Lion(color);
    }
}
