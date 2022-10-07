package Gui_vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarEstudiante extends JFrame implements ActionListener {

    private JPanel PanelRegistarEstudiantes;
    private JTextField txtFieldnombre;
    private JTextField txtFieldrut;
    private JTextField txtFieldmatricula;
    private JComboBox comboBoxCarrera;
    private JButton cancelarButton;
    private JButton registrarEstudianteButton;

    private final Font fuenteTitulo;
    private final Font fuenteTexto;



    public RegistrarEstudiante(){


        this.fuenteTitulo = new Font("Calibri", 3, 20);
        this.fuenteTexto = new Font("Calibri", 1, 14);


        add(PanelRegistarEstudiantes);
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(txtFieldnombre);
        setVisible(true);

        add(txtFieldrut);
        setVisible(true);

        add(txtFieldmatricula);
        setVisible(true);

        add(comboBoxCarrera);
        setVisible(true);

        DefaultComboBoxModel comboBoxCarreraModel = new DefaultComboBoxModel();

        comboBoxCarrera.setModel(comboBoxCarreraModel);
        comboBoxCarreraModel.addElement("ICI-I");
        comboBoxCarreraModel.addElement("ICI-B");
        comboBoxCarreraModel.addElement("ICI-M");






    }

    public JTextField getTxtFieldnombre() {
        return txtFieldnombre;
    }

    public void setTxtFieldnombre(JTextField txtFieldnombre) {
        this.txtFieldnombre = txtFieldnombre;
    }

    public JTextField getTxtFieldrut() {
        return txtFieldrut;
    }

    public void setTxtFieldrut(JTextField txtFieldrut) {
        this.txtFieldrut = txtFieldrut;
    }

    public JTextField getTxtFieldmatricula() {
        return txtFieldmatricula;
    }

    public void setTxtFieldmatricula(JTextField txtFieldmatricula) {
        this.txtFieldmatricula = txtFieldmatricula;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }

    public JButton getRegistrarEstudianteButton() {
        return registrarEstudianteButton;
    }

    public void setRegistrarEstudianteButton(JButton registrarEstudianteButton) {
        this.registrarEstudianteButton = registrarEstudianteButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private class Font {
        public Font(String calibri, int i, int i1) {
        }
    }
}
