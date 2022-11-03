public class User {
    int idUser;
    String fullname, noTelpon, ttl, nik, username, kodeAkses;
    Rekening rekening;

    public User (String nama, String nik, String phone, String username, String kode) {
        fullname = nama;
        this.nik = nik;
        noTelpon = phone;
        this.username = username;
        kodeAkses = kode;
    }

    public void buatRekening(Rekening rekening){
        this.rekening = rekening;
    }
}