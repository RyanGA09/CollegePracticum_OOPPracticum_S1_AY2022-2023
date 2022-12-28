import jenis.Himalaya;
import jenis.MaineCoon;

public class Main {
    public static void main(String[] args) {
        MaineCoon maineCoon = new MaineCoon("Ciko");
        Himalaya himalaya = new Himalaya("Deno");

        maineCoon.kucing();
        maineCoon.gerakan1();
        maineCoon.kegiatan1();
        maineCoon.sifat();
        System.out.println();
        System.out.println("============================");
        himalaya.kucing();
        himalaya.gerakan2();
        himalaya.kegiatan2();
        himalaya.sifat();
    }
}