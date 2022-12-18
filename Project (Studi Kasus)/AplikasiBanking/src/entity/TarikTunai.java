package entity;

import entity.Mother.Transaksi;

public class TarikTunai extends Transaksi {

    private int nilaiNominalTarik;

    public TarikTunai(int nominalTarik){
        this.nilaiNominalTarik = nominalTarik;
    }

    @Override
    public int getNilaiNominal(){
        return nilaiNominalTarik;
    }
}