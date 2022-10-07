package Gui_vista;

import javax.swing.*;

public class RegistrarCarrera extends JFrame{
    private JPanel PanelRegistrarCarrera;
    private JTextField textFieldnombreCarrera;
    private JTextField textFieldcodCarrera;
    private JTextField textFieldcantSemestres;
    private JButton cancelarButton;
    private JButton registrarCarreraButton;

    public RegistrarCarrera(){

        add(PanelRegistrarCarrera);
        setSize(1000,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}
