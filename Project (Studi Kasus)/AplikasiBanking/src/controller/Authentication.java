package controller;

import entity.User;
import model.Modelling;
import entity.Rekening;

public class Authentication{

    public String editEmail(String emailBaru){
        Modelling.getuserMasuk().setEmail(emailBaru);
        return emailBaru;
    }

    public String editUsername(String usernameBaru){
        Modelling.getuserMasuk().setUsername(usernameBaru);
        return usernameBaru;
    }

    public String editKodeAkses(String passBaru){
        Modelling.getuserMasuk().setKodeAkses(passBaru);
        return passBaru;
    }

    public boolean tambahUser(User akunBaru, Rekening rekening){
        if(Modelling.getUserTerdaftar().size() != 0){
            for (User pengguna: Modelling.getUserTerdaftar()){
                if ((pengguna.getNik().equals(akunBaru.getNik())) || (pengguna.getNoTelpon().equals(akunBaru.getNoTelpon())) || (pengguna.getUsername().equals(akunBaru.getUsername()))){
                    return false;
                }
            }
        }
        akunBaru.buatRekening(rekening);
        Modelling.getUserTerdaftar().add(akunBaru);
        return true;
    }

    public boolean login(String username, String kodeAkses){
        if (Modelling.getUserTerdaftar().size() != 0){
            for (User pengguna: Modelling.userTerdaftar){
                if ((pengguna.getUsername().equals(username)) && (pengguna.getKodeAkses().equals(kodeAkses))) {
                    Modelling.setUserMasuk(pengguna);
                    return true;
                }
            }
        }
        return false;
    }

    public User cariRekening(String rekening){
        for (User pengguna : Modelling.getUserTerdaftar()){
            if (pengguna.getRekening().getNoRekening().equals(rekening)){
                return pengguna;
            }
        }
        return null;
    }
}