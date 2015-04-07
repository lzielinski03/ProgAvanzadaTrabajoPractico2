package presentacion;

import modelo.ItemMenu;
import modelo.Menu;

import java.util.List;

/**
 * Created by leonardo on 27/03/2015.
 */
public class IOMenu extends IOManager{

    public int getSelectedMenu(int size) {
        return getIntRange(1, size);
    }

    public void mostrar(Menu miMenu){

        List<ItemMenu> items = miMenu.getItems();
        for(int i = miMenu.getItems().size(); i > 0; i--){
            this.println(items.get(i-1).getId() + " " + items.get(i-1).getDescripcion());
        }
        this.println();
    }


}
