public class Transfer extends Transaksi {
    private int nilaiNominal;
    private User userAsal;
    private User userTujuan;

    public Transfer(int nominal, User userAsal, User userTujuan) {
        this.nilaiNominal = nominal;
        this.userAsal = userAsal;
        this.userTujuan = userTujuan;
    }

    @Override
    public int getnilaiNominal() {
        return nilaiNominal;
    }

    public User getUserAsal() {
        return userAsal;
    }

    public User getUserTujuan() {
        return userTujuan;
    }
}