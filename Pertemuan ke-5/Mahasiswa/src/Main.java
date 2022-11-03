import java.util.ArrayList;
//import java.util.List;

public class Main {
    ArrayList<Mahasiswa> data = new ArrayList<>();

    public void cetak(){
        for (Mahasiswa datum : data) {
            System.out.println(datum.nama);
            System.out.println(datum.npm);
        }
    }
    public static void main(String[] args) {

        Mahasiswa mahasiswa = new Mahasiswa("Ryan", "06.2021.1.07467");
        Mahasiswa mahasiswa1 = new Mahasiswa("Mutiara", "07.2020.1.08573");
        Mahasiswa mahasiswa2 = new Mahasiswa("Alan", "02.2021.1.06789");
        Main objek = new Main();
        objek.data.add(mahasiswa);
        objek.data.add(mahasiswa1);
        objek.data.add(mahasiswa2);
        objek.cetak();
    }
}