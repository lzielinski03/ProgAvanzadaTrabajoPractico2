package modelo;

/**
 * Created by leonardo on 27/03/2015.
 */
public class ItemMenu {

    private String id;
    private String descripcion;

    public ItemMenu(){
    }

    public ItemMenu(String id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
