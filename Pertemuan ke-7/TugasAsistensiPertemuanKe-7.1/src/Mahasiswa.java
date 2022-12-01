import java.util.ArrayList;

public class Mahasiswa{
    private ArrayList<DataMahasiswa> mahasiswa;

    public Mahasiswa(){
        mahasiswa = new ArrayList<>();
    }
    private int search(int npm)
    {
        for (int baris = 0; baris < this.mahasiswa.size(); baris++)
        {
            if (npm == this.mahasiswa.get(baris).getNpm())
            {
                return baris;
            }
        }
        return -1;
    }


    public void read()
    {
        System.out.println("==== DATA Mahasiswa ====");
        for (DataMahasiswa value : this.mahasiswa) {
            value.cetak();
        }
    }


    public void create(String nama, String alamat, int noTelepon, int npm, String password)
    {
        this.mahasiswa.add(new DataMahasiswa(nama, alamat, noTelepon, npm, password));
    }


    public int cekLogin(int npm, String pass)
    {
        for (DataMahasiswa value : this.mahasiswa) {
            if (npm == value.getNpm()) {
                if (pass.equals(value.getPassword())) {
                    return value.getNpm();
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
            System.out.println("NPM "+npm +" login gagal");
        }
        else
        {
            System.out.println("NPM "+npm +" login berhasil");
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
            this.mahasiswa.remove(index);
            System.out.println("data dengan NPM "+index +" berhasil dihapus");
        }
        System.out.println("-----------------------------");
    }
}