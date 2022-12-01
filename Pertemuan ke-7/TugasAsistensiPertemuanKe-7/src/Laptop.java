public class Laptop extends Produk{
    private String merek, warna;
    private int ram, storage;
    private double ukuranLayar;

    public Laptop(String namaProduk, int harga, String merek, int ram, int penyimpanan, double ukuranLayar, String warna){
        super(namaProduk, harga);
        this.merek = merek;
        this.ram = ram;
        this.storage = penyimpanan;
        this.ukuranLayar = ukuranLayar;
        this.warna = warna;
    }

    public String getMerek() {
        return merek;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public double getUkuranLayar() {
        return ukuranLayar;
    }

    public String getWarna() {
        return warna;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setUkuranLayar(double ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void cetakLaptop(){
        System.out.println("====================================");
        System.out.println("Nama Laptop     : "+namaProduk);
        System.out.println("Merek Laptop    : "+merek);
        System.out.println("Harga Laptop    : "+harga);
        System.out.println("Ukuran Ram      : "+ram);
        System.out.println("Ukuran Storage  : "+storage);
        System.out.println("Warna Laptop    : "+warna);
        System.out.println("Ukuran Layar    : "+ukuranLayar);
        System.out.println("====================================");
    }
}
