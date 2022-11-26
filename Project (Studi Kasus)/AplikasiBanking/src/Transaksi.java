public class Transaksi
{
    protected String jenisTransaksi, nominalTransaksi, totalBayar, tanggalTransaksi;
    public Transaksi(){
    }
    public Transaksi(String jenis, String nominal, String total){
        jenisTransaksi = jenis;
        nominalTransaksi = nominal;
        totalBayar = total;
        tanggalTransaksi = DateString.now();
    }

    public void dataTransaksi(){
        System.out.println("Jenis Transaksi: "+jenisTransaksi);
        System.out.println("Tanggal Transaksi: "+tanggalTransaksi);
        System.out.println("Nominal Transaksi: "+nominalTransaksi);
    }
}