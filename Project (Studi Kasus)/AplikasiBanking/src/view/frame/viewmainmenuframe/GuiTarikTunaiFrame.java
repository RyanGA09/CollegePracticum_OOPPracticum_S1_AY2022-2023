package view.frame.viewmainmenuframe;

import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiTarikTunaiFrame extends GuiMainUnitFrame {

    private JLabel titleLabel;

    public GuiTarikTunaiFrame(){
        super("PENARIKAN TUNAI");
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("PENARIKAN TUNAI");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 265, 35, 246, 100);
    }

    @Override
    protected void event() {

    }
}
