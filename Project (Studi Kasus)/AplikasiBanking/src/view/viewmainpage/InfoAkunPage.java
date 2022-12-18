package view.viewmainpage;

import entity.User;
import model.Modelling;

public class InfoAkunPage{

    public InfoAkunPage(){
        infoAkun();
    }

    private void infoAkun(){
        User user = Modelling.getuserMasuk();
        System.out.println("----------- INFO AKUN ----------");
        System.out.println("Akun Email   : "+user.getEmail());
        System.out.println("No Rekening  : "+user.getRekening().getNoRekening());
        System.out.println("Nama Lengkap : "+user.getFullname());
        System.out.println("Username     : "+user.getUsername());
        System.out.println("NIK          : "+user.getNik());
        System.out.println("No Telpon    : "+user.getNoTelpon());
        System.out.println("---------------------------------------");
    }
}
