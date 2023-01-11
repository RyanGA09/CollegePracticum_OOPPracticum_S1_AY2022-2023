package view.cli.viewmainmenupage.viewedit;

import controller.Authentication;
import view.cli.CliMainMenuPage;

import java.util.Scanner;

public class EditPasswordPage {

    Scanner input = new Scanner(System.in);

    public void editPass(){
        String passbaru;
//        System.out.print("Kode Akses lama: ");
//        pass = input.nextLine();
        System.out.print("Masukkan kode akses baru : ");
        passbaru = input.nextLine();
        new Authentication().editKodeAkses(passbaru);
        new CliMainMenuPage();
    }
}
