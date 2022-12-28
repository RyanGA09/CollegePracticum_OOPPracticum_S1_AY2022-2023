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

    @Override
    public void kegiatan1() {
        System.out.print(", memiliki cakar "+cakar1+" sedang mencakar");
    }

    @Override
    public void kegiatan2() {
        System.out.print(", memiliki cakar "+cakar2+" sedang mencakar");
    }

    @Override
    public void sifat() {
        System.out.print(", dan memiliki ekor "+ekor1+" sedang mengibas");
    }

    @Override
    public void gerakan1() {
        System.out.print(" dengan kaki "+kaki1+" sedang berjalan");
    }

    @Override
    public void gerakan2() {
        System.out.print(" dengan kaki "+kaki2+" Sedang berjalan");
    }
}
