package entity;

import entity.abstraction.Transaksi;

public class SetorTunai extends Transaksi {

    private int nilaiNominalSetor;

    private User userAsal, userTujuan;

    public SetorTunai(int nominalSetor, User asal, User tujuan){
        this.nilaiNominalSetor = nominalSetor;
        this.userAsal = asal;
        this.userTujuan = tujuan;
    }

    @Override
    public int getNilaiNominal(){
        return nilaiNominalSetor;
    }

    public User getUserAsal(){
        return userAsal;
    }

    public User getUserTujuan() {
        return userTujuan;
    }
}