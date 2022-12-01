import java.util.ArrayList;
import java.util.Collections;

public class Storage {
    private static ArrayList<Produk> listProduk = new ArrayList<>();

    public static void initialData(){
        initialDataBaju();
        initialDataBuku();
        initialDataLaptop();
        initialDataTelevisi();
    }

    public static void initialDataBaju(){
        Baju baju1 = new Baju("H&B", 250000, "XL", "Putih");
        Baju baju2 = new Baju("Zara", 250000, "L", "Hitam");
        Baju baju3 = new Baju("Dress Channel", 32500, "L", "Biru Kuning");

        listProduk.add(baju1);
        listProduk.add(baju2);
        listProduk.add(baju3);
    }

    public static void initialDataBuku(){
        Buku buku1 = new Buku("Atomic Habits", 70000, 356, "16 Oktober 2018", "James Clear");
        Buku buku2 = new Buku("Filosofi Teras", 88000, 346, "26 November 2018", "Henry ");
        listProduk.add(buku1);
        listProduk.add(buku2);
    }

    public static void initialDataLaptop(){
        Laptop laptop1 = new Laptop("Asus Zenbook 14", 7000000, "Asus", 8, 512, 34, "Perak");
        Laptop laptop2 = new Laptop("Dell XPS 13", 8450000, "Dell", 8, 512, 134, "Putih");
        listProduk.add(laptop2);
        listProduk.add(laptop1);
    }

    public static void initialDataTelevisi(){
        Televisi tv1 = new Televisi("LG Smart LED TV UQ7600pSF SERIES", 3799000, "LG", 43);
        Televisi tv2 = new Televisi("AQUA SMART TV LE32AQT9600G", 1749000, "Aqua", 32);
        listProduk.add(tv1);
        listProduk.add(tv2);
    }

    public static ArrayList<Produk> getListProduk() {
        return getListProduk(false);
    }

    public static ArrayList<Produk> getListProduk (boolean dataTeracak){
        if (dataTeracak == true){
            ArrayList<Produk> pemroduksi = (ArrayList<Produk>) listProduk.clone();
            Collections.shuffle(pemroduksi);
            return pemroduksi;
        }
        else {
            return listProduk;
        }
    }
}
