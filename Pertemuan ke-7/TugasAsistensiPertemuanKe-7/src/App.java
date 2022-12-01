import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        App app = new App();
        Storage.initialData();
        app.jalan();
    }

    private void jalan(){
        lihat();
    }

    private void lihat(){
        ArrayList<Produk> macamProduk = Storage.getListProduk(true);

        for(Produk produk : macamProduk){
            if (produk instanceof Baju){
                Baju baju = (Baju) produk;
                baju.cetakBaju();

            } else if (produk instanceof  Buku) {
                Buku buku = (Buku) produk;
                buku.cetakBuku();
            } else if (produk instanceof Laptop) {
                Laptop laptop = (Laptop) produk;
                laptop.cetakLaptop();
            } else {
                System.out.println("===================================");
                System.out.println("Produk yang dipilih tidak terdaftar");
                System.out.println("===================================");
            }
        }
    }
}