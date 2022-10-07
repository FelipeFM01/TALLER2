package Gui_vista;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class BuscarEstudiante extends JFrame{
    private JPanel PanelBuscarEstudiante;
    private JTextField txtFieldnombreEstudiante;
    private JComboBox comboBoxbuscarCarrera;
    private JButton regresarButton;
    private JButton buscarButton;

    public BuscarEstudiante(){

        add(PanelBuscarEstudiante);
        setSize(200,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(comboBoxbuscarCarrera);
        setVisible(true);


        DefaultComboBoxModel comboBoxbuscarCarreraModel = new DefaultComboBoxModel();

        comboBoxbuscarCarrera.setModel(comboBoxbuscarCarreraModel);
        comboBoxbuscarCarreraModel.addElement("ICI-I");
        comboBoxbuscarCarreraModel.addElement("ICI-B");
        comboBoxbuscarCarreraModel.addElement("ICI-M");
    }



}
