import java.util.Scanner;

public class DataPegawai {
    public static void main(String[] args) {
        String nama, nip, alamat, noTelepon;
        Scanner input = new Scanner(System.in);
        Data pendataan = new Data(nama, nip, alamat, noTelepon);
        System.out.println("Nama Pegawai: ");
        input.nextLine();
        System.out.println("Nomor Induk Pegawai: ");
        input.nextLine();
        System.out.println("Alamat Pegawai: ");
        input.nextLine();
        System.out.println("Nomor Telepon: ");
        input.nextLine();
    }
}