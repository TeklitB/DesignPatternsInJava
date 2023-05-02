package abstractfactory_p2.app;

import abstractfactory_p2.buttons.Button;
import abstractfactory_p2.checkboxes.CheckBox;
import abstractfactory_p2.factories.GUIFactory;

public class ClientApplication {
    private Button button;
    private CheckBox checkbox;

    public ClientApplication(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
