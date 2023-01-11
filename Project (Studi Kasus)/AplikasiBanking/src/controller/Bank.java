package controller;

import entity.abstraction.Transaksi;
import entity.Transfer;
import entity.User;
import model.Modelling;

public class Bank{

    public void setorTunai(User pengguna, Transaksi transaksi){
        pengguna.getRekening().tambahTransaksi(transaksi);
        pengguna.getRekening().tambahSaldo(transaksi.getNilaiNominal());
    }

    public boolean tarikTunai(User pengguna, Transaksi transaksi){
        boolean status = pengguna.getRekening().ambilSaldo(transaksi.getNilaiNominal());
        if (status){
            pengguna.getRekening().tambahTransaksi(transaksi);
        }
        return status;
    }

    public boolean transfer(Transaksi transaksi){
        Transfer transfer = (Transfer) transaksi;
        User userAsal = transfer.getUserAsal();
        User userTujuan = transfer.getUserTujuan();
        for (User akunTujuan : Modelling.getUserTerdaftar()){
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

    public boolean pinVerif(String pin){
        if(Modelling.getUserTerdaftar().size() != 0){
            for(User pengguna: Modelling.getUserTerdaftar()){
                if(pengguna.getRekening().getPin().equals(pin)){
                    Modelling.verifikasiPin(pin);
                }
            }
        }
        return true;
    }
}