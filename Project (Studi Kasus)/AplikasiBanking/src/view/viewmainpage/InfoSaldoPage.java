package view.viewmainpage;

import model.Modelling;
import utils.Keuangan;

public class InfoSaldoPage{

    public InfoSaldoPage(){
        infoSaldo();
    }

    private void infoSaldo(){
        System.out.println("----------- INFO SALDO ----------");
        System.out.println("Saldo: ");
        int saldo = Modelling.getuserMasuk().getRekening().getSaldo();
        System.out.println("Rp. "+Keuangan.format(saldo));
        System.out.println("---------------------------------------");
    }
}