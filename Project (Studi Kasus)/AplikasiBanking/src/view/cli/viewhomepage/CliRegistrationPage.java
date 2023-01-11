package view.cli.viewhomepage;

import controller.Authentication;
import entity.Rekening;
import entity.User;
import model.Modelling;
import utils.RandomNumberString;

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

            User user = new User(email, namaLengkap, nik, noTelpon, username, kodeAkses);
            Rekening rek = new Rekening(RandomNumberString.getNumeric(6), pin);

            if (new Authentication().tambahUser(user, rek)){
                System.out.println("Berhasil Membuat akun");
            }
            else{
                System.out.println("Gagal Membuat Akun");
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