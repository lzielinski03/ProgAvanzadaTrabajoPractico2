package modelo;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<ItemMenu> itemsMenu = new ArrayList<ItemMenu>();
    private int size;

    public void addItem(ItemMenu item) {
        if(itemsMenu.isEmpty()){
            itemsMenu = new ArrayList<ItemMenu>();
        }
        this.itemsMenu.add(item);
        size = this.itemsMenu.size();
    }

    public List<ItemMenu> getItems() {
        return this.itemsMenu;
    }

    public int getSize() { return this.size; }

}
