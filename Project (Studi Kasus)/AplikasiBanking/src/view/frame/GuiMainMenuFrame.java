package view.frame;

import model.Modelling;
import view.frame.viewconfirmation.GuiLogOutConfirmFrame;
import view.frame.viewconfirmation.GuiPinConfirmFrame;
import view.frame.viewmainmenuframe.*;

import javax.swing.*;
import java.awt.*;

public class GuiMainMenuFrame extends GuiMainUnitFrame {

    private JLabel welcomeLabel;
    private JLabel noRekLabel;

    private JRadioButton showHideRadio;

    private JButton transferButton, tarikButton, akunButton, saldoButton, mutasiButton, setorButton, logoutButton;

    public GuiMainMenuFrame(){
        super("MAIN MENU");
    }

    @Override
    protected void component() {
        JLabel titleLabel = new JLabel("MAIN MENU");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 265, 35, 246, 100);

        ImageIcon image = loadImage("src/Assets/Logo.png", 200, 200);
        JLabel icon = new JLabel(image);
        boundedAdd(icon, 200, 136, 200, 200);
        /*=======================================================*/
        welcomeLabel = new JLabel();
        setFontSize(welcomeLabel, 15);
        boundedAdd(welcomeLabel, 50, 100, 125, 45);

        noRekLabel = new JLabel("******");
        setFontSize(noRekLabel, 15);
        boundedAdd(noRekLabel, 50,135, 100, 20);

        showHideRadio = new JRadioButton("Show");
        setFontSize(showHideRadio, 10);
        boundedAdd(showHideRadio, 50, 155, 50, 20);
        /*=======================================================*/
        ImageIcon setor = loadImage("src/Assets/Setor.jpg", 35, 35);
        setorButton = new JButton("PENYETORAN TUNAI", setor);
        setFontSize(setorButton, 10);
        setFontStyle(setorButton, Font.BOLD);
        boundedAdd(setorButton, 85, 360, 120, 50);

        ImageIcon tarik = loadImage("src/Assets/Tarik.jpg", 35, 35);
        tarikButton = new JButton("PENARIKAN TUNAI", tarik);
        setFontSize(tarikButton, 10);
        setFontStyle(tarikButton, Font.BOLD);
        boundedAdd(tarikButton, 435, 360, 120, 50);
        /*=======================================================*/
        ImageIcon saldo = loadImage("src/Assets/InfoSaldo.jpg", 35, 35);
        saldoButton = new JButton("INFO SALDO", saldo);
        setFontSize(saldoButton, 10);
        setFontStyle(saldoButton, Font.BOLD);
        boundedAdd(saldoButton, 85, 440,  120, 50);

        ImageIcon transfer = loadImage("src/Assets/Transfer.jpg", 35, 35);
        transferButton = new JButton("TRANSFER", transfer);
        setFontSize(transferButton, 10);
        setFontStyle(transferButton, Font.BOLD);
        boundedAdd(transferButton, 435, 440,  120, 50);
        /*=======================================================*/
        ImageIcon akun = loadImage("src/Assets/InfoAkun.jpg", 35, 35);
        akunButton = new JButton("INFO AKUN", akun);
        setFontSize(akunButton, 10);
        setFontStyle(akunButton, Font.BOLD);
        boundedAdd(akunButton, 85, 520,  120, 50);

        ImageIcon mutasi = loadImage("src/Assets/Mutasi.jpg", 35, 35);
        mutasiButton = new JButton("MUTASI TRANSAKSI", mutasi);
        setFontSize(mutasiButton, 10);
        setFontStyle(mutasiButton, Font.BOLD);
        boundedAdd(mutasiButton, 435, 520,  120, 50);
        /*=======================================================*/
        logoutButton = new JButton("LOGOUT");
        setFontSize(logoutButton, 10);
        setFontStyle(logoutButton, Font.BOLD);
        boundedAdd(logoutButton, 275, 600, 100, 50);
    }

    @Override
    protected void event() {
        welcomeLabel.setText("Welcome, "+Modelling.getuserMasuk().getFullname());

        showHideRadio.addActionListener((e) -> {
            if(showHideRadio.isSelected()){
                noRekLabel.setText(Modelling.getRekMasuk().getNoRekening());
            }
            else{
                noRekLabel.setText("******");
            }
        });

        setorButton.addActionListener((e) -> {
            new GuiPinConfirmFrame(new GuiSetorTunaiFrame()).setVisible(true);
            dispose();
        });

        tarikButton.addActionListener((e) -> {
            new GuiPinConfirmFrame(new GuiTarikTunaiFrame()).setVisible(true);
            dispose();
        });

        saldoButton.addActionListener((e) -> {
            new GuiInfoSaldoFrame().setVisible(true);
            dispose();
        });

        transferButton.addActionListener((e) -> {
            new GuiTransferTunaiFrame1().setVisible(true);
            dispose();
        });

        akunButton.addActionListener((e) -> {
            new GuiInfoAkunFrame().setVisible(true);
            dispose();
        });

        mutasiButton.addActionListener((e) -> {
            new GuiMutasiRekeningFrame().setVisible(true);
            dispose();
        });

        logoutButton.addActionListener((e) -> {
            new GuiLogOutConfirmFrame().setVisible(true);
            dispose();
        });
    }
}
