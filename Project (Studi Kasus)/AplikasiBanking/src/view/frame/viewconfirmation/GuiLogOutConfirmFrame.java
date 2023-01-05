package view.frame.viewconfirmation;

import view.frame.GuiHomeFrame;
import view.frame.GuiMainMenuFrame;
import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiLogOutConfirmFrame extends GuiMainUnitFrame {

    private JButton yesButton, noButton;

    public GuiLogOutConfirmFrame(){
        super("LOGOUT");
    }

    @Override
    protected void component() {
        JLabel titleLabel = new JLabel("LOGOUT");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 290, 35, 246, 100);

        ImageIcon image = loadImage("src/Assets/Logo.png", 200, 200);
        JLabel icon = new JLabel(image);
        boundedAdd(icon, 200, 136, 200, 200);
        /*=======================================================*/
        JLabel questionLabel = new JLabel("Are you sure do you want to Logout?");
        setFontSize(questionLabel, 20);
        boundedAdd(questionLabel, 185, 350, 450, 100);

        noButton = new JButton("NO");
        boundedAdd(noButton, 150, 450, 70, 50);

        yesButton = new JButton("YES");
        boundedAdd(yesButton, 450, 450, 70, 50);
    }

    @Override
    protected void event() {
        yesButton.addActionListener((e) -> {
            JOptionPane.showMessageDialog(null, "Berhasil Log Out", "Log Out", JOptionPane.INFORMATION_MESSAGE);
            new GuiHomeFrame().setVisible(true);
            dispose();
        });

        noButton.addActionListener((e) -> {
            new GuiMainMenuFrame().setVisible(true);
            dispose();
        });
    }
}
