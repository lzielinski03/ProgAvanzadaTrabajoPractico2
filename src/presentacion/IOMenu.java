package presentacion;

import modelo.ItemMenu;
import modelo.Menu;

import java.util.List;

/**
 * Created by leonardo on 27/03/2015.
 */
public class IOMenu extends IOManager{

    public int getSelectedMenu(int size) {
        int n = getInt();
        while(n < 1 || n > size) {
            print("La opcion seleccionada no pertenece al rango del menu.");
            n = getInt();
        }
        return n;
    }

    public void mostrar(Menu miMenu){

        List<ItemMenu> items = miMenu.getItems();
        for(int i = miMenu.getItems().size(); i > 0; i--){
            System.out.println(items.get(i-1).getId() + " " + items.get(i-1).getDescripcion());
        }

    }


}
