public class Saldo
{
    int jumlahSaldo = 0;

    public void tambahSaldo(int nilai){
        jumlahSaldo += nilai;
    }

    public void ambilSaldo(int nilai){
        jumlahSaldo -= nilai;
    }

    public void dataSaldo(){
        System.out.println("Jumlah Saldo = "+jumlahSaldo);
    }
}