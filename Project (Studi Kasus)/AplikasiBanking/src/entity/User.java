package entity;

public class User{

    private String fullname, noTelpon, nik, username, kodeAkses, email;
    private Rekening rekening;

    public User (String email, String nama, String nik, String phone, String username, String kode){
        this.email = email;
        fullname = nama;
        this.nik = nik;
        noTelpon = phone;
        this.username = username;
        kodeAkses = kode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getFullname(){
        return fullname;
    }

    public String getNik(){
        return nik;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }

    public String getNoTelpon(){
        return noTelpon;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public String getKodeAkses(){
        return kodeAkses;
    }

    public Rekening getRekening(){
        return rekening;
    }

    public void buatRekening(Rekening rekening){
        this.rekening = rekening;
    }
}