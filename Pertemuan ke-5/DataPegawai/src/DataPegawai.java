public class DataPegawai {
    String nama, nip;

    public DataPegawai(){
    }
    public DataPegawai(String name, String nip){
        this.nama = name;
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void data(){
        System.out.println("Nama: "+nama);
        System.out.println("NIP: "+nip);
        System.out.println();
    }
}
