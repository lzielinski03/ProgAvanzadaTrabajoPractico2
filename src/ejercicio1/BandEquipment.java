package ejercicio1;

import ejercicio1.model.StringResource;
import presentacion.IOManager;

import java.util.*;

/**
 * Created by leonardo on 03/04/2015.
 */
public class BandEquipment {

    private List<PercussionInstrument> percussionList = new ArrayList<>();
    private List<StringedInstrument> stringedList = new ArrayList<>();

    public BandEquipment() {
        getPercussionList().add(new Drums());
        getStringedList().add(new ElectricBassGuitar());
        getStringedList().add(new ElectricGuitar());
    }

    public void generateFullEquip() {
        this.percussionList.add(new Drums("Tama", 5, 7));
        this.stringedList.add(new ElectricGuitar("Gibson", 6, PlugType.TWELVE_VOLTS));
        this.stringedList.add(new ElectricGuitar("Gibson", 6, PlugType.TWELVE_VOLTS));
        this.stringedList.add(new ElectricBassGuitar("Archer", 5, PlugType.TEEN_VOLTS));
    }

    public void testSound() {
        IOManager io = new IOManager();
        io.println("Test sound");

        final List<StringedInstrument> stringed = getStringedList();
        Set<StringedInstrument> stringedSet = new HashSet<>(stringed);

        final List<PercussionInstrument> percussion = getPercussionList();
        Set<PercussionInstrument> percussionSet = new HashSet<>(percussion);

        for(StringResource st : StringResource.values()) {

            for (PercussionInstrument percussionInstrument : percussionSet) {
                if(Collections.frequency(percussion, percussionInstrument) == st.getStringNumber().getNumber()) {
                    io.print("\t" + st.getStringNumber().getStringValue() + " ");
                    percussionInstrument.play();
                }
            }

            for (StringedInstrument stringedInstrument : stringedSet) {
                if(Collections.frequency(stringed, stringedInstrument) == st.getStringNumber().getNumber()) {
                    io.print("\t" + st.getStringNumber().getStringValue() + " ");
                    stringedInstrument.play();
                }
            }
        }

        io.println("Need");
        List<PlugType> plugList = new ArrayList<>();

        for (StringedInstrument stringedInstrument : getStringedList()) {
            if(stringedInstrument instanceof ElectricBassGuitar) {
                plugList.add(((ElectricBassGuitar) stringedInstrument).getPlugType());
            } else if(stringedInstrument instanceof ElectricGuitar) {
                plugList.add(((ElectricGuitar) stringedInstrument).getPlugType());
            }
        }

        Set<PlugType> plugSet = new HashSet<>(plugList);
        for(StringResource st : StringResource.values()) {
            for (PlugType plug : plugSet) {
                if(Collections.frequency(plugList, plug) == st.getStringNumber().getNumber()) {
                    io.print("\t" + st.getStringNumber().getStringValue() + " ");
                    io.println(plug.toString() + " plug");
                }
            }
        }
        io.println();
    }

    public void addElectricGuitar(StringedInstrument guitar) {
        this.stringedList.add(guitar);
    }

    public void addElectricBassGuitar(StringedInstrument guitarBass) {
        this.stringedList.add(guitarBass);
    }

    public void addDrums(PercussionInstrument drums) {
        this.percussionList.add(drums);
    }

    List<PercussionInstrument> getPercussionList() {
        return percussionList;
    }

    List<StringedInstrument> getStringedList() {
        return stringedList;
    }
}
