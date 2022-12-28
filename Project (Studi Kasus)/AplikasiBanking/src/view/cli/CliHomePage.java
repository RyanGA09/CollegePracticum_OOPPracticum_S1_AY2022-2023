package view.cli;

import view.cli.viewconfirmation.CliExitConfirmPage;
import view.cli.viewhomepage.CliLoginPage;
import view.cli.viewhomepage.CliRegistrationPage;

import java.util.Scanner;

public class CliHomePage {

    private Scanner input = new Scanner(System.in);

    public CliHomePage(){
        initialPage();
    }

    private void initialPage(){
        System.out.println("------- BANKING -------");
        int menu;
        do{
            System.out.println("""
                    1. Daftar Rekening
                    2. Login
                    0. Keluar
                    =======================""");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine();
            switchMenu(menu);
        }while (menu != 0);
    }

    private void switchMenu(int menu){
        switch (menu){
            case 1:
                System.out.println("================================");
                new CliRegistrationPage();
                break;
            case 2:
                System.out.println("================================");
                new CliLoginPage();
                break;
            case 0:
                System.out.println("================================");
                new CliExitConfirmPage().exitConfirm();
                break;
            default:
                System.out.println("================================");
                System.out.println("Menu tidak valid");
                System.out.println("================================");
                break;
        }
    }
}