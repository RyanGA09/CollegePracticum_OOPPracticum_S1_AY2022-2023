package View.ViewConfirmation;

import Model.Authentication;

import java.util.Scanner;

public class VerificationPage {

    Scanner input = new Scanner(System.in);

    public char pilihan;

    public VerificationPage(){
        logOutConfirm();
    }

    public void logOutConfirm(){
        System.out.println("Apakah anda benar - benar ingin logout?");
        System.out.print("Y/y atau N/n: ");
        pilihan = input.next().charAt(0);
        Authentication.logOut(pilihan);
    }

    public void exitConfirm(){
        System.out.println("Apakah anda benar - benar ingin keluar aplikasi?");
        System.out.print("Y/y atau N/n: ");
        pilihan = input.next().charAt(0);
        Authentication.exit(pilihan);
    }
}
