package view.frame.viewhomeframe;

import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiRegistrationFrame extends GuiMainUnitFrame {

    private JLabel icon, titleLabel, nameLabel, alamatLabel, noTelponLabel, nikLabel, aksesLabel, pinLabel;

    private JTextField nameField, alamatField, noTelponField, nikField, aksesField, pinField;

    private JButton registButton;

    public GuiRegistrationFrame(){
        super("REGISTRATION");
    }

    @Override
    protected void component() {

        titleLabel = new JLabel("REGISTRATION");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 235, 35, 246, 100);

        ImageIcon image = loadImage("src/Assets/Logo.png", 175, 175);
        icon = new JLabel(image);
        boundedAdd(icon, 215, 115, 175, 175);
        /*=======================================================*/
        nameLabel = new JLabel("Nama");
        setFontSize(nameLabel, 15);
        boundedAdd(nameLabel, 325, 290, 100, 25);

        nameField = new JTextField();
        boundedAdd(nameField, 275, 315, 100, 25);
        /*=======================================================*/
        alamatLabel = new JLabel("Alamat");
        setFontSize(alamatLabel, 15);
        boundedAdd(alamatLabel, 320, 335, 100, 25);

        alamatField = new JPasswordField();
        boundedAdd(alamatField, 275, 360, 100, 25);
        /*=======================================================*/
        noTelponLabel = new JLabel("Telpon");
        setFontSize(noTelponLabel, 15);
        boundedAdd(noTelponLabel, 320, 380, 100, 25);

        noTelponField = new JTextField();
        boundedAdd( noTelponField, 275, 405, 100, 25);
        /*=======================================================*/
        nikLabel = new JLabel("NIK");
        setFontSize(nikLabel, 15);
        boundedAdd(nikLabel, 320, 425, 100, 25);

        nikField = new JTextField();
        boundedAdd(nikField, 275, 450, 100, 25);
        /*=======================================================*/
        aksesLabel = new JLabel("Kode Akses");
        setFontSize(aksesLabel, 15);
        boundedAdd(aksesLabel, 320, 470, 100, 25);

        aksesField = new JTextField();
        boundedAdd(aksesField, 275, 495, 100, 25);
        /*=======================================================*/
        pinLabel = new JLabel("PIN");
        setFontSize(pinLabel, 15);
        boundedAdd(pinLabel, 320, 515, 100, 25);

        pinField = new JTextField();
        boundedAdd(pinField, 275, 540, 100, 25);
        /*=======================================================*/
        registButton = new JButton("REGISTER");
        boundedAdd(registButton, 500, 585, 70, 50);
    }

    @Override
    protected void event() {

    }
}
