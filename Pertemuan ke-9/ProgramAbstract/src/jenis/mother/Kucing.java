package jenis.mother;

import fisik.Cakar;
import fisik.Ekor;
import fisik.Kaki;

public abstract class Kucing implements Cakar, Ekor, Kaki {
    protected String nama;

    public Kucing(){
    }

    public Kucing(String nama){
        this.nama = nama;
    }
}
