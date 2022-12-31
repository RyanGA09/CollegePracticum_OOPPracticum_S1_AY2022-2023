package view.frame.viewconfirmation;

import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiPinConfirmFrame extends GuiMainUnitFrame {
    private JLabel titleLabel, pinLabel;

    private JButton pinButton;

    private JPasswordField pinField;

    public GuiPinConfirmFrame(){
        super("VERIFIKASI PIN");
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("PIN VERIFICATION");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 225, 35, 246, 100);

        pinLabel = new JLabel("Please insert your pin to continue.");
        setFontSize(pinLabel, 15);
        setFontStyle(pinLabel, Font.BOLD);
        boundedAdd(pinLabel, 225, 300, 200, 25);

        pinField = new JPasswordField();
        boundedAdd(pinField, 300, 350, 75, 25);

        pinButton = new JButton("Verification");
        boundedAdd(pinButton, 300, 400, 75, 50);
        
    }

    @Override
    protected void event() {

    }
}
