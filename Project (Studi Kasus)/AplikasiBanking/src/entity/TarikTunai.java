package entity;

import entity.abstraction.Transaksi;

public class TarikTunai extends Transaksi {

    private int nilaiNominalTarik;

    private User userAsal, userTujuan;

    public TarikTunai(int nominalTarik, User asal, User tujuan){
        this.nilaiNominalTarik = nominalTarik;
        this.userAsal = asal;
        this.userTujuan = tujuan;

    }

    @Override
    public int getNilaiNominal(){
        return nilaiNominalTarik;
    }

    public User getUserAsal(){
        return userAsal;
    }

    public User getUserTujuan() {
        return userTujuan;
    }
}