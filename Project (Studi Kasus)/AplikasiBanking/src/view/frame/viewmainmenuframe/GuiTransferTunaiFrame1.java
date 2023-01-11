package view.frame.viewmainmenuframe;

import controller.Authentication;
import entity.User;
import model.Modelling;
import view.frame.GuiMainMenuFrame;
import view.frame.GuiMainUnitFrame;
import view.frame.viewconfirmation.GuiPinConfirmFrame;

import javax.swing.*;
import java.awt.*;

public class GuiTransferTunaiFrame1 extends GuiMainUnitFrame {

    private JTextField transferField, tujuanField;

    private JButton nextButton, cancelButton;

    public GuiTransferTunaiFrame1(){
        super("TRANSFER");
    }

    @Override
    protected void component() {
        JLabel titleLabel = new JLabel("TRANSFER");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 325, 35, 246, 100);

        ImageIcon transfer = loadImage("src/Assets/Transfer.jpg", 75, 75);
        JLabel iconTransfer = new JLabel(transfer);
        boundedAdd(iconTransfer, 225, 45, 75, 75);

        ImageIcon image = loadImage("src/Assets/Logo.png", 150, 150);
        JLabel icon = new JLabel(image);
        boundedAdd(icon, 255, 136, 150, 150);
        /*=======================================================*/
        JLabel tujuanLabel = new JLabel("Tujuan Rekening:");
        boundedAdd(tujuanLabel, 280, 330, 100, 25);

        tujuanField = new JTextField();
        boundedAdd(tujuanField, 280, 360, 100, 25);

        JLabel transferLabel = new JLabel("Jumlah Nominal: ");
        boundedAdd(transferLabel, 280, 385, 100, 25);

        transferField = new JTextField();
        boundedAdd(transferField, 280, 415, 100, 25);
        /*=======================================================*/
        cancelButton = new JButton("CANCEL");
        boundedAdd(cancelButton,  70, 550, 75, 50);

        nextButton = new JButton("Next");
        boundedAdd(nextButton, 500, 550, 75, 50);
    }

    @Override
    protected void event() {
        nextButton.addActionListener((e) -> {
            String tujuan = tujuanField.getText();
            String transfer = transferField.getText();
            User userTujuan = new Authentication().cariRekening(tujuan);
            transfer(transfer, userTujuan);
        });

        cancelButton.addActionListener((e) -> {
            new GuiMainMenuFrame().setVisible(true);
            dispose();
        });
    }

    private void transfer(String transfer, User userTujuan){
        if (userTujuan != null){
            if (!userTujuan.getUsername().equals(Modelling.getuserMasuk().getUsername())){
                int nominal = Integer.parseInt(transfer);
                if(nominal < Modelling.getuserMasuk().getRekening().getSaldo()){
                    new GuiPinConfirmFrame(new GuiStatusTransferFrame(userTujuan, nominal)).setVisible(true);
                    dispose();
//                    new GuiPinConfirmFrame().setVisible(true);
//                    if (new GuiPinConfirmFrame().verif()){
//                        boolean status = Bank.transfer(new Transfer(nominal, Modelling.getuserMasuk(), userTujuan));
//                        if (status){
//                            JOptionPane.showMessageDialog(null, """
//                                Berhasil Transfer Sebesar
//                                Rp.""" + Keuangan.format(nominal), "Transfer Berhasil", JOptionPane.INFORMATION_MESSAGE);
//                        }
//                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Saldo Tidak Cukup!", "Saldo Kurang", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Tidak dapat Transfer ke Rekening Sendiri !", "Gagal Transfer", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(null, "No Rekening tidak Ditemukan !", "Gagal Transfer", JOptionPane.ERROR_MESSAGE);
        }
    }
}
