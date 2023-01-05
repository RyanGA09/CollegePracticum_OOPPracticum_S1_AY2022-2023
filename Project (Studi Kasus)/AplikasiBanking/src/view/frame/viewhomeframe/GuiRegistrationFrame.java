package view.frame.viewhomeframe;

import controller.Authentication;
import model.Modelling;
import view.frame.GuiHomeFrame;
import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.EmptyStackException;

public class GuiRegistrationFrame extends GuiMainUnitFrame {

    private JTextField accountField, nameField, usernameField, noTelponField, nikField;

    private JPasswordField aksesField, pinField;

    private JButton registButton, answerButton;

    public GuiRegistrationFrame(){
        super("REGISTRATION");
    }

    @Override
    protected void component() {

        JLabel titleLabel = new JLabel("REGISTRATION");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 235, 35, 246, 100);

        ImageIcon image = loadImage("src/Assets/Logo.png", 175, 175);
        JLabel icon = new JLabel(image);
        boundedAdd(icon, 215, 115, 175, 175);
        /*=======================================================*/
        JLabel accountLabel = new JLabel("Account");
        setFontSize(accountLabel, 15);
        boundedAdd(accountLabel, 205, 300, 100, 25);

        accountField = new JTextField();
        boundedAdd(accountField, 275, 300, 100, 25);

        /*=======================================================*/
        JLabel nameLabel = new JLabel("Nama");
        setFontSize(nameLabel, 15);
        boundedAdd(nameLabel, 225, 340, 100, 25);

        nameField = new JTextField();
        boundedAdd(nameField, 275, 340, 100, 25);
        /*=======================================================*/
        JLabel nikLabel = new JLabel("NIK");
        setFontSize(nikLabel, 15);
        boundedAdd(nikLabel, 240, 380, 100, 25);

        nikField = new JTextField();
        boundedAdd(nikField, 275, 380, 100, 25);
        /*=======================================================*/
        JLabel noTelponLabel = new JLabel("Telpon");
        setFontSize(noTelponLabel, 15);
        boundedAdd(noTelponLabel, 215, 420, 100, 25);

        noTelponField = new JTextField();
        boundedAdd( noTelponField, 275, 420, 100, 25);
        /*=======================================================*/
        JLabel usernameLabel = new JLabel("Username");
        setFontSize(usernameLabel, 15);
        boundedAdd(usernameLabel, 192, 460, 100, 25);

        usernameField = new JTextField();
        boundedAdd(usernameField, 275, 460, 100, 25);
        /*=======================================================*/
        JLabel aksesLabel = new JLabel("Kode Akses");
        setFontSize(aksesLabel, 15);
        boundedAdd(aksesLabel, 177, 500, 100, 25);

        aksesField = new JPasswordField();
        boundedAdd(aksesField, 275, 500, 100, 25);
        /*=======================================================*/
        JLabel pinLabel = new JLabel("PIN");
        setFontSize(pinLabel, 15);
        boundedAdd(pinLabel, 240, 540, 100, 25);

        pinField = new JPasswordField();
        boundedAdd(pinField, 275, 540, 100, 25);
        /*=======================================================*/
        JLabel noteLabel = new JLabel("""
                Already Have\s
                an Account?""");
        setFontSize(noteLabel, 15);
        boundedAdd(noteLabel, 65, 480, 125, 100);

        answerButton = new JButton("YES");
        boundedAdd(answerButton, 100, 550, 50, 50);

        registButton = new JButton("REGISTER");
        boundedAdd(registButton, 500, 590, 70, 50);
    }

    @Override
    protected void event() {
        registButton.addActionListener((e) -> {
                String account = accountField.getText();
                String name = nameField.getText();
                String nik = nikField.getText();
                String phone = noTelponField.getText();
                String username = usernameField.getText();
                String pass = String.valueOf(aksesField.getPassword());
                String pin = String.valueOf(pinField.getPassword());
                Modelling.register(account, name, nik, phone, username, pass, pin);
                JOptionPane.showMessageDialog(null, "Berhasil Mendaftar Akun", "Daftar Berhasil", JOptionPane.INFORMATION_MESSAGE);
                new GuiHomeFrame().setVisible(true);
                dispose();
        });

        answerButton.addActionListener((e) -> new GuiLoginFrame().setVisible(true));
    }
}
