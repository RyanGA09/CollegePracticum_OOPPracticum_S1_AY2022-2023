public class Kinerja {
    public void kinerja() {
        System.out.println("Tugas Asistensi Pertemuan Ke-7");

        //input Data Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        Tutor tutor = new Tutor();
        mahasiswa.create("Ryan", "Raya mastrip 177", "085109257770", 7467, "ryanga");
        mahasiswa.create("Mutiara", "Pondok Maritim", "03707458392", 9869, "mdsq");
        tutor.create("Arif", "Griya taman Asri", "038058472", 1543, "rif");
        tutor.create("Ferdinand", "Royal Residence", "03859273", 1653, "frdnd");
        mahasiswa.read();
        tutor.read();

        //cek & method Delete
        mahasiswa.delete(5939);
        mahasiswa.delete(9869);
        tutor.delete(1653);
        tutor.delete(1837);

        //tes login
        int npm = mahasiswa.login(9869, "mdsq");
        int npm1 = mahasiswa.login(7467,"ryanga");
        int nip = tutor.login(1653, "frdnd");
        int nip1 = tutor.login(1543, "rif");

    }
}