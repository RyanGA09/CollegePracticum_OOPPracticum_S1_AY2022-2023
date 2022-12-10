package View;

import Model.Authentication;
import View.ViewConfirmation.VerificationPage;

import java.util.Scanner;

public class HomePage {

    private Scanner input = new Scanner(System.in);

    public HomePage(){
        initialPage();
    }

    private void initialPage(){
        System.out.println("------- BANKING -------");
        int menu;
        do {
            System.out.println("""
                    1. Login
                    2. Daftar Rekening
                    3. Keluar
                    """);
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine();
            switchMenu(menu);
        }while (menu != 3);
    }

    private void switchMenu(int menu){
        switch (menu){
            case 1:
                new LoginPage();
                break;
            case 2:
                new RegistrationPage();
                break;
            case 3:
                new VerificationPage().exitConfirm();
                break;
        }
    }
}