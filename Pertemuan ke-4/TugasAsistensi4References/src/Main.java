public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Ryan", "06.2021.1.07467", 'L');
        mahasiswa1.lihatData();

        Object laptopMhs2 = new Laptop("Asus", 15, 4, 500);
        Laptop laptop = (Laptop) laptopMhs2;
        Object mahasiswa2 = new Mahasiswa("Alex", "06.2021.1.07534", 'L', laptop);
        Mahasiswa mhs2Cast = (Mahasiswa) mahasiswa2;
        mhs2Cast.lihatData();

        mahasiswa1.beliLaptop(new Laptop("Acer"));
        mahasiswa1.lihatData();
    }
}