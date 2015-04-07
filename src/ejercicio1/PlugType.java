package ejercicio1;

/**
 * Created by leonardo on 06/04/2015.
 */
public enum PlugType {
    NINE_VOLTS("nine volts"),
    TEEN_VOLTS("teen volts"),
    TWELVE_VOLTS("twelve volts");

    private String name;

    PlugType(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
