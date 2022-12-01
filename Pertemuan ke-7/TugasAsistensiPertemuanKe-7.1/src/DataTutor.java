public class DataTutor extends Member {
    protected int nip;
    public int getNip() {
        return nip;
    }
    DataTutor(String nama, String alamat, String noTelepon, int nip, String password) {
        super.nama = nama;
        super.alamat = alamat;
        super.noTelepon = noTelepon;
        this.nip = nip;
        super.password = password;
    }

    public void cetak() {
        System.out.println("Nama       : "+super.nama);
        System.out.println("Alamat     : "+super.alamat);
        System.out.println("No. Telepon: "+super.noTelepon);
        System.out.println("NIP        : "+this.nip);
        System.out.println("Pass       : "+super.password);
        System.out.println("-----------------------------");
    }
}
