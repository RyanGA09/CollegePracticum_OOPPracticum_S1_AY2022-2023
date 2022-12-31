package view.frame.viewhomeframe;

import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiLoginFrame extends GuiMainUnitFrame {

    private JLabel icon, titleLabel, usernameLabel, passwordLabel, noteLabel;

    private JTextField usernameField;
    private JPasswordField passwordField;

    private JButton loginButton, answerButton;

    public GuiLoginFrame(){
        super("LOGIN");
    }

    @Override
        protected void component(){
        titleLabel = new JLabel("LOGIN");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 300, 35, 246, 100);

        ImageIcon image = loadImage("src/Assets/Logo.png", 200, 200);
        icon = new JLabel(image);
        boundedAdd(icon, 200, 136, 200, 200);
        /*=======================================================*/
        usernameLabel = new JLabel("username");
        setFontSize(usernameLabel, 30);
        boundedAdd(usernameLabel, 275, 325, 246, 100);

        usernameField = new JTextField();
        boundedAdd(usernameField, 275, 400, 100, 25);

        passwordLabel = new JLabel("password");
        setFontSize(passwordLabel, 30);
        boundedAdd(passwordLabel, 275, 425, 100, 25);

        passwordField = new JPasswordField();
        boundedAdd(passwordField, 275, 455, 100, 25);
        /*=======================================================*/
        noteLabel = new JLabel("""
                Don’t Have\s
                an Account?""");
        setFontSize(noteLabel, 15);
        boundedAdd(noteLabel, 65, 480, 125, 100);

        answerButton = new JButton("YES");
        boundedAdd(answerButton, 100, 550, 50, 50);

        loginButton = new JButton("LOGIN");
        boundedAdd(loginButton, 500, 550, 50, 50);

    }

    @Override
        protected void  event(){
    }
}
