package abstractfactory_p2.factories;

import abstractfactory_p2.buttons.Button;
import abstractfactory_p2.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
