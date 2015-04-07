package negocio;

import clasesInternas.Stack;
import ejercicio1.negocio.EjercicioUnoController;
import modelo.Menu;
import persistencia.MenuDB;
import persistencia.Spells;
import presentacion.IOManager;
import presentacion.IOMenu;

public class MenuController {

    public void runMenu(){
        IOManager io = new IOManager();
        MenuDB mdb = new MenuDB();
        IOMenu iom = new IOMenu();
        Menu miMenu = mdb.getMenu(Spells.MENU_PRINCIPAL);

        boolean fin = false;

        while(!fin) {
            iom.mostrar(miMenu);

            switch (iom.getSelectedMenu(miMenu.getSize())) {
                case 1:
                    EjercicioUnoController.runEjercicio();
                    break;
                case 2:
                    io.println("Clases Internas");
                    Stack st = new Stack();
                    st.push("a");
                    st.push("b");
                    st.pop();
                    st.push("c");
                    st.push("d");
                    st.push("e");
                    st.show();
                    io.println();
                    break;
                case 3:
                    io.print("Adios!!!\t\t\t\t\tZielinski Leonardo");
                    fin = true;
                    break;
            }
        }
    }

}