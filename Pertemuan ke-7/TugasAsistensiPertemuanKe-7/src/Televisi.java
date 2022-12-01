public class Televisi extends Produk{
    private String merek;
    private int ukuranLayar;

    public Televisi(String namaProduk, int harga, String merek, int ukuranLayar){
        super(namaProduk, harga);
        this.merek = merek;
        this.ukuranLayar = ukuranLayar;
    }

    public String getMerek() {
        return merek;
    }

    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public void cetakTelevisi(){
        System.out.println("====================================");
        System.out.println("Nama Televisi   : "+namaProduk);
        System.out.println("Harga Televisi  : "+harga);
        System.out.println("Ukuran Layar : "+ukuranLayar);
        System.out.println("====================================");
    }
}
