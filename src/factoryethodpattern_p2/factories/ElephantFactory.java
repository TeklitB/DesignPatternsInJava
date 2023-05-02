package factoryethodpattern_p2.factories;

import factoryethodpattern_p2.concrete.Elephant;
import factoryethodpattern_p2.interfaces.Animal;

public class ElephantFactory extends AnimalFactory {
    @Override
    public Animal createAnimal(String color) {
        return new Elephant(color);
    }
}
