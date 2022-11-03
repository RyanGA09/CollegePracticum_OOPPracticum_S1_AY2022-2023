public class Kendaraan {
    String jenis, merek, warna, warna1;
    int kode;

    public Kendaraan(){
    }

    public Kendaraan(String jenis, String merek, int kodeKendaraan){
        this.jenis = jenis;
        this.merek = merek;
        warna = "merah";
        this.kode = kodeKendaraan;

    }

    public Kendaraan(String jenis, String merek, String warna, int kode){
        this.jenis = jenis;
        this.merek = merek;
        this.warna = warna;
        this.kode = kode;
    }

    public void cetakData(){
        System.out.println("jenis: "+jenis);
        System.out.println("Merek: "+merek);
        System.out.println("Warna: "+warna);
        System.out.println("Kode Kendaraan: "+kode);
    }
}
