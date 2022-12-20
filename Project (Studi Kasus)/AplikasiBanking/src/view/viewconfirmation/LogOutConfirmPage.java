package view.viewconfirmation;

import controller.Authentication;
import view.HomePage;
import view.MainMenuPage;

import java.util.Scanner;

public class LogOutConfirmPage {

    Scanner input = new Scanner(System.in);

    char pilihan;

    public void logOutConfirm(){
        System.out.println("Apakah anda benar - benar ingin logout?");
        System.out.print("Y/y atau N/n: ");
        pilihan = input.next().charAt(0);
        if (pilihan == 'y' || pilihan == 'Y'){
            System.out.println("================================");
            new HomePage();
        }
        else if (pilihan == 'n' || pilihan == 'N'){
            System.out.println("================================");
            new MainMenuPage();
        }
    }
}