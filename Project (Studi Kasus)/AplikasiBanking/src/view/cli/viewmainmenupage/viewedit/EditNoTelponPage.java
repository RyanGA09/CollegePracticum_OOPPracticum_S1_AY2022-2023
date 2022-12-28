package view.cli.viewmainmenupage.viewedit;

import controller.Authentication;

import java.util.Scanner;

public class EditNoTelponPage {

    Scanner input = new Scanner(System.in);

    public void editTelpon(){
        String telponNew;
//        System.out.print("Nomor Telpon lama: ");
//        telpon = input.nextLine();
        System.out.print("Masukkan Nomor Telpon baru : ");
        telponNew = input.nextLine();
        Authentication.editNoTelpon(telponNew);
    }
}
