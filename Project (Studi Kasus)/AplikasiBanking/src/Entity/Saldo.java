package Entity;

public class Saldo {

    int jumlahSaldo = 0;

    public void tambahSaldo(int nilai){
        jumlahSaldo += nilai;
    }

    public boolean ambilSaldo(int nilai){
        if (jumlahSaldo >= nilai){
            jumlahSaldo -= nilai;
            return true;
        }
        return false;
    }

    public int getSaldo() {
        return jumlahSaldo;
    }
}