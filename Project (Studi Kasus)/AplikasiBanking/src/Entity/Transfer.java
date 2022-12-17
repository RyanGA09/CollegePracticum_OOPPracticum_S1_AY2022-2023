package Entity;

import Entity.Mother.Transaksi;

public class Transfer extends Transaksi {

    private int nilaiNominalTransfer;
    private User userAsal, userTujuan;

    public Transfer(int nominal, User asal, User tujuan){
        this.nilaiNominalTransfer = nominal;
        this.userAsal = asal;
        this.userTujuan = tujuan;
    }

    @Override
    public int getNilaiNominal(){
        return nilaiNominalTransfer;
    }

    public User getUserAsal(){
        return userAsal;
    }

    public User getUserTujuan(){
        return userTujuan;
    }
}