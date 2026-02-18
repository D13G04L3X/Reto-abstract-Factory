package src.factories;

import src.interfaces.UIFactory;
import src.interfaces.Button;
import src.interfaces.Checkbox;
import src.products.WinButton;
import src.products.WinCheckbox;

public class WinFactory implements UIFactory {

    @Override
    public Button createButton() {
        // Reto: El usuario debe instanciar el botón de Windows aquí
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        // Reto: El usuario debe instanciar el checkbox de Windows aquí
        return new WinCheckbox();
    }
}
