package Gui_vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Intranet extends JFrame{
    private JPanel PanelMenuIntranet;
    private JButton registrarCarreraButton;
    private JButton registrarEstudianteButton;
    private JButton buscarEstudianteButton;
    private JButton salirButton;

    public Menu_Intranet(){
        add(PanelMenuIntranet);
        setSize(600,400); //  tamaño ventana
        setLocationRelativeTo(null);   //  en la mitad de la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);// cuando aprete "X" salga del programa
        setTitle("Gracias por su Visita");



        final RegistrarCarrera registrarCarrera = new RegistrarCarrera(); // comunicar esta clase con la de registro cliente

        //ahora hacemos que una vez entrelazada APAREZCA la ventana de registro cliente
        registrarCarreraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                registrarCarrera.setVisible(true);
                dispose();


            }
        });

        final RegistrarEstudiante registrarEstudiante = new RegistrarEstudiante(); // comunicar esta clase con la de registro vehiculo

        //ahora hacemos que una vez entrelazada APAREZCA la ventana de registro cliente
        registrarEstudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                registrarEstudiante.setVisible(true);
                dispose();


            }
        });

        final BuscarEstudiante buscarEstudiante = new BuscarEstudiante(); // comunicar esta clase con la de buscar vehiculo

        //ahora hacemos que una vez entrelazada APAREZCA la ventana de buscar Vehiculo
        buscarEstudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                buscarEstudiante.setVisible(true);
                dispose();


            }
        });








    }


}
