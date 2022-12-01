public class Baju extends Produk {
    private String ukuran, warna, modelBaju = "Lengan Pendek";

    public Baju(String namaProduk, int harga, String ukuran, String warna){
        super(namaProduk, harga);
        this.ukuran = ukuran;
        this.warna = warna;
    }

    public Baju(String namaProduk, int harga, String ukuran, String warna, String modelBaju){
        super(namaProduk, harga);
        this.ukuran = ukuran;
        this.modelBaju = modelBaju;
        this.warna = warna;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getWarna() {
        return warna;
    }

    public String getModelBaju() {
        return modelBaju;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setModelBaju(String modelBaju) {
        this.modelBaju = modelBaju;
    }

    public void cetakBaju(){
        System.out.println("====================================");
        System.out.println("Nama baju   : "+namaProduk);
        System.out.println("Harga Baju  : "+harga);
        System.out.println("Ukuran Baju : "+ukuran);
        System.out.println("Warna Baju  : "+warna);
        System.out.println("Model Baju  : "+modelBaju);
        System.out.println("====================================");
    }
}
