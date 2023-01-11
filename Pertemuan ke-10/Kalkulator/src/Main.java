import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Operasi: ");
        String angkaStr = input.nextLine();
        String[] inputUser = angkaStr.split(" ");
        try{
            int angka1 = Integer.parseInt(inputUser[0]);
            String operator = inputUser[1];
            int angka2 = Integer.parseInt(inputUser[2]);

            switch (operator){
                case "+":
                    int hasil = angka1 + angka2;
                    System.out.println("hasil "+hasil);
                    break;
                // case ...
            }
        } catch (NumberFormatException numberFormatException){
            System.out.println("Inputan tidak sesuai");
        }
    }
}