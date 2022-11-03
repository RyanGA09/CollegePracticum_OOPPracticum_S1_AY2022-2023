import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    public void run(){
        Bangun bangun1 = inputData();
        Bangun bangun2 = dataKosong();

        System.out.println();
        System.out.println("Output Nilai Bangun Persegi Panjang");
        bangun1.nilai();
        bangun2.nilai();
    }

    public Bangun inputData(){
        double panjangBangun, lebarBangun;
        System.out.println("Bangun Persegi Panjang");
        System.out.print("Nilai Panjang: ");
        panjangBangun = input.nextDouble();
        System.out.print("Nilai Lebar: ");
        lebarBangun = input.nextDouble();

        Bangun bangun1 = new Bangun(panjangBangun, lebarBangun);
        return bangun1;
    }

    public Bangun dataKosong(){
        Bangun kosong = new Bangun();
        return kosong;
    }

    public static void main(String[] args) {
        Main out = new Main();

        out.run();
    }
}