class Kubus {
    int sisi;
    public Kubus(int s){
        this.sisi = s;
    }
    float luas() {
        return this.sisi * this.sisi;
    }
}

class Balok {
    float panjang, lebar;
    public Balok(float p, float l) {
        this.panjang = p;
        this.lebar = l;
    }
    float luasBalok () {
        return this.panjang * this.lebar;
    }
}

class Lingkaran {
    double jari;
    public Lingkaran(double r){
        this.jari = r;
    }
    double luasLingkar() {
        return 3.14 * this.jari * this.jari;
    }
}

public class BangunRuang {
    public static void main(String[] args) {
        Kubus nilaiKubus = new Kubus(5);
        Balok nilaiBalok = new Balok(9, 4);
        Lingkaran nilaiLingkaran = new Lingkaran(7);
        System.out.println(nilaiKubus.luas());
        System.out.println(nilaiBalok.luasBalok());
        System.out.println(nilaiLingkaran.luasLingkar());
    }
}