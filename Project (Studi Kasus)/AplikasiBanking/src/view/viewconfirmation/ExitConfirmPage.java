package view.viewconfirmation;

import controller.Authentication;
import view.HomePage;

import java.util.Scanner;

public class ExitConfirmPage {

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
        }
        else if (pilihan == 'N' || pilihan == 'n'){
            System.out.println("================================");
            new HomePage();
        }
    }
}