package view.cli;

import view.cli.viewmainmenupage.*;
import view.cli.viewconfirmation.CliLogOutConfirmPage;

import java.util.Scanner;
public class CliMainMenuPage {

    private Scanner input = new Scanner(System.in);

    public CliMainMenuPage(){
        initialPage();
    }

    private void initialPage() {
        System.out.println("=========================================");
        System.out.println("--------------- MAIN MENU ---------------");
        System.out.println("=========================================");
        int menu;
        do {
            System.out.println("""
                    1. Info Saldo
                    2. Setor Tunai
                    3. Tarik Tunai
                    4. Transfer
                    5. Mutasi Rekening
                    6. Edit Akun
                    7. Info Akun
                    0. Logout
                    ==========================""");
            System.out.print("Pilih Menu: ");
            menu = input.nextInt();
            input.nextLine();
            System.out.println();
            switchMenu(menu);
        } while (menu != 0);
    }

    private void switchMenu(int menu){
        switch (menu) {
            case 1:
                new CliInfoSaldoPage();
                break;
            case 2:
                new CliSetorTunaiPage();
                break;
            case 3:
                new CliTarikTunaiPage();
                break;
            case 4:
                new CliTransferPage();
                break;
            case 5:
               new CliMutasiRekeningPage();
                break;
            case 6:
                new CliEditAkunPage();
                break;
            case 7:
                new CliInfoAkunPage();
                break;
            case 0:
                new CliLogOutConfirmPage().logOutConfirm();
                break;
            default:
                System.out.println("Menu Tidak valid !");
                break;
        }
    }
}