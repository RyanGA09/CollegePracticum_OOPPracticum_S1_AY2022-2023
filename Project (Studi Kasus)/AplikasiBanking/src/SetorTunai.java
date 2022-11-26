public class SetorTunai extends Transaksi {
    int nominalSetor;
    public SetorTunai(int nominalSetor, String jenisTransaksi, String nominalTransaksi, String totalBayar){
        this.nominalSetor = nominalSetor;
        super.jenisTransaksi = jenisTransaksi;
        super.nominalTransaksi = nominalTransaksi;
        super.totalBayar = totalBayar;
    }
}