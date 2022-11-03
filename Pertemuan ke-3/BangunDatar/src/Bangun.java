public class Bangun {
    double panjang, lebar, luas;

    public Bangun(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public Bangun(){
        panjang = 0;
        lebar = 0;
    }

    public void nilai(){
        System.out.println("=======================");
        System.out.println("Bangun Persegi Panjang");
        System.out.println("Panjang = "+panjang);
        System.out.println("Lebar = "+lebar);
        System.out.println("=======================");
        luas = panjang * lebar;
        System.out.println("Luas = "+luas);
    }
}
