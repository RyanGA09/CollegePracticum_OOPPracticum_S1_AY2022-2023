package Model;

import Controller.Authentication;
import Controller.Bank;
import Entity.Rekening;
import Entity.SetorTunai;
import Entity.User;
import Utils.RandomNumberString;

public class Modelling {

    static User userMasuk = null;

    public static void initialUser(){
        User pengguna = new User("TestUser1","Test 1", "123456", "0811", "user1", "123");
        Authentication.tambahUser(pengguna, new Rekening("123456", "123"));
        Bank.setorTunai(pengguna, new SetorTunai(1000000));
        User pengguna2 = new User("TestUser2","Test 2", "654321", "08122", "user2", "321");
        Authentication.tambahUser(pengguna2, new Rekening("654321", "321"));
    }

    public static void setUserMasuk(User userMasuk) {
        Modelling.userMasuk = userMasuk;
    }

    public static User getuserMasuk(){
        return userMasuk;
    }

    public static boolean verifikasiPin(String pin){
        return Modelling.getuserMasuk().getRekening().getPin().equals(pin);
    }

    public static void register(String akun, String namaLengkap,String nik,String noTelpon,String username,String kodeAkses,String pin){
        User userBaru = new User(akun, namaLengkap, nik, noTelpon, username, kodeAkses);
        String noRekening = RandomNumberString.getNumeric(6);
        Rekening rekening = new Rekening(noRekening, pin);
        Authentication.tambahUser(userBaru, rekening);
    }
}
