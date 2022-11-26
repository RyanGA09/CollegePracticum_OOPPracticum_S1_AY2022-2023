public class TarikTunai extends Transaksi{
    int nominalTarik;
    public TarikTunai(int nominalTarik, String jenisTransaksi, String nominalTransaksi, String totalBayar){
        this.nominalTarik = nominalTarik;
        super.jenisTransaksi = jenisTransaksi;
        super.nominalTransaksi = nominalTransaksi;
        super.totalBayar = totalBayar;
    }
}