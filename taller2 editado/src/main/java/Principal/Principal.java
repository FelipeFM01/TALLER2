package Principal;

import Gui_vista.Menu_Intranet;
import Gui_vista.RegistrarEstudiante;

import javax.swing.*;

public class Principal {


    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Menu_Intranet registrarCarrera = new Menu_Intranet();
                registrarCarrera.setVisible(true);
            }

        });

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Menu_Intranet registrarEstudiante = new Menu_Intranet();
                registrarEstudiante.setVisible(true);

                JFrame frame = new RegistrarEstudiante("Registrar");
                frame.setVisible(true);
            }

        });


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Menu_Intranet buscarEstudiante = new Menu_Intranet();
                buscarEstudiante.setVisible(true);

            }

        });



    }


}
