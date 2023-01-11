import model.Modelling;
import view.cli.CliHomePage;
import view.frame.GuiHomeFrame;

public class Aplikasi{
    public static void main(String[] args){
        Modelling.initialUser();
//        new CliHomePage();
        new GuiHomeFrame().setVisible(true);
    }
}