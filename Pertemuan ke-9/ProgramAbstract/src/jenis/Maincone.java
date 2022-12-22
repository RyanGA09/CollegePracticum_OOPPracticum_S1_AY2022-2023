package jenis;
import jenis.mother.Kucing;

public class Maincone extends Kucing {

    public Maincone(String nama){
        super(nama);
    }

    public void kucing(){
        System.out.println("Ini adalah kucing berjenis Maincone yang bernama "+nama+" dengan kaki "+kaki1+", kuku "+cakar2+", dan ekor "+ekor2);
    }
}