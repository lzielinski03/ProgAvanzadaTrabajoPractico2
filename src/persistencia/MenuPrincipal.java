package persistencia;

import modelo.ItemMenu;

/**
 * Created by leonardo on 04/04/2015.
 */
public enum MenuPrincipal {

    C(new ItemMenu("3", "Salir.")),
    B(new ItemMenu("2", "Configuracion")),
    A(new ItemMenu("1", "Ejercicios"));

    private ItemMenu item;

    MenuPrincipal(ItemMenu item) {
        this.item = item;
    }

    public ItemMenu getItemMenu() {
        return this.item;
    }

}
