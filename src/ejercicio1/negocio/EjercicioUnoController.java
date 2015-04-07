package ejercicio1.negocio;

import ejercicio1.BandEquipment;
import ejercicio1.presentacion.IOInstrument;
import modelo.Menu;
import persistencia.MenuDB;
import persistencia.Spells;
import presentacion.IOMenu;

/**
 * Created by leonardo on 04/04/2015.
 */
public class EjercicioUnoController {

    public static void runEjercicio() {

        MenuDB mdb = new MenuDB();
        IOMenu iom = new IOMenu();
        IOInstrument ioi = new IOInstrument();
        Menu ejercicio1 = mdb.getMenu(Spells.EJERCICIO_UNO);
        Menu subMenu = mdb.getMenu(Spells.EJERCICIO_UNO_SUB_MENU);
        BandEquipment basic = new BandEquipment();

        iom.mostrar(ejercicio1);
        switch (iom.getSelectedMenu(ejercicio1.getSize())) {
            case 1:
                basic.testSound();
                break;
            case 2:
                basic.generateFullEquip();
                basic.testSound();
                break;
            case 3:
                boolean finSubMenu = false;
                while(!finSubMenu) {
                    iom.mostrar(subMenu);
                    switch (iom.getSelectedMenu(subMenu.getSize())){
                        case 1:
                            basic.addElectricGuitar(ioi.newElectricGuitar());
                            break;
                        case 2:
                            basic.addElectricBassGuitar(ioi.newElectricBassGuitar());
                            break;
                        case 3:
                            basic.addDrums(ioi.newDrums());
                            break;
                        case 4:
                            basic.testSound();
                            break;
                        case 5:
                            finSubMenu = true;
                            break;
                    }
                }

                break;
        }

        iom.println();
    }
}
