package controller;

import entity.User;
import model.Modelling;
import entity.Rekening;
//import view.cli.HomePage;
//import view.cli.CliMainMenuPage;

import java.util.ArrayList;

public class Authentication{

    private static ArrayList<User> userTerdaftar = new ArrayList<>();

    public static ArrayList<User> getUserTerdaftar(){
        return userTerdaftar;
    }

    public static String editEmail(/*String email,*/ String emailBaru){
//        for (int perulangan = 0; perulangan < userTerdaftar.size(); perulangan++) {
//            if (userTerdaftar.get(perulangan).getEmail().equals(email)) {
//                userTerdaftar.get(perulangan).setEmail(emailBaru);
//            }
//        }
        Modelling.getuserMasuk().setEmail(emailBaru);
        return emailBaru;
    }
    public static String editNoTelpon(/*String noTelpon,*/ String noTelponBaru){
//        for (int perulangan = 0; perulangan < userTerdaftar.size(); perulangan++) {
//            if (userTerdaftar.get(perulangan).getNoTelpon().equals(noTelpon)) {
//                userTerdaftar.get(perulangan).setNoTelpon(noTelponBaru);
//            }
//        }
        Modelling.getuserMasuk().setNoTelpon(noTelponBaru);
        return noTelponBaru;
    }

    public static String editUsername(/*String username,*/ String usernameBaru){
//        for (int perulangan = 0; perulangan < userTerdaftar.size(); perulangan++) {
//            if (userTerdaftar.get(perulangan).getUsername().equals(username)) {
//                userTerdaftar.get(perulangan).setUsername(usernameBaru);
//            }
//        }
        Modelling.getuserMasuk().setUsername(usernameBaru);
        return usernameBaru;
    }

    public static String editKodeAkses(/*String pass,*/ String passBaru){
//        for (int perulangan = 0; perulangan < userTerdaftar.size(); perulangan++) {
//            if (userTerdaftar.get(perulangan).getUsername().equals(pass)) {
//                userTerdaftar.get(perulangan).setUsername(passBaru);
//            }
//        }
        Modelling.getuserMasuk().setKodeAkses(passBaru);
        return passBaru;
    }

    public static String editPin(String pinBaru){
        Modelling.getRekMasuk().setPin(pinBaru);
        return pinBaru;
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

    public static void gagalTambahUser(User akunAda){
        if(userTerdaftar.size() != 0){
            for (User pengguna: userTerdaftar){
                if((pengguna.getEmail().equals(akunAda.getEmail())) && (pengguna.getNik().equals(akunAda.getNik())) && (pengguna.getNoTelpon().equals(akunAda.getNoTelpon()))){
                    return;
                }
            }
        }
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