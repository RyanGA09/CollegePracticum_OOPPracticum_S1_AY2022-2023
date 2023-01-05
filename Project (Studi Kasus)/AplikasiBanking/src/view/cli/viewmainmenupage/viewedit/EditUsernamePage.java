package view.cli.viewmainmenupage.viewedit;

import controller.Authentication;
import view.cli.CliMainMenuPage;

import java.util.Scanner;

public class EditUsernamePage {

    Scanner input = new Scanner(System.in);

    public void editUser(){
        String usernameNew;
//        System.out.print("Username lama: ");
//        username = input.nextLine();
        System.out.print("Masukkan Username baru : ");
        usernameNew = input.nextLine();
        Authentication.editUsername(usernameNew);
        new CliMainMenuPage();
    }
}
