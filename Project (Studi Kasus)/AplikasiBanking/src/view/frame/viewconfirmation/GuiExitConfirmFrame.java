package view.frame.viewconfirmation;

import view.frame.GuiHomeFrame;
import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiExitConfirmFrame extends GuiMainUnitFrame {

    private JButton yesButton, noButton;


    public GuiExitConfirmFrame(){
        super("EXIT");
    }

    @Override
    protected void component() {
        JLabel titleLabel = new JLabel("EXIT");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 320, 35, 246, 100);

        ImageIcon image = loadImage("src/Assets/Logo.png", 200, 200);
        JLabel icon = new JLabel(image);
        boundedAdd(icon, 200, 136, 200, 200);
        /*=======================================================*/
        JLabel questionLabel = new JLabel("Are you sure do you want to Exit?");
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
            JOptionPane.showMessageDialog(null, """
                    --------------Keluar Aplikasi-----------
                    Terima Kasih Atas Kunjungannya
                    ----------------------------------------------""", "Keluar", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        });

        noButton.addActionListener((e) -> {
            new GuiHomeFrame().setVisible(true);
            dispose();
        });
    }
}
