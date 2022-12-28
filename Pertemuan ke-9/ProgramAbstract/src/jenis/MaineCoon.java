package jenis;
import jenis.mother.Kucing;

public class MaineCoon extends Kucing {

    public MaineCoon(String nama){
        super(nama);
    }

    public void kucing(){
        System.out.print("Ini adalah kucing berjenis Maincone yang bernama "+nama);
    }
}