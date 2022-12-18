package View.ViewMainPage.ViewEdit;

import Controller.Authentication;

import java.util.Scanner;

public class EditUsername {

    Scanner input = new Scanner(System.in);

    public void editUser(){
        String username, usernameNew;
        System.out.print("Username lama: ");
        username = input.nextLine();
        System.out.print("Masukkan Username baru : ");
        usernameNew = input.nextLine();
        Authentication.editUsername(username, usernameNew);
    }
}
