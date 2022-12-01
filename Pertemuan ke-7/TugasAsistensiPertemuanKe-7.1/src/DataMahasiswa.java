public class DataMahasiswa extends Member {
    protected int npm;
    public int getNpm() {
        return npm;
    }
    DataMahasiswa(String nama, String alamat, int noTelepon, int npm, String password) {
        super.nama = nama;
        super.alamat = alamat;
        super.noTelepon = noTelepon;
        this.npm = npm;
        super.password = password;
    }

    public void cetak() {
        System.out.println("Nama       : "+super.nama);
        System.out.println("Alamat     : "+super.alamat);
        System.out.println("No. Telepon: "+super.noTelepon);
        System.out.println("NPM        : "+this.npm);
        System.out.println("Pass       : "+super.password);
        System.out.println("-----------------------------");
    }
}
