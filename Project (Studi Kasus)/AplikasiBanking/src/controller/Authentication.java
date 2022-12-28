package controller;

import entity.User;
import model.Modelling;
import entity.Rekening;
//import view.cli.HomePage;
import view.cli.CliMainMenuPage;

import java.util.ArrayList;

public class Authentication{

    private static ArrayList<User> userTerdaftar = new ArrayList<>();

    public static ArrayList<User> getUserTerdaftar(){
        return userTerdaftar;
    }

    public static void editEmail(/*String email,*/ String emailBaru){
//        for (int perulangan = 0; perulangan < userTerdaftar.size(); perulangan++) {
//            if (userTerdaftar.get(perulangan).getEmail().equals(email)) {
//                userTerdaftar.get(perulangan).setEmail(emailBaru);
//            }
//        }
        Modelling.getuserMasuk().setEmail(emailBaru);
        new CliMainMenuPage();
    }
    public static void editNoTelpon(/*String noTelpon,*/ String noTelponBaru){
//        for (int perulangan = 0; perulangan < userTerdaftar.size(); perulangan++) {
//            if (userTerdaftar.get(perulangan).getNoTelpon().equals(noTelpon)) {
//                userTerdaftar.get(perulangan).setNoTelpon(noTelponBaru);
//            }
//        }
        Modelling.getuserMasuk().setNoTelpon(noTelponBaru);
        new CliMainMenuPage();
    }

    public static void editUsername(/*String username,*/ String usernameBaru){
//        for (int perulangan = 0; perulangan < userTerdaftar.size(); perulangan++) {
//            if (userTerdaftar.get(perulangan).getUsername().equals(username)) {
//                userTerdaftar.get(perulangan).setUsername(usernameBaru);
//            }
//        }
        Modelling.getuserMasuk().setUsername(usernameBaru);
        new CliMainMenuPage();
    }

    public static void editKodeAkses(/*String pass,*/ String passBaru){
//        for (int perulangan = 0; perulangan < userTerdaftar.size(); perulangan++) {
//            if (userTerdaftar.get(perulangan).getUsername().equals(pass)) {
//                userTerdaftar.get(perulangan).setUsername(passBaru);
//            }
//        }
        Modelling.getuserMasuk().setKodeAkses(passBaru);
        new CliMainMenuPage();
    }

    public static void tambahUser(User akunBaru, Rekening rekening){
        if(userTerdaftar.size() != 0){
            for (User pengguna: userTerdaftar){
                if ((pengguna.getNik().equals(akunBaru.getNik())) || (pengguna.getNoTelpon().equals(akunBaru.getNoTelpon()))){
                    return;
                }
            }
        }
        akunBaru.buatRekening(rekening);
        userTerdaftar.add(akunBaru);
    }

    public static boolean login(String username, String kodeAkses){
        if (Authentication.getUserTerdaftar().size() != 0){
            for (User pengguna: Authentication.getUserTerdaftar()){
                if ((pengguna.getUsername().equals(username)) && (pengguna.getKodeAkses().equals(kodeAkses))) {
                    Modelling.setUserMasuk(pengguna);
                    return true;
                }
            }
        }
        return false;
    }

    public static User cariRekening(String rekening){
        for (User pengguna : Authentication.getUserTerdaftar()){
            if (pengguna.getRekening().getNoRekening().equals(rekening)){
                return pengguna;
            }
        }
        return null;
    }
}