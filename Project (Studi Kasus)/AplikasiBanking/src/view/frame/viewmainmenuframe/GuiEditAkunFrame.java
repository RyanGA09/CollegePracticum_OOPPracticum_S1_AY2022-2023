package view.frame.viewmainmenuframe;

import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiEditAkunFrame extends GuiMainUnitFrame {

    private JLabel titleLabel;

    public GuiEditAkunFrame(){
        super("EDIT AKUN");
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("EDIT AKUN");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 265, 35, 246, 100);
    }

    @Override
    protected void event() {

    }
}
