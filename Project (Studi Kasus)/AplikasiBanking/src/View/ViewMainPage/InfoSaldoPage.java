package View.ViewMainPage;

import Entity.Uang;
import Model.Authentication;

public class InfoSaldoPage {

    public InfoSaldoPage(){
        infoSaldo();
    }

    private void infoSaldo() {
        System.out.println("-------------- INFO SALDO -------------");

        System.out.println("Entity.Saldo: ");
        int saldo = Authentication.getUserLogged().getRekening().getSaldo();
        System.out.println("Rp. " + Uang.format(saldo));

        System.out.println("---------------------------------------");
    }
}