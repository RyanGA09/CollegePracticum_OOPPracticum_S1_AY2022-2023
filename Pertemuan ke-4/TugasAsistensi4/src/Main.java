import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String nama, kelamin, alamat, warna, jenis, merek;
        int nip, kode;
        char pilihan;
        Scanner input = new Scanner(System.in);

        System.out.println("Kepemilikan kendaraan");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("NIP: ");
        nip = input.nextInt();
        input.nextLine();
        System.out.print("Kelamin: ");
        kelamin = input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        System.out.print("Apakah mempunyai kendaraan (Y/ T): ");
        pilihan = input.nextLine().charAt(0);
        if (pilihan == 'y' || pilihan == 'Y'){
            System.out.print("jenis kendaraan: ");
            jenis = input.nextLine();
            System.out.print("Merek kendaraan: ");
            merek = input.nextLine();
            System.out.print("Warna kendaraan: ");
            warna = input.nextLine();
            System.out.print("Kode kendaraan: ");
            kode = input.nextInt();
            input.nextLine();
            System.out.println();
            System.out.println("==================================");
            Kendaraan kendaraan3 = new Kendaraan(jenis, merek, warna, kode);
            DataPegawai pegawai3 = new DataPegawai(nama, nip, kelamin, alamat, kendaraan3);
            pegawai3.printData();
        }
        else if (pilihan == 't' || pilihan == 'T'){
            System.out.println("==================================");
            DataPegawai pegawai3 = new DataPegawai(nama, nip, kelamin, alamat);
            pegawai3.printData();
        }

//        DataPegawai pegawai1 = new DataPegawai("Alvin", 67424, "Laki - laki", "Griya Taman Asri");
//        pegawai1.printData();
//
//        Object kendaraanPegawai2 = new Kendaraan("Mobil", "Nissan", "hitam", 2154);
//        Kendaraan kendaraan2 = (Kendaraan) kendaraanPegawai2;
//
//        Object infopegawai2 = new DataPegawai("Alan", 65023, "Laki - laki", "Graha Agung", kendaraan2);
//        DataPegawai pegawai2 = (DataPegawai) infopegawai2;
//        pegawai2.printData();
//
//        pegawai1.beliKendaraan(new Kendaraan("Sepeda", "Yamaha",7402));
//        pegawai1.printData();
    }
}