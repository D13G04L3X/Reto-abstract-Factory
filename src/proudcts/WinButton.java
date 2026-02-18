package src.products;
import src.interfaces.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        // TODO: Implementar renderizado estilo Windows (ej. borde cuadrado)
        System.out.println("Renderizando un botón estilo Windows.");
    }
}
