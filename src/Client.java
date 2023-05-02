import factoryethodpattern_p2.factories.AnimalFactory;
import factoryethodpattern_p2.factories.ElephantFactory;
import factoryethodpattern_p2.factories.LionFactory;

/* import factorymethodpattern.factories.AnimalFactory;
import factorymethodpattern.factories.ElephantFactory;
import factorymethodpattern.factories.LionFactory;
import factorymethodpattern.interfaces.Animal; */

public class Client {
    public static void main(String[] args) {
        /*
         * System.out.println("Hello, this is ***Factory Method Pattern***");
         * AnimalFactory factory;
         * Animal animal;
         * 
         * // Create a Lion
         * factory = new LionFactory();
         * animal = factory.createAnimal();
         * animal.displayBehavior();
         * 
         * // Create an Elephant
         * factory = new ElephantFactory();
         * animal = factory.createAnimal();
         * animal.displayBehavior();
         */

        System.out.println("Hello, this is ***Factory Method Pattern*** extended example.");
        AnimalFactory factory;

        factory = new LionFactory();
        factory.createAndDisplayAnimal("yellow");

        factory = new ElephantFactory();
        factory.createAndDisplayAnimal("white");
    }
}