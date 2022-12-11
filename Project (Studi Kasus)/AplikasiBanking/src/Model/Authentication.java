package Model;

import Entity.SetorTunai;
import Entity.User;
import Utils.RandomNumberString;
import Entity.Rekening;
import Controller.Bank;
import View.HomePage;
import View.MainPage;

public class Authentication {

    static User userLogged = null;

    public static void initialUser(){
        User pengguna = new User("Test 1", "123456", "0811", "user1", "123");
        Bank.tambahUser(pengguna, new Rekening("123456", "123"));
        Bank.setorTunai(pengguna, new SetorTunai(1000000));
        User pengguna2 = new User("Test 2", "654321", "08122", "user2", "321");
        Bank.tambahUser(pengguna2, new Rekening("654321", "321"));
    }

    public static User getUserLogged() {
        return userLogged;
    }

    public static void register(String namaLengkap,String nik,String noTelpon,String username,String kodeAkses,String pin){
        User userBaru = new User(namaLengkap, nik, noTelpon, username, kodeAkses);

        String noRekening = RandomNumberString.getNumeric(6);
        Rekening rekening = new Rekening(noRekening, pin);
        Bank.tambahUser(userBaru, rekening);
    }

    public static boolean login(String username, String kodeAkses){
        if (Bank.getUserTerdaftar().size() != 0) {
            for (User pengguna: Bank.getUserTerdaftar()){
                if ((pengguna.getUsername().equals(username)) && (pengguna.getKodeAkses().equals(kodeAkses))) {
                    userLogged = pengguna;
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean verifPin(String pin){
        return userLogged.getRekening().getPin().equals(pin);
    }

    public static User cariRekening(String rekening){
        for (User pengguna : Bank.getUserTerdaftar()) {
            if (pengguna.getRekening().getNoRekening().equals(rekening)) {
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
            userLogged = null;
        }
        else if (pilihan == 'N' || pilihan == 'n'){
            new HomePage();
        }
    }
}