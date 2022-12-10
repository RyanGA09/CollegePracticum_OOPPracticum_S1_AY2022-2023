package View.ViewMainPage;

import Controller.Bank;
import Entity.SetorTunai;
import Model.Authentication;

import java.util.Scanner;

public class SetorTunaiPage {

    Scanner input = new Scanner(System.in);

    public SetorTunaiPage(){
        setorTunai();
    }

    private void setorTunai() {

        System.out.println("------------- SETOR  SALDO ------------");

        if (Bank.verifPin()) {
            System.out.print("Masukan Nominal Entity.Saldo: Rp. ");
            int nominal = input.nextInt();
            input.nextLine();

            Bank.setorTunai(Authentication.getUserLogged(), new SetorTunai(nominal));
        }

        System.out.println("---------------------------------------");
    }
}