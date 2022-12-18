package view.viewmainpage;

import view.MainMenuPage;
import view.viewmainpage.viewedit.EditAkunEmail;
import view.viewmainpage.viewedit.EditNoTelpon;
import view.viewmainpage.viewedit.EditPassword;
import view.viewmainpage.viewedit.EditUsername;

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
                new MainMenuPage();
            default:
                System.out.println("Menu tidak valid");;
                break;
        }
    }
}
