package Entity;

public class SetorTunai extends Transaksi {
    private int nominalSetor;

    public SetorTunai(int nominalSetor) {
        this.nominalSetor = nominalSetor;
    }

    @Override
    public int getNilaiNominal() {
        return nominalSetor;
    }
}