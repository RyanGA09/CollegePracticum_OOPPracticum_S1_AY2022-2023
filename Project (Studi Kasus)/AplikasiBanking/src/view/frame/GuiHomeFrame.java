package view.frame;

import view.frame.viewconfirmation.GuiExitConfirmFrame;
import view.frame.viewhomeframe.GuiLoginFrame;
import view.frame.viewhomeframe.GuiRegistrationFrame;

import javax.swing.*;
import java.awt.*;

public class GuiHomeFrame extends GuiMainUnitFrame {

    private JButton loginButton, exitButton, registButton;
    public GuiHomeFrame(){
        super("HOME");
    }
    @Override
    protected void component() {

        JLabel titleLabel = new JLabel("HOME");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 300, 35, 246, 100);

        ImageIcon image = loadImage("src/Assets/Logo.png", 200, 200);
        JLabel icon = new JLabel(image);
        boundedAdd(icon, 200, 136, 200, 200);
        /*=======================================================*/
        registButton = new JButton("REGISTER");
        setFontSize(registButton, 20);
        boundedAdd(registButton, 200, 375, 200, 50);

        loginButton = new JButton("LOGIN");
        setFontSize(loginButton, 20);
        boundedAdd(loginButton, 200, 450, 200, 50);

        exitButton = new JButton("EXIT");
        setFontSize(exitButton, 20);
        boundedAdd(exitButton, 200, 525, 200, 50);
        /*=======================================================*/
    }

    @Override
    protected void event() {
        registButton.addActionListener((e) -> {
            new GuiRegistrationFrame().setVisible(true);
            dispose();
        });

        loginButton.addActionListener((e) -> {
            new GuiLoginFrame().setVisible(true);
            dispose();
        });

        exitButton.addActionListener((e) -> {
            new GuiExitConfirmFrame().setVisible(true);
            dispose();
        });
    }
}
