package ejercicio1.model;

import modelo.ItemMenu;

/**
 * Created by leonardo on 03/04/2015.
 */
public enum EjercicioUnoMenu {


    D(new ItemMenu("4", "Salir.")),
    C(new ItemMenu("3", "Armar equipo para banda.")),
    B(new ItemMenu("2", "Prueba de sonido para equipo full.")),
    A(new ItemMenu("1", "Prueba de sonido para equipo basico."));

    private ItemMenu item;

    EjercicioUnoMenu(ItemMenu item) {
        this.item = item;
    }

    public ItemMenu getItemMenu() {return this.item; }
}
