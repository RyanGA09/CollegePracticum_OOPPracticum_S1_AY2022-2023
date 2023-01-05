package view.frame.viewmainmenuframe;

import model.Modelling;
import utils.Keuangan;
import view.frame.GuiMainMenuFrame;
import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiInfoSaldoFrame extends GuiMainUnitFrame {

    private JLabel nilaiSaldoLabel;

    private JButton backButton;

    public GuiInfoSaldoFrame(){
        super("INFO SALDO");
    }

    @Override
    protected void component() {

        JLabel titleLabel = new JLabel("INFO SALDO");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 295, 35, 246, 100);

        ImageIcon saldo = loadImage("src/Assets/InfoSaldo.jpg", 65, 65);
        JLabel iconSaldo = new JLabel(saldo);
        boundedAdd(iconSaldo, 200, 45, 65, 65);

        ImageIcon image = loadImage("src/Assets/Logo.png", 200, 200);
        JLabel icon = new JLabel(image);
        boundedAdd(icon, 200, 136, 200, 200);
        /*=======================================================*/
        JLabel saldoLabel = new JLabel("Nilai Saldo:");
        setFontSize(saldoLabel,  15);
        setFontStyle(saldoLabel, Font.BOLD);
        boundedAdd(saldoLabel, 100, 400, 100, 25);

        nilaiSaldoLabel = new JLabel("Rp.");
        setFontSize(nilaiSaldoLabel, 15);
        setFontStyle(nilaiSaldoLabel, Font.BOLD);
        boundedAdd(nilaiSaldoLabel, 135, 420, 100, 25);
        /*=======================================================*/
        backButton = new JButton("BACK");
        boundedAdd(backButton, 300, 485, 50, 50);
    }

    @Override
    protected void event() {
        int saldo = Modelling.getuserMasuk().getRekening().getSaldo();
        nilaiSaldoLabel.setText(Keuangan.format(saldo));

        backButton.addActionListener((e) -> {
            new GuiMainMenuFrame().setVisible(true);
            dispose();
        });
    }
}
