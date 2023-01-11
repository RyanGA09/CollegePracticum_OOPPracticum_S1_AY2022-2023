package view.cli.viewmainmenupage;

import controller.Bank;
import entity.SetorTunai;
import entity.abstraction.Transaksi;
import model.Modelling;
import view.cli.viewconfirmation.CliVerifikasiPin;

import javax.swing.text.View;
import java.util.Scanner;

public class CliSetorTunaiPage {

    Scanner input = new Scanner(System.in);

    public CliSetorTunaiPage(){
        setorTunai();
    }

    private void setorTunai(){
        System.out.println("------------- SETOR SALDO ------------");
        if (new CliVerifikasiPin().pinVerif()) {
            System.out.print("Masukan Nominal Saldo: Rp. ");
            int nominal = input.nextInt();
            input.nextLine();
            new Bank().setorTunai(Modelling.getuserMasuk(), new SetorTunai(nominal, Modelling.getuserMasuk(), Modelling.getuserMasuk()));
        }
        System.out.println("---------------------------------------");
    }
}