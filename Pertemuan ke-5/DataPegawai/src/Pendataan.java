import java.util.ArrayList;

public class Pendataan {
    static ArrayList<DataPegawai> data = new ArrayList<>();

    public static void initial(){
        DataPegawai pegawai = new DataPegawai("Noname", "null");
        data.add(pegawai);
//        data.add(new DataPegawai("Noname", "Null"));
    }

    public static void cekData(){
        for (DataPegawai jumlah : data){
            System.out.println("===================");
            System.out.println("nama: "+jumlah.getNama());
            System.out.println("NIP: "+jumlah.getNip());
            System.out.println("===================");
        }
    }

    public static void add(String nama, String nip){
        DataPegawai nilaiData = new DataPegawai(nama, nip);
        data.add(nilaiData);
    }

    public static DataPegawai search(String nip){
        for(DataPegawai jumlah: data){
            if(jumlah.getNip().equals(nip)){
                return jumlah;
            }
        }
        return null;
    }

    public static int index(DataPegawai nilaiData){
        int indexData = data.indexOf(nilaiData);
        return indexData;
    }

    public static void edit(String nip, String newName, String newNip){
        DataPegawai searchpegawai = search(nip);
        if (searchpegawai != null) {
            int index = index(searchpegawai);
            data.get(index).setNama(newName);
            data.get(index).setNip(newNip);
            System.out.println("Data diperbarui!!!");
        }
        else{
            System.out.println("NIP tidak ditemukan!!!");
        }
    }

    public static void delete(String nip){
        DataPegawai searchPegawai =  search(nip);

        if(searchPegawai != null){
            data.remove(searchPegawai);
        }
    }
}
