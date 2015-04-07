package ejercicio1.model;

import modelo.ItemMenu;

/**
 * Created by leonardo on 05/04/2015.
 */
public enum EjercicioUnoSubMenu {
    E(new ItemMenu("5", "Volver al menu principal")),
    D(new ItemMenu("4", "Prueba de sonido para el nuevo equipo")),
    C(new ItemMenu("3", "Agregar bateria")),
    B(new ItemMenu("2", "Agregar bajo")),
    A(new ItemMenu("1", "Agregar guitarra electrica"));

    private ItemMenu item;

    EjercicioUnoSubMenu(ItemMenu item) {
        this.item = item;
    }

    public ItemMenu getItemMenu() {
        return this.item;
    }
}
