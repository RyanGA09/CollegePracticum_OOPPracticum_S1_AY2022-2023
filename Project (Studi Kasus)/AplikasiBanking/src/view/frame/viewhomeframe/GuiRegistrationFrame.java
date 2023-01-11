package view.frame.viewhomeframe;

import model.Modelling;
import view.frame.GuiHomeFrame;
import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

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
                Already Have an Account?""");
        setFontSize(noteLabel, 15);
        boundedAdd(noteLabel, 50, 565, 150, 40);

        answerButton = new JButton("YES");
        boundedAdd(answerButton, 100, 600, 40, 40);

        registButton = new JButton("REGISTER");
        boundedAdd(registButton, 475, 600, 75, 45);
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
            if (!account.isBlank() && !name.isBlank() && !nik.isBlank() && !phone.isBlank() && !username.isBlank() && !pass.isBlank() && !pin.isBlank()){
                Modelling.register(account, name, nik, phone, username, pass, pin);
                JOptionPane.showMessageDialog(null, "Berhasil Mendaftar Akun", "Daftar Berhasil", JOptionPane.INFORMATION_MESSAGE);
                new GuiHomeFrame().setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Harap isi Data", "Data Tidak Lengkap", JOptionPane.ERROR_MESSAGE);
            }
        });

        answerButton.addActionListener((e) -> {
            new GuiLoginFrame().setVisible(true);
            dispose();
        });
    }
}
