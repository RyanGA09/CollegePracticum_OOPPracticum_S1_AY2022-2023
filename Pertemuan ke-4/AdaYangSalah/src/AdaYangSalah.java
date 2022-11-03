public class AdaYangSalah {

    public static void main(String[] args){
        Segitiga.alas = 10;
        Segitiga.tinggi = 12;

        double luas = Segitiga.luas();
        System.out.println("Luas = "+luas);
    }
}