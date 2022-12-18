package view.viewconfirmation;

import controller.Authentication;

import java.util.Scanner;

public class LogOutConfirmPage {

    Scanner input = new Scanner(System.in);

    char pilihan;

    public void logOutConfirm(){
        System.out.println("Apakah anda benar - benar ingin logout?");
        System.out.print("Y/y atau N/n: ");
        pilihan = input.next().charAt(0);
        Authentication.logOut(pilihan);
    }
}