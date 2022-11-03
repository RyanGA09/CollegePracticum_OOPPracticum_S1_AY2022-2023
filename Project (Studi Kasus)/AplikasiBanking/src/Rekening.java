public class Rekening
{
    String nomorRekening, pin;
    Saldo nilaiSaldo = new Saldo();

    public Rekening(String nomor, String pin) {
        nomorRekening = nomor;
        this.pin = pin;
    }

    public void dataRekening(){
        nilaiSaldo.dataSaldo();
        System.out.println("Nomor Rekening: "+nomorRekening);
        System.out.println("Pin Rekening: "+pin);
    }
}