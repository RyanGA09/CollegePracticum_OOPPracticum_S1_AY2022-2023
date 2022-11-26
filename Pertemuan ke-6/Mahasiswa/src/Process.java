import java.util.Scanner;

public class Process {
    Scanner input = new Scanner(System.in);
    Akademik auth = new Akademik();
    public void cetak(){
        String nama, npm;
        int pilihan;
        do {
            System.out.print("""
                Pilihan Menu:
                1. Tambah Data
                2. Filter Data
                3. Cari Data
                4. keluar
                """);
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();
            System.out.println();
            System.out.println("-------------------------------");
            switch (pilihan){
                case 1:
                    System.out.print("Nama: ");
                    nama = input.next();
                    System.out.print("NPM: ");
                    npm = input.next();
                    auth.add(nama, npm);
                    System.out.println();
                    System.out.println("-------------------------------");
                    break;
                case 2:
                    System.out.print("""
                            Ingin filter berdasarkan nama atau npm?
                            1. nama
                            2. npm
                            """);
                    System.out.print("Pilih: ");
                    pilihan = input.nextInt();
                    System.out.println();
                    if(pilihan == 1){
                        input.nextLine();
                        System.out.print("Filter Nama: ");
                        nama = input.nextLine();
                        for (Mahasiswa mahasiswa: auth.filterMahasiswabyName(nama)){
                            System.out.println(mahasiswa.getNama());
                            System.out.println(mahasiswa.getNpm());
                        }
                        System.out.println();
                        System.out.println("-------------------------------");
                        break;
                    }
                    else if(pilihan == 2){
                        System.out.print("Filter NPM: ");
                        npm = input.next();
                        for (Mahasiswa mahasiswa: auth.filterMahasiswabyNpm(npm)){
                            System.out.println(mahasiswa.getNama());
                            System.out.println(mahasiswa.getNpm());
                        }
                        System.out.println();
                        System.out.println("-------------------------------");
                        break;
                    }
                    break;
                case 3:
                    System.out.print("""
                            Ingin cari berdasarkan nama atau npm?
                            1. nama
                            2. npm
                            """);
                    System.out.print("Pilih: ");
                    pilihan = input.nextInt();
                    input.nextLine();
                    System.out.println();
                    if(pilihan == 1){
                        System.out.print("Cari Nama: ");
                        nama = input.nextLine();
                        System.out.println(auth.findMahasiswabyName(nama).getNama());
                        System.out.println(auth.findMahasiswabyName(nama).getNpm());
                        System.out.println();
                        System.out.println("-------------------------------");
                        break;
                    }
                    else if(pilihan == 2){
                        System.out.print("Cari NPM: ");
                        npm = input.next();
                        System.out.println(auth.findMahasiswabyNpm(npm).getNama());
                        System.out.println(auth.findMahasiswabyNpm(npm).getNpm());
                        System.out.println();
                        System.out.println("-------------------------------");
                        break;
                    }
                    break;
                case 4:
                    System.out.println("=================");
                    System.out.println("Keluar Program...");
                    System.out.println("=================");
                    break;
                default:
                    System.out.println("======================");
                    System.out.println("Menu tidak tersedia!!!");
                    System.out.println("======================");
                    System.out.println();
                    System.out.println("-------------------------------");
                    break;
            }
        } while(pilihan != 4);
    }
}
