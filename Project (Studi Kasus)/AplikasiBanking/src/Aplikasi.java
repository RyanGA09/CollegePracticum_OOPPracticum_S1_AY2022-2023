import model.Modelling;
import view.cli.CliHomePage;
import view.frame.GuiHomeFrame;
import view.frame.GuiMainMenuFrame;
import view.frame.viewconfirmation.GuiExitConfirmFrame;
import view.frame.viewconfirmation.GuiLogOutConfirmFrame;
import view.frame.viewconfirmation.GuiPinConfirmFrame;
import view.frame.viewhomeframe.GuiLoginFrame;
import view.frame.viewhomeframe.GuiRegistrationFrame;
import view.frame.viewmainmenuframe.*;
//import view.StartPage;

public class Aplikasi{
    public static void main(String[] args){
        Modelling.initialUser();
//        new CliHomePage();
//        new StartPage();
//        new GuiLoginFrame().setVisible(true);
//        new GuiRegistrationFrame().setVisible(true);
        new GuiHomeFrame().setVisible(true);
//        new GuiMainMenuFrame().setVisible(true);

//        new GuiSetorTunaiFrame().setVisible(true);
//        new GuiInfoAkunFrame().setVisible(true);
//        new GuiInfoSaldoFrame().setVisible(true);
//        new GuiTarikTunaiFrame().setVisible(true);
//        new GuiTransferTunaiFrame().setVisible(true);
//        new GuiMutasiRekeningFrame().setVisible(true);

//        new GuiLogOutConfirmFrame().setVisible(true);
//        new GuiPinConfirmFrame().setVisible(true);
//        new GuiExitConfirmFrame().setVisible(true);
        /*
        Daftar belum terselesaikan:
        * membuat gagal daftar
        * logika pengaplikasian verifikasi pin untuk setor, tarik, dan transfer frame
        * transfer frame
        * tarik tunai frame
        * setor tunai frame
        * pin verification frame
        * Info Akun Frame
        * */
    }
}