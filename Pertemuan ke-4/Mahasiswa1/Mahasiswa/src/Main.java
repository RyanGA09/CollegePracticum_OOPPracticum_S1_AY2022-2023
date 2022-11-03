public class Main {
    public static void main(String[] args) {
        Mahasiswa objek1 = new Mahasiswa("Ryan Gading Abdullah", "06.2021.1.07467", 'L', 3);
        Mahasiswa objek2 = new Mahasiswa("Ryan Gading Abdullah", "06.2021.1.07467", 'L', 3);
        Mahasiswa objek3 = new Mahasiswa("Ryan Gading Abdullah", "06.2021.1.07467", 'L', 3);
        Mahasiswa objek4 = new Mahasiswa("Ryan Gading Abdullah", "06.2021.1.07467", 'L', 3);
        Mahasiswa objek5 = new Mahasiswa("Ryan Gading Abdullah", "06.2021.1.07467", 'L', 3);

        System.out.println("=============================");
        objek1.cetak();
        System.out.println("-----------------------------");
        objek2.cetak();
        System.out.println("-----------------------------");
        objek3.cetak();
        System.out.println("-----------------------------");
        objek4.cetak();
        System.out.println("-----------------------------");
        objek5.cetak();
        System.out.println("=============================");
    }
}