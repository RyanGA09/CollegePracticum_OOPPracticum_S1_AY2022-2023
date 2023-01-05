package view.frame.viewhomeframe;

import controller.Authentication;
import view.frame.GuiMainMenuFrame;
import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiLoginFrame extends GuiMainUnitFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    private JButton loginButton, answerButton;

    public GuiLoginFrame(){
        super("LOGIN");
    }

    @Override
        protected void component(){
        JLabel titleLabel = new JLabel("LOGIN");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 300, 35, 246, 100);

        ImageIcon image = loadImage("src/Assets/Logo.png", 200, 200);
        JLabel icon = new JLabel(image);
        boundedAdd(icon, 200, 136, 200, 200);
        /*=======================================================*/
        JLabel usernameLabel = new JLabel("username");
        setFontSize(usernameLabel, 30);
        boundedAdd(usernameLabel, 275, 350, 100, 25);

        usernameField = new JTextField();
        boundedAdd(usernameField, 275, 385, 100, 25);
        /*=======================================================*/
        JLabel passwordLabel = new JLabel("password");
        setFontSize(passwordLabel, 30);
        boundedAdd(passwordLabel, 275, 415, 100, 25);

        passwordField = new JPasswordField();
        boundedAdd(passwordField, 275, 450, 100, 25);
        /*=======================================================*/
        JLabel noteLabel = new JLabel("""
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
        answerButton.addActionListener((e) -> new GuiRegistrationFrame().setVisible(true));

         loginButton.addActionListener((e) -> {
             String username = usernameField.getText();
             String password = String.valueOf(passwordField.getPassword());

             boolean status = Authentication.login(username, password);
             if(status){
                new GuiMainMenuFrame().setVisible(true);
                dispose();
             } else {
//                 JOptionPane.showMessageDialog(rootPane, e, password, ABORT)
//                 JOptionPane.showConfirmDialog(null, "Username atau Password salah", "Login gagal", JOptionPane.ERROR_MESSAGE);
                 JOptionPane.showMessageDialog(null, "Username atau Password salah", "Login Gagal", JOptionPane.ERROR_MESSAGE);
             }
         });
    }
}
