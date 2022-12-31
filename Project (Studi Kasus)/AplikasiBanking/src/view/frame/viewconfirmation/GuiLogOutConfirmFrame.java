package view.frame.viewconfirmation;

import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiLogOutConfirmFrame extends GuiMainUnitFrame {

    private JLabel icon, titleLabel, questionLabel;

    private JButton yesButton, noButton;

    public GuiLogOutConfirmFrame(){
        super("LOGOUT");
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("LOGOUT");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 300, 35, 246, 100);

        ImageIcon image = loadImage("src/Assets/Logo.png", 200, 200);
        icon = new JLabel(image);
        boundedAdd(icon, 200, 136, 200, 200);
        /*=======================================================*/
        questionLabel = new JLabel("Are you sure do you want to Logout?");
        setFontSize(questionLabel, 20);
        boundedAdd(questionLabel, 185, 350, 450, 100);

        yesButton = new JButton("NO");
        boundedAdd(yesButton, 150, 450, 70, 50);

        noButton = new JButton("YES");
        boundedAdd(noButton, 450, 450, 70, 50);
    }

    @Override
    protected void event() {

    }
}
