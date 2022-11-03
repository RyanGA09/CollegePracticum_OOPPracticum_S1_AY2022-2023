public class DataPegawai {
    String nama, kelamin, alamat;
    int nip;
    Kendaraan kendaraan;

    public DataPegawai(){
    }

    public DataPegawai(String nama, int nip, String kelamin, String alamat){
        this.nama = nama;
        this.nip = nip;
        this.kelamin = kelamin;
        this.alamat = alamat;
    }

    public DataPegawai(String nama, int nip, String kelamin, String alamat, Kendaraan kendaraan){
        this.nama = nama;
        this.nip = nip;
        this.kelamin = kelamin;
        this.alamat = alamat;
        this.kendaraan = kendaraan;
    }

    public void beliKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void printData(){
        System.out.println("Nama: "+nama);
        System.out.println("NIP: "+nip);
        System.out.println("Kelamin: "+kelamin);

        if (kendaraan != null){
            kendaraan.cetakData();
        }
        else {
            System.out.println("Kendaraan: Tidak memiliki Kendaraan");
        }
        System.out.println();
    }
}
