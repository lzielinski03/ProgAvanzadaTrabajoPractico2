package persistencia;

import ejercicio1.model.EjercicioUnoMenu;
import ejercicio1.model.EjercicioUnoSubMenu;
import modelo.ItemMenu;
import modelo.Menu;

public class MenuDB {

    private String menuPrincipalPath = "menuPrincipal.properties";

    public void createDefaultMenu() {
        Menu newMenu = new Menu();
        newMenu.addItem(new ItemMenu("3", "Salir"));
        newMenu.addItem(new ItemMenu("2", "Configuracion"));
        newMenu.addItem(new ItemMenu("1", "Ejercicios"));
        //setMenu(newMenu);
    }

    public Menu getMenu(Spells schema) {
        Menu miMenu = new Menu();

        switch (schema) {
            case SUB_MENU:
                for(SubMenu x : SubMenu.values()) {
                    miMenu.addItem(x.getItemMenu());
                }
                break;
            case MENU_PRINCIPAL:
                for(MenuPrincipal x : MenuPrincipal.values()) {
                    miMenu.addItem(x.getItemMenu());
                }
                break;
            case EJERCICIO_UNO:
                for(EjercicioUnoMenu x : EjercicioUnoMenu.values()) {
                    miMenu.addItem(x.getItemMenu());
                }
                break;
            case EJERCICIO_UNO_SUB_MENU:
                for(EjercicioUnoSubMenu x : EjercicioUnoSubMenu.values()) {
                    miMenu.addItem(x.getItemMenu());
                }
                break;
        }
        return miMenu;
    }

}
