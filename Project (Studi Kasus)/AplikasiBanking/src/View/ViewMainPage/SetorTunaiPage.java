package View.ViewMainPage;

import Controller.Bank;
import Entity.SetorTunai;
import Model.Modelling;

import java.util.Scanner;

public class SetorTunaiPage{

    Scanner input = new Scanner(System.in);

    public SetorTunaiPage(){
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