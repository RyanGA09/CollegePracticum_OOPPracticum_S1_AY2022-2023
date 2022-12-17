package Entity;

import Entity.Mother.Saldo;
import Entity.Mother.Transaksi;

import java.util.ArrayList;

public class Rekening extends Saldo {

    private String nomorRekening;
    private String pin;
    private ArrayList<Transaksi> mutasi = new ArrayList<>();

    public Rekening(String nomorRekening, String pin) {
        this.nomorRekening = nomorRekening;
        this.pin = pin;
    }

    public String getNoRekening() {
        return nomorRekening;
    }

    public String getPin() {
        return pin;
    }

    public ArrayList<Transaksi> getMutasi() {
        return mutasi;
    }

    public void tambahTransaksi(Transaksi transaksi) {
        mutasi.add(transaksi);
    }
}