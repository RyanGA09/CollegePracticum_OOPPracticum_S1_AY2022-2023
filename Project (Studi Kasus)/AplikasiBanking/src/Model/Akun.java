package Model;

import Entity.SetorTunai;
import Entity.User;
import Entity.Rekening;
import Controller.Bank;

public class Akun {
    private static User userLogged = null;

    public static void initialUser() {
        User pengguna = new User("Test 1", "123456", "0811", "user1", "123");
        Bank.tambahUser(pengguna, new Rekening("123456", "123"));
        Bank.setorTunai(pengguna, new SetorTunai(1000000));

        User pengguna2 = new User("Test 2", "654321", "08122", "user2", "321");
        Bank.tambahUser(pengguna2, new Rekening("654321", "321"));
    }

    public static User getUserLogged() {
        return userLogged;
    }

    public static boolean login(String username, String kodeAkses) {
        for (User user : Bank.getUserTerdaftar()) {
            if ((user.getUsername().equals(username)) && (user.getKodeAkses().equals(kodeAkses))) {
                userLogged = user;
                return true;
            }
        }
        return false;
    }

    public static boolean verifPin(String pin) {
        return userLogged.getRekening().getPin().equals(pin);
    }

    public static User cariRekening(String rekening) {
        for (User pengguna : Bank.getUserTerdaftar()) {
            if (pengguna.getRekening().getNoRekening().equals(rekening)) {
                return pengguna;
            }
        }
        return null;
    }
}