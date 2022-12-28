package view.frame.viewhomepage;

import view.frame.GuiPage;

import javax.swing.*;

public class GuiLoginFrame extends GuiPage {
    private JLabel icon;
    private JLabel title;
    private JLabel usernameLabel, passwordLabel;

    private JTextField usernameField;
    private JPasswordField passwordField;

    private JButton loginButton, answerButton;

    public GuiLoginFrame(){
        super("LOGIN", 248, 59);


    }

    @Override
        protected void component(){
//        ImageIcon imageIcon = ;
    }

    @Override
        protected void  event(){
    }
}
