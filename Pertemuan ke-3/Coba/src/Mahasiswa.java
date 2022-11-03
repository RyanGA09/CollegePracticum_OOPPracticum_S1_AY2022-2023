//public class AdaYangSalah {
//    int a, b;
//
//    public AdaYangSalah() {
//        this.a = 1;
//        this.b = 2;
//    }
//}

//public class Kucing {
//    String jenisKucing;
//    int umur;
//
//    public Kucing (String jenis, int usia){
//        this.jenisKucing = jenis;
//        umur = usia;
//    }
//}
//
//public class Anjing {
//    String jenisAnjing;
//    int umur;
//
//    public Anjing(){
//        jenisAnjing = "Cihuahua";
//        umur = 5;
//    }
//}

public class Mahasiswa{
    String namaMhs, npm;

    public Mahasiswa(){
        namaMhs = "Agus";
        npm = "06.2021.1.09876";
    }

    public Mahasiswa(String namaMhs, String npm){
        this.namaMhs = namaMhs;
        this.npm = npm;
    }

    public static void main(String[] args){
        String nama = "Ryan", npm = "06.2021.1.07467";
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println(mahasiswa.namaMhs);
        System.out.println(mahasiswa.npm);

        Mahasiswa mahasiswa1 = new Mahasiswa(nama, npm);
        System.out.println(mahasiswa1.namaMhs);
        System.out.println(mahasiswa1.npm);
    }
}
