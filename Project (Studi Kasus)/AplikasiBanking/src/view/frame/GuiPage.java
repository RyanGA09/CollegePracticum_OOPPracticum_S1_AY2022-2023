package view.frame;

import javax.swing.*;
import java.awt.*;

import java.io.File;
import java.io.IOException;

public abstract class GuiPage extends JFrame {
    Color background = Color.decode("336644");

    protected String defaultFontName = "Regular";
    protected int defaultFontSize = 45;

    public GuiPage(String title, int width, int height){
        setTitle(title);
        setSize(width,  height);
        setBackground(background);
        setLayout(null);
        setLocation(600, 300);
    }

    @Override
    public void setVisible(boolean b) {
        if(b == true){
            component();
            event();
        }
        super.setVisible(b);
    }

    protected abstract void component();

    protected abstract void event();

    protected ImageIcon loadImage(String path){
        return loadImage(path);
    }
}
