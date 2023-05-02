package abstractfactory_p2.factories;

import abstractfactory_p2.buttons.Button;
import abstractfactory_p2.buttons.MacOSButton;
import abstractfactory_p2.checkboxes.CheckBox;
import abstractfactory_p2.checkboxes.MacOSCheckBox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
