package controller;

import entity.abstraction.Transaksi;
import entity.Transfer;
import entity.User;
import model.Modelling;

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

    public static boolean pinVerif(String pin){
        if(Authentication.getUserTerdaftar().size() != 0){
            for(User pengguna: Authentication.getUserTerdaftar()){
                if(pengguna.getRekening().getPin().equals(pin)){
                    Modelling.verifikasiPin(pin);
                }
            }
        }
        return true;
    }
}