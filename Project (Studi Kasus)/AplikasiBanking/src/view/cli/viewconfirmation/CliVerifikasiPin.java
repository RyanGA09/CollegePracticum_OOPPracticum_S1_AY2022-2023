package view.cli.viewconfirmation;

import model.Modelling;

import java.util.Scanner;

public class CliVerifikasiPin {

//    private static boolean verif(){
//        Scanner input = new Scanner(System.in);
//        int percobaan = 3;
//        do {
//            percobaan -= 1;
//            System.out.print("Masukan PIN: ");
//            String pin = input.nextLine();
//            boolean status = Bank.pinVerif(pin);
//            if(!status){
//                if (percobaan == 0){
//                    System.out.println("Anda Salah memasukan PIN sebanyak 3x");
//                    return false;
//                }
//                else {
//                    System.out.println("PIN Salah !");
//                }
//            } else{
//                return true;
//            }
//        } while(percobaan != 0);
//        return false;
//    }

    public static boolean pinVerif(){
        Scanner input = new Scanner(System.in);
        int percobaan = 3;
        do {
            percobaan -= 1;
            System.out.print("Masukan PIN: ");
            String pin = input.nextLine();
            boolean status = Modelling.verifikasiPin(pin);
            if (!status) {
                if (percobaan == 0){
                    System.out.println("Anda Salah memasukan PIN sebanyak 3x");
                    return false;
                }
                else{
                    System.out.println("PIN Salah !");

                }
            }
            else{
                return true;
            }
        } while (percobaan != 0);
        return false;
    }
}
