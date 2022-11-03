public class Mahasiswa {
    String namaLengkap,  npm;
    char kelamin;
    int semester;

    public Mahasiswa (String nama, String npm, char kelamin, int semester){
        namaLengkap = nama;
        this.npm = npm;
        this.kelamin = kelamin;
        this.semester = semester;
    }

    public void cetak() {
        System.out.println("Nama Lengkap: "+namaLengkap);
        System.out.println("NPM: "+npm);
        System.out.println("Kelamin: "+kelamin);
        System.out.println("Semester: "+semester);
    }
}
