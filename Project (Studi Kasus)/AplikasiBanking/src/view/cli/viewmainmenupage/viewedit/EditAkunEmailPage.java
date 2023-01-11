package view.cli.viewmainmenupage.viewedit;

import controller.Authentication;
import view.cli.CliMainMenuPage;

import java.util.Scanner;

public class EditAkunEmailPage {

    Scanner input = new Scanner(System.in);

    public void editEmail(){
        String emailNew;
//        System.out.print("Nomor Telpon lama: ");
//        email = input.nextLine();
        System.out.print("Masukkan Nama email baru : ");
        emailNew = input.nextLine();
        new Authentication().editEmail(emailNew);
        new CliMainMenuPage();
    }
}
