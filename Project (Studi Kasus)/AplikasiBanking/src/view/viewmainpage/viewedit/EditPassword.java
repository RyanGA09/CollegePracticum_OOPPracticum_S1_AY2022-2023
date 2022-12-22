package view.viewmainpage.viewedit;

import controller.Authentication;

import java.util.Scanner;

public class EditPassword {

    Scanner input = new Scanner(System.in);

    public void editPass(){
        String passbaru;
//        System.out.print("Kode Akses lama: ");
//        pass = input.nextLine();
        System.out.print("Masukkan kode akses baru : ");
        passbaru = input.nextLine();
        Authentication.editKodeAkses(passbaru);
    }
}
