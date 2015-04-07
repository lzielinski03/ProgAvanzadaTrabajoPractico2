package ejercicio1;

import ejercicio1.PercussionInstrument;

/**
 * Created by leonardo on 02/04/2015.
 */
public class Drums extends PercussionInstrument {

    public Drums() {
        this.numberOfCymbals = 3;
        this.numberOfDrums = 5;
        this.name = "Pearl";
    }

    public Drums(String name, int numberOfCymbals, int numberOfDrumbs) {
        this.name = name;
        this.numberOfCymbals = numberOfCymbals;
        this.numberOfDrums = numberOfDrumbs;
    }

    @Override public void play() {
        System.out.println(this.name + " drums of " + this.numberOfCymbals +
                " and " + this.numberOfDrums + " drums");
    }

    @Override public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Drums))
            return false;
        if( this == obj)
            return true;

        return (this.numberOfCymbals == ((PercussionInstrument)obj).numberOfCymbals) &&
                this.numberOfDrums == ((PercussionInstrument)obj).numberOfDrums &&
                this.name.equals(((PercussionInstrument)obj).name);
    }

    @Override public int hashCode() {
        int result = 17;

        result = 37 * result + this.numberOfDrums;
        result = 37 * result + this.numberOfCymbals;
        result = 37 * result + this.name.hashCode();
        result = 37 * result + getClass().hashCode();

        return result;
    }


}
