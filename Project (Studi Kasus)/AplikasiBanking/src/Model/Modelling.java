package Model;

import Controller.Bank;
import Entity.Rekening;
import Entity.SetorTunai;
import Entity.User;

public class Modelling {

    static User userMasuk = null;

    public static void initialUser(){
        User pengguna = new User("Test 1", "123456", "0811", "user1", "123");
        Bank.tambahUser(pengguna, new Rekening("123456", "123"));
        Bank.setorTunai(pengguna, new SetorTunai(1000000));
        User pengguna2 = new User("Test 2", "654321", "08122", "user2", "321");
        Bank.tambahUser(pengguna2, new Rekening("654321", "321"));
    }

    public static void setUserMasuk(User userMasuk) {
        Modelling.userMasuk = userMasuk;
    }

    public static User getuserMasuk(){
        return userMasuk;
    }
}
