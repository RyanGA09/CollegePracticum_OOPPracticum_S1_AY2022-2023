package view.frame.viewmainmenuframe;

import controller.Bank;
import entity.TarikTunai;
import model.Modelling;
import utils.Keuangan;
import view.frame.GuiMainMenuFrame;
import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiTarikTunaiFrame extends GuiMainUnitFrame {

    private JRadioButton saldoRadio1, saldoRadio2, saldoRadio3, saldoRadio4, saldoRadio5, saldoRadio6, saldoRadio7;

    private JTextField saldoRadio7Field;

    private JButton tarikButton, cancelButton;

    public GuiTarikTunaiFrame(){
        super("PENARIKAN TUNAI");
    }

    @Override
    protected void component() {
        JLabel titleLabel = new JLabel("PENARIKAN TUNAI");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 235, 35, 246, 100);

        ImageIcon tarik = loadImage("src/Assets/Tarik.jpg", 75, 75);
        JLabel iconTarik = new JLabel(tarik);
        boundedAdd(iconTarik, 135, 45, 75, 75);

        ImageIcon image = loadImage("src/Assets/Logo.png", 150, 150);
        JLabel icon = new JLabel(image);
        boundedAdd(icon, 255, 136, 150, 150);
        /*=======================================================*/
        ButtonGroup saldoButtonGroup = new ButtonGroup();

        saldoRadio1 = new JRadioButton("Rp. 50.000");
        boundedAdd(saldoRadio1, 50, 150, 75, 25);
        saldoButtonGroup.add(saldoRadio1);

        saldoRadio2 = new JRadioButton("Rp. 100.000");
        boundedAdd(saldoRadio2, 50, 185, 75, 25);
        saldoButtonGroup.add(saldoRadio2);

        saldoRadio3 = new JRadioButton("Rp. 200.000");
        boundedAdd(saldoRadio3, 50, 220, 75, 25);
        saldoButtonGroup.add(saldoRadio3);

        saldoRadio4 = new JRadioButton("Rp. 500.000");
        boundedAdd(saldoRadio4, 50, 255, 75, 25);
        saldoButtonGroup.add(saldoRadio4);

        saldoRadio5 = new JRadioButton("Rp. 1.000.000");
        boundedAdd(saldoRadio5, 50, 290, 75, 25);
        saldoButtonGroup.add(saldoRadio5);

        saldoRadio6 = new JRadioButton(" Rp. 2.000.000");
        boundedAdd(saldoRadio6, 50, 325, 75, 25);
        saldoButtonGroup.add(saldoRadio6);

        saldoRadio7 = new JRadioButton("Nominal Lain:");
        boundedAdd(saldoRadio7, 50, 360, 75, 25);
        saldoButtonGroup.add(saldoRadio7);

        saldoRadio7Field = new JTextField();
        saldoRadio7Field.setEditable(false);
        boundedAdd(saldoRadio7Field, 70, 390, 150, 25);
        /*=======================================================*/
        tarikButton = new JButton("TARIK");
        boundedAdd(tarikButton, 300, 450, 75, 50);

        cancelButton = new JButton("CANCEL");
        boundedAdd(cancelButton,  70, 550, 75, 50);
    }

    @Override
    protected void event() {

        saldoRadio1.addActionListener((e) -> saldoRadio7Field.setEditable(!saldoRadio1.isSelected()));

        saldoRadio2.addActionListener((e) -> saldoRadio7Field.setEditable(!saldoRadio2.isSelected()));

        saldoRadio3.addActionListener((e) -> saldoRadio7Field.setEditable(!saldoRadio3.isSelected()));

        saldoRadio4.addActionListener((e) -> saldoRadio7Field.setEditable(!saldoRadio4.isSelected()));

        saldoRadio5.addActionListener((e) -> saldoRadio7Field.setEditable(!saldoRadio5.isSelected()));

        saldoRadio6.addActionListener((e) -> saldoRadio7Field.setEditable(!saldoRadio6.isSelected()));

        saldoRadio7.addActionListener((e) -> saldoRadio7Field.setEditable(saldoRadio7.isSelected()));

        tarikButton.addActionListener((e) -> {
            int nominal = 0;
            if (saldoRadio1.isSelected()){
                nominal = 50000 ;
            } else if (saldoRadio2.isSelected()) {
                nominal = 100000;
            } else if (saldoRadio3.isSelected()) {
                nominal = 200000;
            } else if (saldoRadio4.isSelected()) {
                nominal = 500000;
            } else if (saldoRadio5.isSelected()) {
                nominal = 1000000;
            } else if (saldoRadio6.isSelected()) {
                nominal = 2000000;
            } else if (saldoRadio7.isSelected()){
                nominal = Integer.parseInt(saldoRadio7Field.getText());
            }
            if(nominal < 25000 || nominal > 10000000){
                JOptionPane.showMessageDialog(null, "Diluar Batas Ketentuan", "Penarikan Gagal", JOptionPane.ERROR_MESSAGE);
                new GuiTarikTunaiFrame().setVisible(true);
            }
            else{
                boolean status = new Bank().tarikTunai(Modelling.getuserMasuk(), new TarikTunai(nominal, Modelling.getuserMasuk(), Modelling.getuserMasuk()));
                if (status){
                    JOptionPane.showMessageDialog(null, "Berhasil Tarik Tunai sebesar Rp."+Keuangan.format(nominal), "Tarik Tunai Berhasil", JOptionPane.INFORMATION_MESSAGE);
                    new GuiMainMenuFrame().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Saldo Rekening Anda Tidak Mencukupi!", "Tarik Tunai gagal", JOptionPane.INFORMATION_MESSAGE);
                    new GuiTarikTunaiFrame().setVisible(true);
                }
            }
            dispose();
        });

        cancelButton.addActionListener((e) -> {
            new GuiMainMenuFrame().setVisible(true);
            dispose();
        });
    }
}
