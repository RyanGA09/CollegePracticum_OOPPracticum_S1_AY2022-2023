package view.frame.viewmainmenuframe;

import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiInfoSaldoFrame extends GuiMainUnitFrame {

    private JLabel titleLabel;

    public GuiInfoSaldoFrame(){
        super("INFO SALDO");
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("INFO SALDO");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 265, 35, 246, 100);
    }

    @Override
    protected void event() {

    }
}
