package view;

import view.viewconfirmation.ExitConfirmPage;
import view.viewhomepage.LoginPage;
import view.viewhomepage.RegistrationPage;

import java.util.Scanner;

public class HomePage{

    private Scanner input = new Scanner(System.in);

    public HomePage(){
        initialPage();
    }

    private void initialPage(){
        System.out.println("------- BANKING -------");
        int menu;
        do{
            System.out.println("""
                    1. Daftar Rekening
                    2. Login
                    0. Keluar
                    =======================""");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine();
            switchMenu(menu);
        }while (menu != 0);
    }

    private void switchMenu(int menu){
        switch (menu){
            case 1:
                System.out.println("================================");
                new RegistrationPage();
                break;
            case 2:
                System.out.println("================================");
                new LoginPage();
                break;
            case 0:
                System.out.println("================================");
                new ExitConfirmPage().exitConfirm();
                break;
            default:
                System.out.println("Menu tidak valid");
                break;
        }
    }
}