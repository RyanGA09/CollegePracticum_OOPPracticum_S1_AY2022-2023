package view.frame.viewmainmenuframe;

import controller.Bank;
import entity.SetorTunai;
import model.Modelling;
import view.frame.GuiMainMenuFrame;
import view.frame.GuiMainUnitFrame;
import view.frame.viewconfirmation.GuiPinConfirmFrame;

import javax.swing.*;
import java.awt.*;
//import java.io.IOException;

public class GuiSetorTunaiFrame extends GuiMainUnitFrame {

    private JTextField setorfield;

    private JButton setorButton, cancelButton;

    public GuiSetorTunaiFrame(){
        super("PENYETORAN TUNAI");
    }

    @Override
    protected void component() {
        JLabel titleLabel = new JLabel("PENYETORAN TUNAI");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 235, 35, 246, 100);

        ImageIcon setor = loadImage("src/Assets/Setor.jpg", 75, 75);
        JLabel iconSetor = new JLabel(setor);
        boundedAdd(iconSetor, 135, 45, 75, 75);

        ImageIcon image = loadImage("src/Assets/Logo.png", 150, 150);
        JLabel icon = new JLabel(image);
        boundedAdd(icon, 255, 136, 150, 150);
        /*=======================================================*/
        JLabel setorLabel = new JLabel("Nominal setor:");
        setFontSize(setorLabel, 15);
        setFontStyle(setorLabel, Font.BOLD);
        boundedAdd(setorLabel, 300, 355, 100, 30);

        setorfield = new JTextField();
        boundedAdd(setorfield, 265, 385, 125, 25);
        /*=======================================================*/
        setorButton = new JButton("SETOR");
        boundedAdd(setorButton, 300, 450, 75, 50);

        cancelButton = new JButton("CANCEL");
        boundedAdd(cancelButton,  70, 550, 75, 50);

    }

    @Override
    protected void event() {

        setorButton.addActionListener((e) -> {
            new GuiPinConfirmFrame().setVisible(true);
            if (new GuiPinConfirmFrame().verif()){
                try{
                    int nominal = Integer.parseInt(setorfield.getText());
                    Bank.setorTunai(Modelling.getuserMasuk(), new SetorTunai(nominal, Modelling.getuserMasuk(), Modelling.getuserMasuk()));
                    JOptionPane.showMessageDialog(null, "Setor Tunai Berhasil", "Setor Berhasil", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Format Penulisan Angka Salah", "Format Salah", JOptionPane.ERROR_MESSAGE);
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
