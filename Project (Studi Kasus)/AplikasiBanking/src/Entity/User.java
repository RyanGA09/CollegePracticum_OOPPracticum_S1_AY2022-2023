package Entity;

public class User {
    private int idUser;
    private String fullname, noTelpon, nik, username, kodeAkses;
    private Rekening rekening;

    public User (String nama, String nik, String phone, String username, String kode) {
        fullname = nama;
        this.nik = nik;
        noTelpon = phone;
        this.username = username;
        kodeAkses = kode;
    }

    public String getFullname() {
        return fullname;
    }

    public String getNik() {
        return nik;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public String getUsername() {
        return username;
    }

    public String getKodeAkses() {
        return kodeAkses;
    }

    public Rekening getRekening() {
        return rekening;
    }

    public int getIdUser() {
        return idUser;
    }

    public void buatRekening(Rekening rekening){
        this.rekening = rekening;
    }
}