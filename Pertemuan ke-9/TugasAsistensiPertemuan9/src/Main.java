import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sisi1, sisi2;

        System.out.print("Masukkan nilai sisi persegi = ");
        sisi1 = input.nextDouble();
        System.out.print("masukkan nilai sisi kubus = ");
        sisi2 = input.nextDouble();
        System.out.println("============================");
        Persegi persegi = new Persegi(sisi1);
        Kubus kubus = new Kubus(sisi2);
        System.out.println("Luas Persegi = "+persegi.luas(sisi1));
        System.out.println("keliling Persegi = "+persegi.keliling(sisi1));
        System.out.println("===========================");
        System.out.println("Luas Kubus = "+kubus.luas(sisi2));
        System.out.println("keliling Kubus = "+kubus.keliling(sisi2));
        System.out.println("Volume Kubus = "+kubus.volume(sisi2));

    }
}