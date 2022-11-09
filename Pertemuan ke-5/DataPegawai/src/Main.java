import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        Pendataan.initial();
        new Main().cetak();
    }
    public void cetak(){
        String nama, nip, newName, newNip;
        int pilihan;
        do {
            System.out.print("""
                Pilihan Menu:
                1. Lihat Data
                2. Tambah Data
                3. Edit Data
                4. hapus Data
                0. keluar
                """);
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan){
                case 1:
                    System.out.println();
                    Pendataan.cekData();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Nama: ");
                    nama = input.next();
                    System.out.print("NIP: ");
                    nip = input.next();
                    Pendataan.add(nama, nip);
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Cari NIP: ");
                    nip = input.next();
                    System.out.print("Nama Pegawai Baru: ");
                    newName = input.next();
                    System.out.print("NIP Pegawai Baru: ");
                    newNip = input.next();
                    System.out.println("------------------------------------------");
                    Pendataan.edit(nip, newName, newNip);
                    System.out.println("------------------------------------------");
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Cari NIP Pegawai yang Keluar: ");
                    nip = input.next();
                    Pendataan.delete(nip);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Keluar Program...");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!!!");
                    break;
            }
        } while(pilihan != 0);
    }
}