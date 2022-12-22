package jenis;
import jenis.mother.Kucing;

public class Himalaya extends Kucing {

    public Himalaya(String nama){
        super(nama);
    }

    public void kucing(){
        System.out.println("Ini adalah kucing berjenis Himalaya yang bernama "+nama+" dengan kaki "+kaki2+", kuku "+cakar1+", dan ekor "+ekor1);
    }
}
