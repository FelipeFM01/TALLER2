package Gui_vista;

import javax.swing.*;

public class BuscarEstudiante extends JFrame {

    private JPanel PanelBuscarEstudiante;
    private JTextField txtFieldnombreEstudiante;
    private JComboBox comboBoxbuscarCarrera;
    private JButton regresarButton;
    private JButton buscarButton;
    private JTable tableEstudiantes;


    public BuscarEstudiante(String[][] datos, String[] nombreColumnas) {
        add(PanelBuscarEstudiante);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        DefaultComboBoxModel comboBoxbuscarCarreraModel = new DefaultComboBoxModel();

        comboBoxbuscarCarrera.setModel(comboBoxbuscarCarreraModel);
        comboBoxbuscarCarreraModel.addElement("ICI-I");
        comboBoxbuscarCarreraModel.addElement("ICI-B");
        comboBoxbuscarCarreraModel.addElement("ICI-M");
    }

    public BuscarEstudiante(String titulo) {
    }


}