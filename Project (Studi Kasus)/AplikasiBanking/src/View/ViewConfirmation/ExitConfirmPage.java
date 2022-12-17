package View.ViewConfirmation;

import Controller.Authentication;

import java.util.Scanner;

public class ExitConfirmPage {

    Scanner input = new Scanner(System.in);

    char pilihan;

    public void exitConfirm(){
        System.out.println("Apakah anda benar - benar ingin keluar aplikasi?");
        System.out.print("Y/y atau N/n: ");
        pilihan = input.next().charAt(0);
        Authentication.exit(pilihan);
    }
}