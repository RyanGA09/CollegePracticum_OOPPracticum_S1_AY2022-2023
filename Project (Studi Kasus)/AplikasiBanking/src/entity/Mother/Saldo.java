package entity.Mother;

public class Saldo{

    int jumlahNilaiSaldo = 0;

    public void tambahSaldo(int nilai){
        jumlahNilaiSaldo += nilai;
    }

    public boolean ambilSaldo(int nilai){
        if (jumlahNilaiSaldo >= nilai){
            jumlahNilaiSaldo -= nilai;
            return true;
        }
        return false;
    }

    public int getSaldo(){
        return jumlahNilaiSaldo;
    }
}