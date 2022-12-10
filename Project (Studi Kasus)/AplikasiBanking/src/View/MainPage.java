package View;

import View.ViewMainPage.*;
import View.ViewConfirmation.VerificationPage;

import java.util.Scanner;
public class MainPage {

    private Scanner input = new Scanner(System.in);

    public MainPage() {
        initialPage();
    }

    private void initialPage() {
        System.out.println("=======================================");
        System.out.println("------------- HOME BANKING ------------");
        System.out.println("=======================================");
        int menu;
        do {
            System.out.print("""
                    1. Info Entity.Saldo
                    2. Setor Tunai
                    3. Tarik Tunai
                    4. Entity.Transfer
                    5. Mutasi Entity.Rekening
                    6. Info Akun
                    0. Logout
                    """);
            System.out.print("Pilih Menu: ");
            menu = input.nextInt();
            input.nextLine();

            System.out.println();

            switchMenu(menu);
        } while (menu != 0);
    }

    private void switchMenu(int menu) {
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
                new InfoAkunPage();
                break;
            case 0:
                new VerificationPage().logOutConfirm();
                break;
            default:
                System.out.println("Menu Tidak valid !");
                break;
        }
    }
}