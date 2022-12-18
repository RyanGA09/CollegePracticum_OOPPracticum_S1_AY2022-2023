package entity;

import entity.Mother.Transaksi;

public class SetorTunai extends Transaksi {

    private int nilaiNominalSetor;

    public SetorTunai(int nominalSetor){
        this.nilaiNominalSetor = nominalSetor;
    }

    @Override
    public int getNilaiNominal(){
        return nilaiNominalSetor;
    }
}