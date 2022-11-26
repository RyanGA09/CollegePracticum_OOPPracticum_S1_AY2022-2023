import java.util.ArrayList;
public class Akademik {
    ArrayList<Mahasiswa> data = new ArrayList<>();

    public void add(String nama, String nip){
        Mahasiswa dataMahasiswa = new Mahasiswa(nama, nip);
        data.add(dataMahasiswa);
    }

    public Mahasiswa findMahasiswabyName(String nama){
        for (Mahasiswa mahasiswa: data){
            if (mahasiswa.getNama().equals(nama)){
                return mahasiswa;
            }
        }
        return null;
    }

    public Mahasiswa findMahasiswabyNpm(String npm){
        for (Mahasiswa mahasiswa: data){
            if (mahasiswa.getNpm().equals(npm)){
                return mahasiswa;
            }
        }
        return null;
    }

    public ArrayList<Mahasiswa> filterMahasiswabyName(String filternama){
        ArrayList<Mahasiswa> foundmahasiswa = new ArrayList<>();

        for(Mahasiswa mahasiswa: data){
            if (mahasiswa.getNama().contains(filternama)){
                foundmahasiswa.add(mahasiswa);
            }
        }
        return foundmahasiswa;
    }

    public ArrayList<Mahasiswa> filterMahasiswabyNpm(String filternpm){
        ArrayList<Mahasiswa> foundmahasiswa = new ArrayList<>();

        for (Mahasiswa mahasiswa: data){
            if (mahasiswa.getNpm().contains(filternpm)){
                foundmahasiswa.add(mahasiswa);
            }
        }
        return foundmahasiswa;
    }
}
