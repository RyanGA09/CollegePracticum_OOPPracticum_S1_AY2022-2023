public class Transfer extends Transaksi{
    int nominal;
    User userAsal, userTujuan;
    public Transfer(int nominal, User userAsal, User userTujuan, String jenisTransaksi, String nominalTransaksi, String totalBayar){
        this.nominal = nominal;
        this.userAsal = userAsal;
        this.userTujuan = userTujuan;
        super.jenisTransaksi = jenisTransaksi;
        super.nominalTransaksi = nominalTransaksi;
        super.totalBayar = totalBayar;
    }
}