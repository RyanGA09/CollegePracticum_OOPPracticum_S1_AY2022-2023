package view.frame.viewmainmenuframe;

import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import java.awt.*;

public class GuiMutasiRekeningFrame extends GuiMainUnitFrame {

    private JLabel titleLabel;

    public GuiMutasiRekeningFrame(){
        super("MUTASI");
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("MUTASI");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 265, 35, 246, 100);
    }

    @Override
    protected void event() {

    }
}
