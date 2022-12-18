package View;

import View.ViewMainPage.*;
import View.ViewConfirmation.LogOutConfirmPage;

import java.util.Scanner;
public class MainPage{

    private Scanner input = new Scanner(System.in);

    public MainPage(){
        initialPage();
    }

    private void initialPage() {
        System.out.println("=======================================");
        System.out.println("--------------- BANKING ---------------");
        System.out.println("=======================================");
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
                new InfoSaldoPage();
                break;
            case 2:
                new SetorTunaiPage();
                break;
            case 3:
                new TarikTunaiPage();
                break;
            case 4:
                new TransferPage();
                break;
            case 5:
               new MutasiRekeningPage();
                break;
            case 6:
                new EditAkun();
                break;
            case 7:
                new InfoAkunPage();
                break;
            case 0:
                new LogOutConfirmPage().logOutConfirm();
                break;
            default:
                System.out.println("Menu Tidak valid !");
                break;
        }
    }
}