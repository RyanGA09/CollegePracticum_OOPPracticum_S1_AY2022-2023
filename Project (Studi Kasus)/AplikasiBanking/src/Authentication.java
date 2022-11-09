import java.util.ArrayList;

public class Authentication {
    static User userLogged = null;

    public static void initialUser(){
        User user = new User("Test", "123456789", "081", "user", "123");
        String noRekening = RandomNumberString.getNumeric(6);
        Rekening rekening = new Rekening(noRekening, "123456");
        Bank.tambahUser(user, rekening);
    }

    public static boolean login(String username, String kodeAkses){
        if (Bank.userTerdaftar.size() != 0) {
            for (User pengguna: Bank.userTerdaftar){
                if ((pengguna.username.equals(username)) && (pengguna.kodeAkses.equals(kodeAkses))) {
                    userLogged = pengguna;
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean register(String namaLengkap,String nik,String noTelpon,String username,String kodeAkses,String pin){
        User userBaru = new User(namaLengkap, nik, noTelpon, username, kodeAkses);

        String noRekening = RandomNumberString.getNumeric(6);
        Rekening rekening = new Rekening(noRekening, pin);

        return Bank.tambahUser(userBaru, rekening);
    }

    public static boolean verifPin(String pin){
        return userLogged.rekening.pin.equals(pin);
    }

    public static void cariRekening(String rekening){
    }

    public static void logOut(){
        userLogged = null;
    }
}