package persistencia;

import modelo.ItemMenu;

/**
 * Created by leonardo on 03/04/2015.
 */
public enum StringNumber {

    B(new ItemMenu("2", "Prueba de sonido para equipo full")),
    A(new ItemMenu("1", "Prueba de sonido para equipo basico"));

    private ItemMenu numVal;

    StringNumber(ItemMenu numVal) {
        this.numVal = numVal;
    }

    public ItemMenu getNumVal() {
        return numVal;
    }
}
