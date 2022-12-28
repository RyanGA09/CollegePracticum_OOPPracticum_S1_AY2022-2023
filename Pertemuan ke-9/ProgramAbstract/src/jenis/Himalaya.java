package jenis;
import jenis.mother.Kucing;

public class Himalaya extends Kucing {

    public Himalaya(String nama){
        super(nama);
    }

    public void kucing(){
        System.out.print("Ini adalah kucing berjenis Himalaya yang bernama "+nama);
    }
}
