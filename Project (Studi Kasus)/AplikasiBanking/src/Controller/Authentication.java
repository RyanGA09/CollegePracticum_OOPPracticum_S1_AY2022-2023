package Controller;

import Entity.User;
import Model.Modelling;
import Utils.RandomNumberString;
import Entity.Rekening;
import View.HomePage;
import View.MainPage;

public class Authentication{

    public static void register(String namaLengkap,String nik,String noTelpon,String username,String kodeAkses,String pin){
        User userBaru = new User(namaLengkap, nik, noTelpon, username, kodeAkses);
        String noRekening = RandomNumberString.getNumeric(6);
        Rekening rekening = new Rekening(noRekening, pin);
        Bank.tambahUser(userBaru, rekening);
    }

    public static boolean login(String username, String kodeAkses){
        if (Bank.getUserTerdaftar().size() != 0){
            for (User pengguna: Bank.getUserTerdaftar()){
                if ((pengguna.getUsername().equals(username)) && (pengguna.getKodeAkses().equals(kodeAkses))) {
                    Modelling.setUserMasuk(pengguna);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean verifikasiPin(String pin){
        return Modelling.getuserMasuk().getRekening().getPin().equals(pin);
    }

    public static User cariRekening(String rekening){
        for (User pengguna : Bank.getUserTerdaftar()){
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
//            Modelling.getuserMasuk() = null;
        }
        else if (pilihan == 'N' || pilihan == 'n'){
            new HomePage();
        }
    }
}