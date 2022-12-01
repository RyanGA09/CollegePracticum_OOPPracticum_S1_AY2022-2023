package Controller;

import Entity.Transaksi;
import Entity.Transfer;
import Entity.User;
import Entity.Rekening;

import java.util.ArrayList;

public class Bank {
    static ArrayList<User> userTerdaftar = new ArrayList<User>();

//  static Entity.User userTerdaftar = null;

//    public static Entity.User getUserTerdaftar(){
//        return userTerdaftar;
//    }

    public static ArrayList<User> getUserTerdaftar() {
        return userTerdaftar;
    }

    public static boolean tambahUser(User akunBaru, Rekening rekening){
        if(userTerdaftar.size() != 0){
            for (User pengguna: userTerdaftar){
                if ((pengguna.getNik().equals(akunBaru.getNik())) || (pengguna.getNoTelpon().equals(akunBaru.getNoTelpon()))){
                    return false;
                }
            }
        }
        akunBaru.buatRekening(rekening);
        userTerdaftar.add(akunBaru);
        return true;
    }


    public static void setorTunai(User pengguna, Transaksi transaksi){
        pengguna.getRekening().tambahTransaksi(transaksi);
        pengguna.getRekening().tambahSaldo(transaksi.getNilaiNominal());
    }

    public static boolean tarikTunai(User pengguna, Transaksi transaksi){
        boolean status = pengguna.getRekening().ambilSaldo(transaksi.getNilaiNominal());
        if (status) {
            pengguna.getRekening().tambahTransaksi(transaksi);
        }
        return status;
    }

    public static boolean transfer(Transaksi transaksi){
        Transfer transfer = (Transfer) transaksi;
        User userAsal = transfer.getUserAsal();
        User userTujuan = transfer.getUserTujuan();

        for (User akunTujuan : userTerdaftar) {
            if (akunTujuan.getIdUser() == userTujuan.getIdUser()) {
                userTujuan.getRekening().tambahTransaksi(transfer);
                userTujuan.getRekening().tambahSaldo(transfer.getNilaiNominal());

                userAsal.getRekening().tambahTransaksi(transfer);
                userAsal.getRekening().ambilSaldo(transfer.getNilaiNominal());
                return true;
            }
        }
        return false;
    }

//    public static boolean VerifTransaction(){
//
//    }

    public static int cekSaldo(User pengguna) {
        return pengguna.getRekening().getSaldo();
    }
}
