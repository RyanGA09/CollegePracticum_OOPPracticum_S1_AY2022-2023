package view.cli.viewmainmenupage;

import controller.Bank;
import entity.SetorTunai;
import model.Modelling;

import java.util.Scanner;

public class CliSetorTunaiPage {

    Scanner input = new Scanner(System.in);

    public CliSetorTunaiPage(){
        setorTunai();
    }

    private void setorTunai(){
        System.out.println("------------- SETOR SALDO ------------");
        if (Bank.verifikasiPin()) {
            System.out.print("Masukan Nominal Saldo: Rp. ");
            int nominal = input.nextInt();
            input.nextLine();
            Bank.setorTunai(Modelling.getuserMasuk(), new SetorTunai(nominal));
        }
        System.out.println("---------------------------------------");
    }
}