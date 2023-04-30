import factorymethodpattern.factories.AnimalFactory;
import factorymethodpattern.factories.ElephantFactory;
import factorymethodpattern.factories.LionFactory;
import factorymethodpattern.interfaces.Animal;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello, this is ***Factory Method Pattern***");
        AnimalFactory factory;
        Animal animal;

        // Create a Lion
        factory = new LionFactory();
        animal = factory.createAnimal();
        animal.displayBehavior();

        // Create an Elephant
        factory = new ElephantFactory();
        animal = factory.createAnimal();
        animal.displayBehavior();
    }
}