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

    public static void setorTunai(User pengguna, Transaksi transaksi){
        pengguna.getRekening().tambahTransaksi(transaksi);
        pengguna.getRekening().tambahSaldo(transaksi.getNominal());
    }

    public static boolean tarikTunai(User pengguna, Transaksi transaksi){
        boolean status = pengguna.getRekening().ambilSaldo(transaksi.getNominal());
        if (status) {
            pengguna.getRekening().tambahTransaksi(transaksi);
        }
        return status;
    }

    public static boolean transfer(){
        Transfer transfer = (Transfer) transaksi;
        User userAsal = transfer.getUserAsal();
        User userTujuan = transfer.getUserTujuan();

        for (User akunTujuan : users) {
            if (akunTujuan.getIdUser() == userTujuan.getIdUser()) {
                userTujuan.getRekening().tambahTransaksi(transfer);
                userTujuan.getRekening().tambahSaldo(transfer.getNominal());

                userAsal.getRekening().tambahTransaksi(transfer);
                userAsal.getRekening().ambilSaldo(transfer.getNominal());
                return true;
            }
        }
        return false;
    }

    public static int cekSaldo(User pengguna) {
        return pengguna.getRekening().getSaldo();
    }
}
