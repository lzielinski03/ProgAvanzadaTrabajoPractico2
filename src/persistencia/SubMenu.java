package persistencia;

import modelo.ItemMenu;

/**
 * Created by leonardo on 03/04/2015.
 */
public enum SubMenu {

    B(new ItemMenu("1", "Prueba de sonido.")),
    A(new ItemMenu("2", "Salir."));

    private ItemMenu item;

    SubMenu(ItemMenu item) {
        this.item = item;
    }

    public ItemMenu getItemMenu() {return this.item; }


}
