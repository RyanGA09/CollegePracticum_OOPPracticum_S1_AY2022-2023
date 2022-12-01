import java.util.ArrayList;

public class Tutor{
    private ArrayList<DataTutor> tutor;

    public Tutor(){
        tutor = new ArrayList<>();
    }
    private int search(int npm)
    {
        for (int baris = 0; baris < this.tutor.size(); baris++)
        {
            if (npm == this.tutor.get(baris).getNip())
            {
                return baris;
            }
        }
        return -1;
    }


    public void read()
    {
        System.out.println("==== DATA Tutor Pendidik ====");
        for (DataTutor value : this.tutor) {
            value.cetak();
        }
    }


    public void create(String nama, String alamat, int noTelepon, int nip, String password)
    {
        this.tutor.add(new DataTutor(nama, alamat, noTelepon, nip, password));
    }


    public int cekLogin(int npm, String pass)
    {
        for (DataTutor value : this.tutor) {
            if (npm == value.getNip()) {
                if (pass.equals(value.getPassword())) {
                    return value.getNip();
                }
            }
        }
        return -1;
    }
    public int login(int npm, String pass)
    {
        int npmMahasiswa = this.cekLogin(npm,pass);
        if (npmMahasiswa == -1)
        {
            System.out.println("NIP "+npm +" login gagal");
        }
        else
        {
            System.out.println("NIP "+npm +" login berhasil");
        }
        System.out.println("-----------------------------");
        return npmMahasiswa;
    }

    public void delete(int npm)
    {
        int index = this.search(npm);
        if (index == -1)
        {
            System.out.println("data tidak ditemukan");
        }
        else
        {
            this.tutor.remove(index);
            System.out.println("data dengan NIP "+index +" berhasil dihapus");
        }
        System.out.println("-----------------------------");
    }
}