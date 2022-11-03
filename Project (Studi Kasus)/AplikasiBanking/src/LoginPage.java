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
            System.out.print("username: ");
            username = input.nextLine();
            System.out.print("Kode Akses: ");
            kodeAkses = input.nextLine();

            if (Authentication.login(username, kodeAkses)){
                System.out.println("Login Berhasil.");
                break;
            } else {
                loginGagal();
            }
        }
    }
    private void loginGagal(){
        System.out.println("-------------------------------");
        System.out.println("----------LOGIN GAGAL----------");
        System.out.println("Username atau Kode Akses Salah!");
        System.out.println("-------------------------------");
    }
}