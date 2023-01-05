package view.frame;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import java.io.IOException;
import java.io.File;

public abstract class GuiMainUnitFrame extends JFrame {
    protected Color background = Color.decode("#F5F5F5");
    Color primaryColor = Color.decode("#336644");
    Color secondaryColor = Color.decode("#D9D9D9");

    protected String defaultFontName = "Times New Roman";
    protected int defaultFontSize = 45;

    public GuiMainUnitFrame(String title){
        setTitle(title);
        setSize(700, 700);
        setBackground(background);
        setLayout(null);
        setLocation(450, 75);
        setResizable(false);
//        setIconImage();
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

    protected void setFontStyle(Component comp, int style) {
        Font fontLama = comp.getFont();
        Font fontBaru = new Font(fontLama.getFontName(), style, fontLama.getSize());
        comp.setFont(fontBaru);
    }

    protected void setFontSize(Component comp, int size) {
        Font fontLama = comp.getFont();
        Font fontBaru = new Font(fontLama.getFontName(), fontLama.getStyle(), size);
        comp.setFont(fontBaru);
    }

    protected void setFontFamily(Component comp, String fontFamily) {
        Font fontLama = comp.getFont();
        Font fontBaru = new Font(fontFamily, fontLama.getStyle(), fontLama.getSize());
        comp.setFont(fontBaru);
    }

    protected ImageIcon loadImage(String imagePath){
        return loadImage(imagePath, 150, 150);
    }

    protected ImageIcon loadImage(String imagePath, int width, int height){
        try{
            BufferedImage bImage;
            Image imageSize;
            ImageIcon imageIcon = null;
            bImage = ImageIO.read(new File(imagePath));

            imageSize = bImage.getScaledInstance(
                    width, height,
                    Image.SCALE_SMOOTH);

            imageIcon = new ImageIcon(imageSize);

            return imageIcon;
        }catch (IOException ex) {
            return null;
        }
    }

    protected void boundedAdd(Component comp, int x, int y, int width, int height){
        int constantX = 15, constantY = 55;
        x = x - (constantX/2);
        y = y - (constantY/2);
        width = width + (width/2);
        comp.setBounds(x, y, width, height);
        add(comp);
    }

    protected Color color(String code) {
        return Color.decode(code);
    }
}
