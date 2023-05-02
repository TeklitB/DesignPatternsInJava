package abstractfactory_p2;

import abstractfactory_p2.app.ClientApplication;
import abstractfactory_p2.factories.GUIFactory;
import abstractfactory_p2.factories.MacOSFactory;
import abstractfactory_p2.factories.WindowsFactory;

public class ClientDemo {
    private static ClientApplication configureApplication() {
        ClientApplication app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } 
        else {
            factory = new WindowsFactory();
        }
        app = new ClientApplication(factory);
        return app;
    }

    public static void main(String[] args) {
        ClientApplication app = configureApplication();
        app.paint();
    }
}
