package view.cli.viewconfirmation;

//import view.StartPage;
import view.cli.CliHomePage;

import java.util.Scanner;

public class CliExitConfirmPage {

    Scanner input = new Scanner(System.in);

    char pilihan;

    public void exitConfirm(){
        System.out.println("Apakah anda benar - benar ingin keluar aplikasi?");
        System.out.print("Y/y atau N/n: ");
        pilihan = input.next().charAt(0);
        if (pilihan == 'Y' || pilihan == 'y'){
            System.out.println("================================");
            System.out.println("-----Keluar Aplikasi-----");
            System.out.println("Terima kasih Kunjungannya");
//            new StartPage();
        }
        else if (pilihan == 'N' || pilihan == 'n'){
            System.out.println("================================");
            new CliHomePage();
        }
    }
}