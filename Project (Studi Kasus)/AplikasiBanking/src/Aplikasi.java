import model.Modelling;
import view.cli.CliHomePage;
import view.frame.GuiHomeFrame;
import view.frame.GuiMainMenuFrame;
import view.frame.viewconfirmation.GuiExitConfirmFrame;
import view.frame.viewconfirmation.GuiLogOutConfirmFrame;
import view.frame.viewconfirmation.GuiPinConfirmFrame;
import view.frame.viewhomeframe.GuiLoginFrame;
import view.frame.viewhomeframe.GuiRegistrationFrame;
import view.frame.viewmainmenuframe.GuiMutasiRekeningFrame;
//import view.StartPage;

public class Aplikasi{
    public static void main(String[] args){
        Modelling.initialUser();
        new CliHomePage();
        /*new StartPage();*/
//        new GuiLoginFrame().setVisible(true);
//        new GuiRegistrationFrame().setVisible(true);
//        new GuiHomeFrame().setVisible(true);
//        new GuiMainMenuFrame().setVisible(true);
//        new GuiLogOutConfirmFrame().setVisible(true);
//        new GuiPinConfirmFrame().setVisible(true);
//        new GuiExitConfirmFrame().setVisible(true);
//        new GuiMutasiRekeningFrame().setVisible(true);
    }
}