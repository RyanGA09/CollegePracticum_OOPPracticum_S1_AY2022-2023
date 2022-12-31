package view.frame;

import javax.swing.*;
import java.awt.*;

public class GuiMainMenuFrame extends GuiMainUnitFrame {

    private JLabel icon, titleLabel;

    private JButton transferButton, tarikButton, akunButton, saldoButton, mutasiButton, setorButton, logoutButton, editButton;

    public GuiMainMenuFrame(){
        super("MAIN MENU");
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("MAIN MENU");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 265, 35, 246, 100);

        ImageIcon image = loadImage("src/Assets/Logo.png", 200, 200);
        icon = new JLabel(image);
        boundedAdd(icon, 200, 136, 200, 200);
        /*=======================================================*/
        setorButton = new JButton("PENYETORAN TUNAI");
        setFontSize(setorButton, 10);
        setFontStyle(setorButton, Font.BOLD);
        boundedAdd(setorButton, 85, 360, 100, 50);

        tarikButton = new JButton("PENARIKAN TUNAI");
        setFontSize(tarikButton, 10);
        setFontStyle(tarikButton, Font.BOLD);
        boundedAdd(tarikButton, 465, 360, 100, 50);
        /*=======================================================*/
        saldoButton = new JButton("INFO SALDO");
        setFontSize(saldoButton, 10);
        setFontStyle(saldoButton, Font.BOLD);
        boundedAdd(saldoButton, 85, 440, 100, 50);

        mutasiButton = new JButton("MUTASI TRANSAKSI");
        setFontSize(mutasiButton, 10);
        setFontStyle(mutasiButton, Font.BOLD);
        boundedAdd(mutasiButton, 275, 440, 100, 50);

        transferButton = new JButton("TRANSFER");
        setFontSize(transferButton, 10);
        setFontStyle(transferButton, Font.BOLD);
        boundedAdd(transferButton, 465, 440, 100, 50);
        /*=======================================================*/
        akunButton = new JButton("INFO AKUN");
        setFontSize(akunButton, 10);
        setFontStyle(akunButton, Font.BOLD);
        boundedAdd(akunButton, 85, 520, 100, 50);

        editButton = new JButton("EDIT AKUN");
        setFontSize(editButton, 10);
        setFontStyle(editButton, Font.BOLD);
        boundedAdd(editButton, 465, 520, 100, 50);
        /*=======================================================*/
        logoutButton = new JButton("LOGOUT");
        setFontSize(logoutButton, 10);
        setFontStyle(logoutButton, Font.BOLD);
        boundedAdd(logoutButton, 275, 600, 100, 50);
    }

    @Override
    protected void event() {

    }
}
