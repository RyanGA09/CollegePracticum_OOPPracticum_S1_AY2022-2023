package View.ViewMainPage;

import Controller.Authentication;
import View.MainPage;
import View.ViewConfirmation.LogOutConfirmPage;
import View.ViewMainPage.ViewEdit.EditAkunEmail;
import View.ViewMainPage.ViewEdit.EditNoTelpon;
import View.ViewMainPage.ViewEdit.EditPassword;
import View.ViewMainPage.ViewEdit.EditUsername;

import java.util.Scanner;

public class EditAkun {
    Scanner input = new Scanner(System.in);

    public EditAkun(){
        edit();
    }

    public void edit(){
        int menu;
        do{
            System.out.println("""
                pilihan menu edit:
                1. Akun Email
                2. Username
                3. Nomor Telepon
                4. Password
                0. Return MainPage
                ======================""");
            System.out.print("masukkan pilihan : ");
            menu = input.nextInt();
            switchMenu(menu);
        } while (menu != 0);
    }

    public void switchMenu(int menu){
        switch (menu){
            case 1:
                new EditAkunEmail().editEmail();
                break;
            case 2:
                new EditUsername().editUser();
                break;
            case 3:
                new EditNoTelpon().editTelpon();
                break;
            case 4:
                new EditPassword().editPass();
                break;
            case 5:
                new MainPage();
            default:
                System.out.println("Menu tidak valid");;
                break;
        }
    }
}
