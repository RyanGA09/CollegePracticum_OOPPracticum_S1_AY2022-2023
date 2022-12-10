package View.ViewMainPage;

import Entity.User;
import Model.Authentication;

public class InfoAkunPage {

    public InfoAkunPage(){
        infoAkun();
    }

    private void infoAkun() {
        User user = Authentication.getUserLogged();
        System.out.println("-------------- INFO  AKUN -------------");
        System.out.println("No Entity.Rekening     : " + user.getRekening().getNoRekening());
        System.out.println("Nama Lengkap           : " + user.getFullname());
        System.out.println("Username               : " + user.getUsername());
        System.out.println("NIK                    : " + user.getNik());
        System.out.println("No Telp                : " + user.getNoTelpon());
        System.out.println("---------------------------------------");
    }
}
