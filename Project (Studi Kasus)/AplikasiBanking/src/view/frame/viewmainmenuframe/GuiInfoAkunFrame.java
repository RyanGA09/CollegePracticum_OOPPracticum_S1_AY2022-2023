package view.frame.viewmainmenuframe;

import controller.Authentication;
import model.Modelling;
import view.frame.GuiMainMenuFrame;
import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;
//import java.util.Objects;

public class GuiInfoAkunFrame extends GuiMainUnitFrame {

    private JLabel titleLabel, icon, iconAkun, accountLabel, nameLabel, nameSetLabel, usernameLabel, noTelponLabel1, nikLabel, nikSetLabel, aksesLabel, pinLabel1, pinLabel2, rekeningLabel, noRekLabel, noTelponLabel2/*, showIcon, hideIcon*/;

    private JTextField accountField, usernameField;

    private JPasswordField  aksesField;

    private JButton backButton, editButton;

    private JRadioButton showHideRadio;

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
        setFontSize(accountField, 12);
        boundedAdd(accountField, 50, 200, 100, 25);
        /*=======================================================*/
        nameLabel = new JLabel("Fullname:");
        setFontSize(nameLabel,  10);
        boundedAdd(nameLabel, 50, 215, 100, 50);

        nameSetLabel = new JLabel();
        setFontSize(nameSetLabel,  12);
        boundedAdd(nameSetLabel, 50, 250, 100, 25);
        /*=======================================================*/
        nikLabel = new JLabel("NIK:");
        setFontSize(nikLabel,  10);
        boundedAdd(nikLabel, 50, 265, 100, 50);

        nikSetLabel = new JLabel();
        setFontSize(nikSetLabel,  12);
        boundedAdd(nikSetLabel, 50, 300, 100, 25);
        /*=======================================================*/
        noTelponLabel1 = new JLabel("Phone:");
        setFontSize(noTelponLabel1,  10);
        boundedAdd(noTelponLabel1, 50, 315, 100, 50);

        noTelponLabel2 = new JLabel();
        setFontSize(noTelponLabel2, 12);
        boundedAdd(noTelponLabel2, 50, 350, 100, 25);
        /*=======================================================*/
        usernameLabel = new JLabel("Username:");
        setFontSize(usernameLabel,  10);
        boundedAdd(usernameLabel, 50, 365, 100, 50);

        usernameField = new JTextField();
        setFontSize(usernameField,  12);
        boundedAdd(usernameField, 50, 400, 100, 25);
        /*=======================================================*/
        aksesLabel = new JLabel("Access Code:");
        setFontSize(aksesLabel,  10);
        boundedAdd(aksesLabel, 50, 415, 100, 50);

        aksesField = new JPasswordField();
        setFontSize(aksesField,  12);
        boundedAdd(aksesField, 50, 450, 100, 25);
        /*=======================================================*/
        pinLabel1 = new JLabel("PIN:");
        setFontSize(pinLabel1,  10);
        boundedAdd(pinLabel1, 50, 465, 100, 50);

        pinLabel2 = new JLabel("******");
        setFontSize(pinLabel2, 12);
        boundedAdd(pinLabel2, 50, 500, 100, 25);

        showHideRadio = new JRadioButton("Show");
        setFontSize(showHideRadio, 10);
        boundedAdd(showHideRadio, 100, 500, 45, 20);
        /*=======================================================*/
        rekeningLabel = new JLabel("No. Rekening:");
        setFontSize(rekeningLabel,  10);
        boundedAdd(rekeningLabel, 50, 515, 100, 50);

        noRekLabel = new JLabel();
        setFontSize(noRekLabel,  12);
        boundedAdd(noRekLabel, 50, 550, 100, 25);
        /*=======================================================*/
        backButton = new JButton("BACK");
        boundedAdd(backButton, 200, 600, 50, 50);

        editButton = new JButton("EDIT");
        boundedAdd(editButton, 450, 600, 50, 50);
    }

    @Override
    protected void event() {
        showProfil();
        editButton.addActionListener((e) -> {
            new Authentication().editEmail(accountField.getText());
            new Authentication().editUsername(usernameField.getText());
            new Authentication().editKodeAkses(String.valueOf(aksesField.getPassword()));
            showProfil();
            JOptionPane.showMessageDialog(null, "Edit berhasil Data", "Edit berhasil", JOptionPane.INFORMATION_MESSAGE);
        });

        showHideRadio.addActionListener((e) -> {
            if(showHideRadio.isSelected()){
                pinLabel2.setText(Modelling.getRekMasuk().getPin());
            }
            else{
                pinLabel2.setText("******");
            }
        });

        backButton.addActionListener((e) -> {
            new GuiMainMenuFrame().setVisible(true);
            dispose();
        });
    }

    private void showProfil(){
        String account = Modelling.getuserMasuk().getEmail();
        accountField.setText(account);
        String name = Modelling.getuserMasuk().getFullname();
        nameSetLabel.setText(name);
        String nik = Modelling.getuserMasuk().getNik();
        nikSetLabel.setText(nik);
        String phone = Modelling.getuserMasuk().getNoTelpon();
        noTelponLabel2.setText(phone);
        String username = Modelling.getuserMasuk().getUsername();
        usernameField.setText(username);
        String pass = Modelling.getuserMasuk().getKodeAkses();
        aksesField.setText(pass);
        String noRek = Modelling.getRekMasuk().getNoRekening();
        noRekLabel.setText(noRek);
    }
}
