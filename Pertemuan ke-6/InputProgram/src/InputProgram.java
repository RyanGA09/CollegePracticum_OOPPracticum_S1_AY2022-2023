import java.util.Scanner;

public class InputProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int num = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();
    }
}