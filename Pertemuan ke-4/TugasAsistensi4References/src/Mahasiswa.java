public class Mahasiswa {
    String nama, npm;
    char kelamin;
    Laptop laptop;

    public Mahasiswa(){
    }

    public Mahasiswa(String nama, String npm, char kelamin){
        this.nama = nama;
        this.npm = npm;
        this.kelamin = kelamin;
    }

    public Mahasiswa(String nama,String npm, char kelamin, Laptop laptop){
        this. nama = nama;
        this.npm = npm;
        this.kelamin = kelamin;
        this.laptop = laptop;
    }

    public void beliLaptop(Laptop laptop){
        this.laptop = laptop;
    }

    public void lihatData(){
        System.out.println("nama: "+nama);
        System.out.println("NPM: "+npm);
        System.out.println("Kelamin: "+kelamin);

        if (laptop != null){
            laptop.lihatData();
        }
        else{
            System.out.println("Laptop: Tidak punya laptop");
        }
        System.out.println();
    }
}
