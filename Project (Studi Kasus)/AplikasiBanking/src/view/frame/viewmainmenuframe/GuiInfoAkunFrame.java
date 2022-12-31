package view.frame.viewmainmenuframe;

import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiInfoAkunFrame extends GuiMainUnitFrame {

    private JLabel titleLabel, icon;

    public GuiInfoAkunFrame(){
        super("INFO AKUN");
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("INFO AKUN");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 265, 35, 246, 100);
    }

    @Override
    protected void event() {

    }
}
