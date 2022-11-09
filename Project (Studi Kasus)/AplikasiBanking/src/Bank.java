import java.util.ArrayList;

public class Bank {
    static ArrayList<User> userTerdaftar = new ArrayList<User>();

//  static User userTerdaftar = null;

//    public static User getUserTerdaftar(){
//        return userTerdaftar;
//    }

    public static boolean tambahUser(User akunBaru, Rekening rekening){
        if(userTerdaftar.size() != 0){
            for (User pengguna: userTerdaftar){
                if ((pengguna.nik.equals(akunBaru.nik)) || (pengguna.noTelpon.equals(akunBaru.noTelpon))){
                    return false;
                }
            }
        }
        akunBaru.buatRekening(rekening);
        userTerdaftar.add(akunBaru);
        return true;
    }

    public static void setorTunai(){
    }

    public static void tarikTunai(){
    }

    public static void transfer(){
    }
}