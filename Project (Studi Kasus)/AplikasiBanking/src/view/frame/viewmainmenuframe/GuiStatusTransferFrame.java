package view.frame.viewmainmenuframe;

import controller.Bank;
import entity.Transfer;
import entity.User;
import model.Modelling;
import utils.Keuangan;
import view.frame.GuiMainMenuFrame;
import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiStatusTransferFrame extends GuiMainUnitFrame {

    private User userTujuan;

    private int nominal;

    private JButton backButton;


    public GuiStatusTransferFrame(User userTujuan, int nominal) {
        super("TRANSFER STATUS");
        setSize(350, 350);
        setLocation(625, 250);
        this.nominal = nominal;
        this.userTujuan = userTujuan;
    }

    @Override
    protected void component() {
        JLabel backLabel = new JLabel("<html>Transfer Completed <br> Return to Main Menu</html>");
        boundedAdd(backLabel, 100, 125, 150, 50);
        setFontStyle(backLabel, Font.BOLD);

        backButton = new JButton("BACK");
        boundedAdd(backButton, 125, 175, 75, 30);
    }

    @Override
    protected void event() {
        boolean status = new Bank().transfer(new Transfer(nominal, Modelling.getuserMasuk(), userTujuan));
        if (status){
            JOptionPane.showMessageDialog(null, """
                               Berhasil Transfer Sebesar
                                Rp.""" + Keuangan.format(nominal), "Transfer Berhasil", JOptionPane.INFORMATION_MESSAGE);
        }

        backButton.addActionListener((e) -> {
            new GuiMainMenuFrame().setVisible(true);
            dispose();
        });
    }
}
