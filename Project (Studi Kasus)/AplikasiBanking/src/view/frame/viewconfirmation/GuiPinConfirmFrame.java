package view.frame.viewconfirmation;

import controller.Bank;
import view.frame.GuiMainMenuFrame;
import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiPinConfirmFrame extends GuiMainUnitFrame {

    private JButton pinButton;

    private JPasswordField pinField;

    public GuiPinConfirmFrame(){
        super("VERIFIKASI PIN");
    }

    @Override
    protected void component() {
        JLabel titleLabel = new JLabel("PIN VERIFICATION");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 225, 35, 246, 100);

        ImageIcon image = loadImage("src/Assets/Logo.png", 200, 200);
        JLabel icon = new JLabel(image);
        boundedAdd(icon, 200, 136, 200, 200);
        /*=======================================================*/
        JLabel pinLabel = new JLabel("Please insert your pin to continue.");
        setFontSize(pinLabel, 15);
        setFontStyle(pinLabel, Font.BOLD);
        boundedAdd(pinLabel, 225, 375, 200, 25);

        pinField = new JPasswordField();
        boundedAdd(pinField, 300, 425, 75, 25);

        pinButton = new JButton("Verification");
        boundedAdd(pinButton, 300, 475, 75, 50);
        
    }

    @Override
    protected void event() {
        pinButton.addActionListener((e) -> {
            verif();
        });
    }

    public boolean verif(){
        int percobaan = 3;
        do {
            percobaan -= 1;
            String pin = String.valueOf(pinField.getPassword());
            boolean status = Bank.pinVerif(pin);
            if (!status) {
                if (percobaan == 0){
                    JOptionPane.showMessageDialog(null, "Anda Salah memasukan PIN sebanyak 3x", "Pin Salah", JOptionPane.ERROR_MESSAGE);
                    new GuiMainMenuFrame().setVisible(true);
                    dispose();
                    return false;
                }
                else{
                    JOptionPane.showMessageDialog(null, "PIN Salah !");
                    new GuiPinConfirmFrame().setVisible(true);
                    dispose();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Verifikasi Berhasil", "Terverifikasi", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                return true;
            }
        } while(percobaan != 0);
        return false;
    }
}
