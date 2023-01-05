package view.frame.viewmainmenuframe;

import controller.Authentication;
import model.Modelling;
import view.frame.GuiMainMenuFrame;
import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiInfoAkunFrame extends GuiMainUnitFrame {

    private JLabel titleLabel, icon, iconAkun, accountLabel, nameLabel, nameSetLabel, usernameLabel, noTelponLabel, nikLabel, nikSetLabel, aksesLabel, pinLabel, rekeningLabel, noRekLabel;

    private JTextField accountField, usernameField, noTelponField;

    private JPasswordField  aksesField, pinField;

    private JButton backButton, editButton;

    public GuiInfoAkunFrame(){
        super("INFO AKUN");
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("INFO AKUN");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 325, 35, 246, 100);

        ImageIcon akun = loadImage("src/Assets/InfoAkun.jpg", 65, 65);
        iconAkun = new JLabel(akun);
        boundedAdd(iconAkun, 225, 45, 65, 65);

        ImageIcon image = loadImage("src/Assets/Logo.png", 150, 150);
        icon = new JLabel(image);
        boundedAdd(icon, 255, 136, 150, 150);
        /*=======================================================*/
        accountLabel = new JLabel("Account:");
        setFontSize(accountLabel,  10);
        boundedAdd(accountLabel, 50, 165, 100, 50);

        accountField = new JTextField();
        boundedAdd(accountField, 50, 200, 100, 25);
        /*=======================================================*/
        nameLabel = new JLabel("Fullname:");
        setFontSize(nameLabel,  10);
        boundedAdd(nameLabel, 50, 215, 100, 50);

        nameSetLabel = new JLabel();
        boundedAdd(nameSetLabel, 50, 250, 100, 25);
        /*=======================================================*/
        nikLabel = new JLabel("NIK:");
        setFontSize(nikLabel,  10);
        boundedAdd(nikLabel, 50, 265, 100, 50);

        nikSetLabel = new JLabel();
        boundedAdd(nikSetLabel, 50, 300, 100, 25);
        /*=======================================================*/
        noTelponLabel = new JLabel("Phone:");
        setFontSize(noTelponLabel,  10);
        boundedAdd(noTelponLabel, 50, 315, 100, 50);

        noTelponField = new JTextField();
        boundedAdd(noTelponField, 50, 350, 100, 25);
        /*=======================================================*/
        usernameLabel = new JLabel("Username:");
        setFontSize(usernameLabel,  10);
        boundedAdd(usernameLabel, 50, 365, 100, 50);

        usernameField = new JTextField();
        boundedAdd(usernameField, 50, 400, 100, 25);
        /*=======================================================*/
        aksesLabel = new JLabel("Access Code:");
        setFontSize(aksesLabel,  10);
        boundedAdd(aksesLabel, 50, 415, 100, 50);

        aksesField = new JPasswordField();
        boundedAdd(aksesField, 50, 450, 100, 25);
        /*=======================================================*/
        pinLabel = new JLabel("PIN:");
        setFontSize(pinLabel,  10);
        boundedAdd(pinLabel, 50, 465, 100, 50);

        pinField = new JPasswordField();
        boundedAdd(pinField, 50, 500, 100, 25);
        /*=======================================================*/
        rekeningLabel = new JLabel("No. Rekening:");
        setFontSize(rekeningLabel,  10);
        boundedAdd(rekeningLabel, 50, 515, 100, 50);

        noRekLabel = new JLabel();
        setFontSize(noRekLabel,  10);
        boundedAdd(noRekLabel, 50, 550, 100, 25);
        /*=======================================================*/
        backButton = new JButton("BACK");
        boundedAdd(backButton, 200, 600, 50, 50);

        editButton = new JButton("EDIT");
        boundedAdd(editButton, 450, 600, 50, 50);
    }

    @Override
    protected void event() {
        String account = Modelling.getuserMasuk().getEmail();
        accountField.setText(account);
        String name = Modelling.getuserMasuk().getFullname();
        nameSetLabel.setText(name);
        String nik = Modelling.getuserMasuk().getNik();
        nikSetLabel.setText(nik);
        String phone = Modelling.getuserMasuk().getNoTelpon();
        noTelponField.setText(phone);
        String username = Modelling.getuserMasuk().getUsername();
        usernameField.setText(username);
        String pass = Modelling.getuserMasuk().getKodeAkses();
        aksesField.setText(pass);
        String pin = Modelling.getRekMasuk().getPin();
        pinField.setText(pin);
        String noRek = Modelling.getRekMasuk().getNoRekening();
        noRekLabel.setText(noRek);

        editButton.addActionListener((e) -> {
            Authentication.editEmail(account);
            Authentication.editUsername(username);
            Authentication.editNoTelpon(phone);
            Authentication.editKodeAkses(pass);
            Authentication.editPin(pin);
//            if(status1 || status2 || status3 || status4 || status5) {
//            }
        });

        backButton.addActionListener((e) -> {
            new GuiMainMenuFrame().setVisible(true);
        });

    }
}
