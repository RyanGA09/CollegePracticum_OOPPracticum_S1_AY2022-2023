package Controller;

import Entity.Mother.Transaksi;
import Entity.Transfer;
import Entity.User;
import Model.Modelling;

import java.util.Scanner;

public class Bank{


    public static void setorTunai(User pengguna, Transaksi transaksi){
        pengguna.getRekening().tambahTransaksi(transaksi);
        pengguna.getRekening().tambahSaldo(transaksi.getNilaiNominal());
    }

    public static boolean tarikTunai(User pengguna, Transaksi transaksi){
        boolean status = pengguna.getRekening().ambilSaldo(transaksi.getNilaiNominal());
        if (status){
            pengguna.getRekening().tambahTransaksi(transaksi);
        }
        return status;
    }

    public static boolean transfer(Transaksi transaksi){
        Transfer transfer = (Transfer) transaksi;
        User userAsal = transfer.getUserAsal();
        User userTujuan = transfer.getUserTujuan();
        for (User akunTujuan : Authentication.getUserTerdaftar()){
            if (akunTujuan.getEmail().equals(userTujuan.getEmail())){
                userTujuan.getRekening().tambahTransaksi(transfer);
                userTujuan.getRekening().tambahSaldo(transfer.getNilaiNominal());
                userAsal.getRekening().tambahTransaksi(transfer);
                userAsal.getRekening().ambilSaldo(transfer.getNilaiNominal());
                return true;
            }
        }
        return false;
    }

    public static boolean verifikasiPin(){
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