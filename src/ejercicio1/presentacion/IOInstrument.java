package ejercicio1.presentacion;

import ejercicio1.Drums;
import ejercicio1.ElectricBassGuitar;
import ejercicio1.ElectricGuitar;
import ejercicio1.PlugType;
import presentacion.IOManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leonardo on 05/04/2015.
 */
public class IOInstrument extends IOManager{

    public PlugType inputPlugType(){
        this.println("Eliga el tipo de enchufe: ");
        List<PlugType> plug = new ArrayList<>();
        int index = 0;
        for(PlugType x : PlugType.values()) {
            plug.add(index, x);
            println("\t" + (index+1) + " - " + x.toString());
            index++;
        }
        return plug.get(getIntRange(1, index)-1);
    }

    public ElectricGuitar newElectricGuitar() {
        String name = getString("Ingrese el nombre de la guitarra electrica: ");
        int numberOfString = getInt("Ingrese el numero de cuerdas: ");
        return new ElectricGuitar(name, numberOfString, inputPlugType());
    }

    public ElectricBassGuitar newElectricBassGuitar() {
        String name = getString("Ingrese el nombre del bajo: ");
        int numberOfString = getInt("Ingrese el numero de cuerdas: ");
        return new ElectricBassGuitar(name, numberOfString, inputPlugType());
    }

    public Drums newDrums() {
        String name = getString("Ingrese el nombre de la bateria: ");
        int numberOfCymbals = getInt("Ingrese el numero de platillos: ");
        int numberOfDrums = getInt("Ingrese el numero de tambores: ");
        return new Drums(name, numberOfCymbals, numberOfDrums);
    }
}