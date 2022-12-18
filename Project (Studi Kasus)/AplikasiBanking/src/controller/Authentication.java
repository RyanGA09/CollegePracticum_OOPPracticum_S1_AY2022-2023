package controller;

import entity.User;
import model.Modelling;
import entity.Rekening;
import view.HomePage;
import view.MainPage;

import java.util.ArrayList;

public class Authentication{

    private static ArrayList<User> userTerdaftar = new ArrayList<>();

    public static ArrayList<User> getUserTerdaftar(){
        return userTerdaftar;
    }

    public static void editEmail(String email, String emailBaru){
        for (int perulangan = 0; perulangan < userTerdaftar.size(); perulangan++) {
            if (userTerdaftar.get(perulangan).getEmail().equals(email)) {
                userTerdaftar.get(perulangan).setEmail(emailBaru);
            }
        }
        new MainPage();
    }
    public static void editNoTelpon(String noTelpon, String noTelponBaru){
        for (int perulangan = 0; perulangan < userTerdaftar.size(); perulangan++) {
            if (userTerdaftar.get(perulangan).getNoTelpon().equals(noTelpon)) {
                userTerdaftar.get(perulangan).setNoTelpon(noTelponBaru);
            }
        }
        new MainPage();
    }

    public static void editUsername(String username, String usernameBaru){
        for (int perulangan = 0; perulangan < userTerdaftar.size(); perulangan++) {
            if (userTerdaftar.get(perulangan).getUsername().equals(username)) {
                userTerdaftar.get(perulangan).setUsername(usernameBaru);
            }
        }
        new MainPage();
    }

    public static void editPassword(String pass, String passBaru){
        for (int perulangan = 0; perulangan < userTerdaftar.size(); perulangan++) {
            if (userTerdaftar.get(perulangan).getUsername().equals(pass)) {
                userTerdaftar.get(perulangan).setUsername(passBaru);
            }
        }
        new MainPage();
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

    public static void logOut(char pilihan){
        if (pilihan == 'y' || pilihan == 'Y'){
            new HomePage();
        }
        else if (pilihan == 'n' || pilihan == 'N'){
            new MainPage();
        }
    }

    public static void exit(char pilihan){
        if (pilihan == 'Y' || pilihan == 'y'){
            System.out.println("-----Keluar Aplikasi-----");
        }
        else if (pilihan == 'N' || pilihan == 'n'){
            new HomePage();
        }
    }
}