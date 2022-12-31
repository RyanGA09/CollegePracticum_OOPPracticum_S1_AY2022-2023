package view.frame.viewconfirmation;

import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiExitConfirmFrame extends GuiMainUnitFrame {

    private JLabel icon, titleLabel, questionLabel;

    private JButton yesButton, noButton;


    public GuiExitConfirmFrame(){
        super("EXIT");
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("EXIT");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 320, 35, 246, 100);

        ImageIcon image = loadImage("src/Assets/Logo.png", 200, 200);
        icon = new JLabel(image);
        boundedAdd(icon, 200, 136, 200, 200);
        /*=======================================================*/
        questionLabel = new JLabel("Are you sure do you want to Exit?");
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
