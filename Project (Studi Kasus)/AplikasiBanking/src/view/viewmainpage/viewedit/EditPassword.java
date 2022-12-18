package view.viewmainpage.viewedit;

import controller.Authentication;

import java.util.Scanner;

public class EditPassword {

    Scanner input = new Scanner(System.in);

    public void editPass(){
        String pass, passbaru;
        System.out.print("Username lama: ");
        pass = input.nextLine();
        System.out.print("Masukkan Username baru : ");
        passbaru = input.nextLine();
        Authentication.editPassword(pass, passbaru);
    }
}
