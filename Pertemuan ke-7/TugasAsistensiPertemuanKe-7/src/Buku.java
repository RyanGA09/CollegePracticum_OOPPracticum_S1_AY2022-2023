public class Buku extends Produk{
    private int jumlahHalaman;
    private String tahunTerbit, namaPenulis;

    public Buku(String namaProduk, int harga, int jumlahHalaman, String tahunTerbit, String namaPenulis){
        super(namaProduk, harga);
        this.jumlahHalaman = jumlahHalaman;
        this.tahunTerbit = tahunTerbit;
        this.namaPenulis = namaPenulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setNamaPenulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    public void cetakBuku(){
        System.out.println("====================================");
        System.out.println("Nama buku     : "+namaProduk);
        System.out.println("Harga Buku     : "+harga);
        System.out.println("Jumlah Halaman : "+jumlahHalaman);
        System.out.println("Tahun terbit   : "+tahunTerbit);
        System.out.println("Penulis        : "+namaPenulis);
        System.out.println("====================================");
    }
}
