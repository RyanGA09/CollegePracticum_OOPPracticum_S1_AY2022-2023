package view.cli.viewhomepage;

import model.Modelling;

import java.util.Scanner;
public class CliRegistrationPage {

    private Scanner input = new Scanner(System.in);

    public CliRegistrationPage(){
        daftar();
    }

    private void daftar(){
        String email, namaLengkap, nik, noTelpon, username, kodeAkses;
        try {
            System.out.println("======BUKA REKENING======");
            example();
            System.out.print("Email: ");
            email = input.nextLine();
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

            if (Modelling.failed(email, namaLengkap, nik, noTelpon, username, kodeAkses)){
                System.out.println("Gagal Membuat Akun");
            }
            else{
                Modelling.register(email, namaLengkap, nik, noTelpon, username, kodeAkses, pin);
                System.out.println("Berhasil Membuat akun");
            }


            System.out.println("========================");
        } catch (Exception e){
            System.out.println("Format yang anda masukkan tidak sesuai");
        }
    }
    private void example(){
        System.out.println("""
                Akun: akun1
                Nama: Coba
                NIK: 1234
                No. Telepon: 0987654321
                Username: coba1
                Kode Akses: 0000
                Buat Pin: 0000
                =================================""");
    }
}