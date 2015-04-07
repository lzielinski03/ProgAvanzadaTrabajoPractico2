package ejercicio1;

import ejercicio1.StringedInstrument;
import presentacion.IOManager;

/**
 * Created by leonardo on 02/04/2015.
 */
public class ElectricBassGuitar extends StringedInstrument implements Pluggable{

    private PlugType plugType;

    public ElectricBassGuitar() {
        this.numberOfString = 5;
        this.name = "Spector";
        this.plugType = PlugType.TEEN_VOLTS;
    }

    public ElectricBassGuitar(String name, int numberOfString) {
        this.name = name;
        this.numberOfString = numberOfString;
        this.plugType = PlugType.TEEN_VOLTS;
    }

    public ElectricBassGuitar(String name, int numberOfString, PlugType plugType) {
        this.name = name;
        this.numberOfString = numberOfString;
        this.plugType = plugType;
    }

    @Override public void play(){
        System.out.println(this.name + " bass guitar of " + this.numberOfString + " string.");
    }

    public void plug(){
        IOManager io = new IOManager();
        io.println(this.plugType.toString());
    }

    @Override public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof ElectricBassGuitar))
            return false;
        if(obj == this)
            return true;

        return (this.numberOfString == ((ElectricBassGuitar)obj).numberOfString
                && this.name.equals(((ElectricBassGuitar) obj).name));
    }

    @Override public int hashCode() {
        int result = 17;
        result = 37 * result + this.numberOfString;
        result = 37 * result + name.hashCode();
        result = 37 * result + getClass().hashCode();

        return result;
    }

    public PlugType getPlugType() {
        return plugType;
    }

    public void setPlugType(PlugType plugType) {
        this.plugType = plugType;
    }
}
