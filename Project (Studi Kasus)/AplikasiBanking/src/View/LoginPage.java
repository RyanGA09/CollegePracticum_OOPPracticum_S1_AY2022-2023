package View;

import Model.Authentication;

import java.util.Scanner;
public class LoginPage {

    private Scanner input = new Scanner(System.in);

    public LoginPage(){
        login();
    }

    private void login(){
        while (true){
            String username, kodeAkses;
            System.out.println("=========LOGIN=========");
            char pilihan;
            System.out.println("Sudah punya akun?");
            System.out.print("y/n || Y/N: ");
            pilihan = input.next().charAt(0);
            input.nextLine();
            if (pilihan == 'y' || pilihan == 'Y') {
                System.out.print("username: ");
                username = input.nextLine();
                System.out.print("Kode Akses: ");
                kodeAkses = input.nextLine();

                if (Authentication.login(username, kodeAkses)) {
                    System.out.println("---------------");
                    System.out.println("Login Berhasil.");
                    System.out.println("---------------");
                    System.out.println();
                    new MainPage();
                    break;
                } else {
                    loginGagal();
                }
            }
            else {
                new RegistrationPage();
                new LoginPage();
            }
        }
    }

    private void loginGagal() {
        System.out.println("-------------------------------");
        System.out.println("----------LOGIN GAGAL----------");
        System.out.println("Username atau Kode Akses Salah!");
        System.out.println("-------------------------------");
    }
}