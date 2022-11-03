public class Bank {
    static User userTerdaftar = null;

    public static User getUserTerdaftar(){
        return userTerdaftar;
    }

    public static boolean tambahUser(User akunBaru, Rekening rekening){

        if (userTerdaftar != null){
            if ((userTerdaftar.nik.equals(akunBaru.nik)) || (userTerdaftar.noTelpon.equals(akunBaru.noTelpon))){
                return false;
            }
            else {
                userTerdaftar = akunBaru;
                akunBaru.buatRekening(rekening);
                return true;
            }
        }
        else {
            akunBaru.buatRekening(rekening);
            userTerdaftar = akunBaru;
            return true;
        }
    }

    public static void setorTunai(){
    }

    public static void tarikTunai(){
    }

    public static void transfer(){
    }
}