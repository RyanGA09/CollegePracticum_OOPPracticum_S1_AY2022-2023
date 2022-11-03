public class Laptop {
    String merek;
    int ukuranLayar, ram, storageGb;

    public Laptop(){
    }

    public Laptop(String merek){
        this.merek = merek;
        ukuranLayar = 14;
        ram = 4;
        storageGb = 500;
    }

    public Laptop(String merek, int ukuranLayar, int ram, int storageGb){
        this.merek = merek;
        this.ukuranLayar = ukuranLayar;
        this.ram = ram;
        this.storageGb = storageGb;
    }

    public void lihatData(){
        System.out.println("Merek: "+merek);
        System.out.println("Layar: "+ukuranLayar+" inchi");
        System.out.println("Ram: "+ram+" Gb");
        System.out.println("Storage: "+storageGb+" Gb");
    }
}
