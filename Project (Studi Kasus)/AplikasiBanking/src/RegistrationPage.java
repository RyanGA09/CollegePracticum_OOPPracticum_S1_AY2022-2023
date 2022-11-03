import java.util.Scanner;
public class RegistrationPage {
    private Scanner input = new Scanner(System.in);

    public RegistrationPage(){
        daftar();
    }

    private void daftar(){
        String namaLengkap, nik, noTelpon, username, kodeAkses;

        System.out.println("======BUKA REKENING======");
        System.out.print("Nama: ");
        namaLengkap = input.nextLine();
        System.out.print("NIK: ");
        nik = input.nextLine();
        System.out.print("No. Telepon: ");
        noTelpon = input.nextLine();
        System.out.print("username: ");
        username = input.nextLine();
        System.out.print("Kode Akses: ");
        kodeAkses = input.nextLine();

        User user = new User(namaLengkap, nik, noTelpon, username, kodeAkses);

        System.out.print("Buat pin: ");
        String pin = input.nextLine();

        String noRekening = RandomNumberString.getNumeric(6);
        Rekening rekening = new Rekening(noRekening, pin);
        Bank.tambahUser(user, rekening);

        System.out.println("Berhasil Membuat akun");
    }
}