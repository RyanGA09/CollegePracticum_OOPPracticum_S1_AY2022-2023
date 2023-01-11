package view.cli.viewconfirmation;

import view.cli.CliHomePage;

import java.util.Scanner;

public class CliExitConfirmPage {

    Scanner input = new Scanner(System.in);

    public CliExitConfirmPage(){
        exitConfirm();
    }

    private void exitConfirm(){
        char pilihan;
        System.out.println("Apakah anda benar - benar ingin keluar aplikasi?");
        System.out.print("Y/y atau N/n: ");
        pilihan = input.next().charAt(0);
        if (pilihan == 'y' || pilihan == 'Y'){
            System.out.println("================================");
            System.out.println("-----Keluar Aplikasi-----");
            System.out.println("Terima kasih Kunjungannya");
            System.out.println("-------------------------");
            System.exit(0);
        }
        else if (pilihan == 'N' || pilihan == 'n'){
            System.out.println("================================");
            new CliHomePage();
        }
    }
}