package view.cli.viewmainmenupage;

import view.cli.CliMainMenuPage;
import view.cli.viewmainmenupage.viewedit.EditAkunEmailPage;
import view.cli.viewmainmenupage.viewedit.EditPasswordPage;
import view.cli.viewmainmenupage.viewedit.EditUsernamePage;

import java.util.Scanner;

public class CliEditAkunPage {
    Scanner input = new Scanner(System.in);

    public CliEditAkunPage(){
        edit();
    }

    public void edit(){
        int menu;
        do{
            System.out.println("""
                pilihan menu edit:
                1. Akun Email
                2. Username
                3. Password
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
                new EditAkunEmailPage().editEmail();
                break;
            case 2:
                new EditUsernamePage().editUser();
                break;
            case 3:
                new EditPasswordPage().editPass();
                break;
            case 4:
                new CliMainMenuPage();
                break;
            default:
                System.out.println("Menu tidak valid");;
                break;
        }
    }
}
