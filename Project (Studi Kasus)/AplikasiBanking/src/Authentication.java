public class Authentication {
    static User userLogged = null;

    public static void initialUser(){
        User user = new User("Test", "123456789", "081", "user", "123");
        String noRekening = RandomNumberString.getNumeric(6);
        Rekening rekening = new Rekening(noRekening, "123456");
        Bank.tambahUser(user, rekening);
    }

    public static boolean login(String username, String kodeAkses){
        if ((Bank.getUserTerdaftar().username.equals(username)) && (Bank.getUserTerdaftar().kodeAkses.equals(kodeAkses))){
            userLogged = Bank.getUserTerdaftar();
            return true;
        }
        else {
            return false;
        }
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