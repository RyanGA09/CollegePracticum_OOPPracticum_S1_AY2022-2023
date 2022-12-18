package view.viewmainpage.viewedit;

import controller.Authentication;

import java.util.Scanner;

public class EditAkunEmail {

    Scanner input = new Scanner(System.in);

    public void editEmail(){
        String email, emailNew;
        System.out.print("Nomor Telpon lama: ");
        email = input.nextLine();
        System.out.print("Masukkan Nomor Telpon baru : ");
        emailNew = input.nextLine();
        Authentication.editEmail(email, emailNew);
    }
}
