package View.ViewMainPage.ViewEdit;

import Controller.Authentication;

import java.util.Scanner;

public class EditNoTelpon {

    Scanner input = new Scanner(System.in);

    public void editTelpon(){
        String telpon, telponNew;
        System.out.print("Nomor Telpon lama: ");
        telpon = input.nextLine();
        System.out.print("Masukkan Nomor Telpon baru : ");
        telponNew = input.nextLine();
        Authentication.editNoTelpon(telpon, telponNew);
    }
}
