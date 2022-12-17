package View.ViewHomePage;

import Controller.Authentication;

import java.util.Scanner;
public class RegistrationPage{

    private Scanner input = new Scanner(System.in);

    public RegistrationPage(){
        daftar();
    }

    private void daftar(){
        String namaLengkap, nik, noTelpon, username, kodeAkses;
        try {
            System.out.println("======BUKA REKENING======");
            example();
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
            System.out.print("Buat pin: ");
            String pin = input.nextLine();
            Authentication.register(namaLengkap, nik, noTelpon, username, kodeAkses, pin);
            System.out.println("Berhasil Membuat akun");
            System.out.println("========================");
        } catch (Exception e){
            System.out.println("Format yang anda masukkan tidak sesuai");
        }
    }
    private void example(){
        System.out.println("""
                Nama: Coba
                NIK: 1234
                No. Telepon: 0987654321
                Username: coba1
                Kode Akses: 0000
                Buat Pin: 0000
                =================================""");
    }
}