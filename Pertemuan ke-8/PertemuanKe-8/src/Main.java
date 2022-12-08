import Kampus.Mahasiswa;
import Kampus.*;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Ryan Gading Abdullah");
        Dosen dosen1 = new Dosen("Farida, S.Kom., M.Kom");
        Kampus.Mahasiswa mahasiswa2 = new Mahasiswa("Mutiara");

        mahasiswa1.cetak();
        dosen1.view();
        mahasiswa2.cetak();
    }
}